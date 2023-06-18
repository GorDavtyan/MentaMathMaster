package mentalMathMaster;

import java.util.Scanner;

public class Game {

    /**
     * Starts the mental math game.
     * It prompts the player to solve arithmetic expressions within a time limit of 60 seconds.
     * After the time limit is reached, it displays the player's total answers and correct answers.
     */
    public void startGame() {
        int result = 0;
        Player player = new Player();
        long currentTime = System.currentTimeMillis();
        long limitTime = 60_000;
        long endTimee = currentTime + limitTime;
        while (currentTime < endTimee) {
            Question question = new Question();
            player.incrementTotalAnswers();
            question.printArithmeticExpression();
            Scanner sc = new Scanner(System.in);
            System.out.println("Please write the result");
            result = sc.nextInt();
            if (result == question.getCorrectAnswer()) {
                player.incrementCorrectAnswers();
            }
            currentTime = System.currentTimeMillis();
        }
        System.out.println("Those were the questions։ " + player.getTotalAnswers());
        System.out.println("These are the correct answers: " + player.getCorrectAnswers());
    }
}
