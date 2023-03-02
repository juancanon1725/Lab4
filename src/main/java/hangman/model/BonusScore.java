package hangman.model;

public class BonusScore implements GameScore{
    public int calculateScore(int correctCount, int incorrectCount){
        int score = 10*correctCount - 5*incorrectCount;
        if (score > 0)
            return score;
        return 0;
    }
}
