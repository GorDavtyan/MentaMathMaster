package mentalMathMaster;

import java.util.Random;

public class ArithmeticUtils {

    private int num1;
    private int num2;
    private char arithmeticOperator;

    /**
     * Generates a random arithmetic operator (+, -, *, /).
     * Sets the value of the arithmeticOperator field based on the generated operator.
     */
    public void generatingRandomSymbol() {
        Random random = new Random();
        int symbol = random.nextInt(4);
        switch (symbol) {
            case 0 -> arithmeticOperator = '+';
            case 1 -> arithmeticOperator = '-';
            case 2 -> arithmeticOperator = '*';
            case 3 -> arithmeticOperator = '/';
            default -> System.out.println("We do not perform an operation with such an operator");
        }
        System.out.println(arithmeticOperator);
    }

    /**
     * Generates random numbers based on the arithmetic operator.
     * Sets the values of the num1 and num2 fields.
     */
    public void generateNumbers() {
        Random random = new Random();
        if (arithmeticOperator == '*') {
            num1 = random.nextInt(9);
            num2 = random.nextInt(30);
        } else if (arithmeticOperator == '/') {
            while (!(num1 / num2 > 0)) {
                num1 = random.nextInt(30);
                num2 = random.nextInt(29) + 1;
            }
        } else {
            num1 = random.nextInt(30);
            num2 = random.nextInt(30);
        }
    }

    /**
     * Calculates the result of the arithmetic expression based on the arithmetic operator.
     *
     * @return the result of the arithmetic expression
     */
    public int result() {
        int res = 0;
        switch (arithmeticOperator) {
            case '+' -> res = num1 + num2;
            case '-' -> res = num1 - num2;
            case '*' -> res = num1 * num2;
            case '/' -> res = num1 / num2;
            default -> System.out.println("Invalid operator");
        }
        return res;
    }

    /**
     * Returns the value of the first randomly generated number.
     *
     * @return the first randomly generated number
     */
    public int getNum1() {
        return num1;
    }

    /**
     * Returns the value of the second randomly generated number.
     *
     * @return the second randomly generated number
     */
    public int getNum2() {
        return num2;
    }

    /**
     * Returns the arithmetic operator.
     *
     * @return the arithmetic operator
     */
    public char getArithmeticOperator() {
        return arithmeticOperator;
    }
}
