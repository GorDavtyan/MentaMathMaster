package mentalMathMaster;

public class Player {

    private int totalAnswers;
    private int correctAnswers;//have answered correctly


    /**
     * Returns the total number of answers provided by the player.
     *
     * @return the total number of answers
     */
    public int getTotalAnswers() {
        return totalAnswers;
    }

    /**
     * Returns the number of correct answers provided by the player.
     *
     * @return the number of correct answers
     */
    public int getCorrectAnswers() {
        return correctAnswers;
    }

    /**
     * Increments the count of correct answers by 1.
     */
    public void incrementCorrectAnswers() {
        ++correctAnswers;
    }

    /**
     * Increments the count of total answers by 1.
     */
    public  void incrementTotalAnswers() {
        ++totalAnswers;
    }
}
