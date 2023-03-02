package hangman.model;

import com.google.common.annotations.VisibleForTesting;
import org.junit.Assert;
import org.junit.Test;

public class GameScoreTest {

    @Test
    public void originalScoreGreaterThanZero() {
        //Arrange
        OriginalScore score = new OriginalScore();
        int correctCount = 5;
        int incorrectCount = 2;
        //Act
        int puntaje = score.calculateScore(correctCount, incorrectCount);
        //Assert
        Assert.assertEquals(80, puntaje);
    }

    @Test
    public void originalScoreLessThanZero_ShouldReturnZero() {
        //Arrange
        OriginalScore score = new OriginalScore();
        int correctCount = 0;
        int incorrectCount = 11;
        //Act
        int puntaje = score.calculateScore(correctCount, incorrectCount);
        //Assert
        Assert.assertEquals(0, puntaje);
    }

    @Test
    public void bonusScoreGreaterThanZero() {
        //Arrange
        BonusScore score = new BonusScore();
        int correctCount = 7;
        int incorrectCount = 3;
        //Act
        int puntaje = score.calculateScore(correctCount, incorrectCount);
        //Assert
        Assert.assertEquals(55, puntaje);
    }

    @Test
    public void bonusScoreLessThanZero_ShouldReturnZero() {
        //Arrange
        BonusScore score = new BonusScore();
        int correctCount = 2;
        int incorrectCount = 7;
        //Act
        int puntaje = score.calculateScore(correctCount, incorrectCount);
        //Assert
        Assert.assertEquals(0, puntaje);
    }

    @Test
    public void powerScoreGreaterThanZeroLessThan500() {
        //Arrange
        PowerScore score = new PowerScore();
        int correctCount = 3;
        int incorrectCount = 1;
        //Act
        int puntaje = score.calculateScore(correctCount, incorrectCount);
        //Assert
        Assert.assertEquals(147, puntaje);
    }

    @Test
    public void powerScoreLessThanZero_ShouldReturnZero() {
        //Arrange
        PowerScore score = new PowerScore();
        int correctCount = 1;
        int incorrectCount = 6;
        //Act
        int puntaje = score.calculateScore(correctCount, incorrectCount);
        //Assert
        Assert.assertEquals(0, puntaje);
    }

    @Test
    public void powerScoreGreaterThan500_ShouldReturn500() {
        //Arrange
        PowerScore score = new PowerScore();
        int correctCount = 7;
        int incorrectCount = 1;
        //Act
        int puntaje = score.calculateScore(correctCount, incorrectCount);
        //Assert
        Assert.assertEquals(500, puntaje);
    }
}
