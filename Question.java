package mentalMathMaster;

public class Question {
    private String expression;
    private int correctAnswer;
    private ArithmeticUtils arithmeticUtils;

    /**
     * Generates a random arithmetic expression, prints it, and calculates the correct answer.
     * The generated expression consists of two random numbers and an arithmetic operator.
     */
    public void printArithmeticExpression() {
        arithmeticUtils = new ArithmeticUtils();
        arithmeticUtils.generateNumbers();
        arithmeticUtils.generatingRandomSymbol();
        expression = arithmeticUtils.getNum1() + " " + arithmeticUtils.getArithmeticOperator() + " " + arithmeticUtils.getNum2();
        System.out.println(expression);
        correctAnswer = arithmeticUtils.result();
    }

    /**
     * Returns the correct answer for the arithmetic expression.
     *
     * @return the correct answer
     */
    public int getCorrectAnswer() {
        return correctAnswer;
    }
}
