package hangman.model;

public class OriginalScore implements GameScore {
    public int calculateScore(int correctCount, int incorrectCount){
        int score = 100 - (10*incorrectCount);
        if (score > 0)
            return score;
        return 0;
    }
}
