package hangman.model;

import static java.lang.Math.pow;

public class PowerScore {
    public int calculateScore(int correctCount, int incorrectCount){
        int correctScore = 0;
        for (int i = 1; i <= correctCount; i++) {
            correctScore += (int) pow(5, i);
        }
        int score = correctScore - 8*incorrectCount;
        if (score < 0)
            return 0;
        if (score > 500)
            return 500;
        return score;
    }
}
