package player;

import game.Choices;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import reader.InputReader;
import reader.InvalidInputException;

import static junit.framework.TestCase.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class PlayerTest {
    @Mock
    InputReader inputReader;

    @Test
    public void updateScoreTest() {
        ConsolePlayer player = new ConsolePlayer("player1",inputReader);
        player.updateScore(2);
        assertEquals("Expected score to be 2 but is different", 2, player.getPlayerScore());
    }

    @Test
    public void updateNegativeScoreTest() {
        ConsolePlayer player = new ConsolePlayer("player1",inputReader);
        player.updateScore(-1);
        assertEquals("Expected score to be -1 but is different", -1, player.getPlayerScore());
    }

    @Test
    public void playTest() throws InvalidInputException {
        ConsolePlayer player = new ConsolePlayer("player1",inputReader);
        Mockito.when(inputReader.read())
                .thenReturn("1");
        Choices choices = player.play();
        Assert.assertEquals(Choices.COOPERATE,choices);

        Mockito.verify(inputReader).read();
    }

    @Test
    public void copyCatPlayerTest() throws InvalidInputException {
        Mockito.when(inputReader.read())
                .thenReturn("1")
        .thenReturn("1");
        Player player1 = new ConsolePlayer("X", inputReader);
        Player player2 = new CopyCatPlayer("Y");
        Choices choices = player1.play();

        Choices choices2 = player2.play();
        Assert.assertEquals(Choices.COOPERATE,choices2);

        Choices choices3 = player1.play();

        Choices choices4 = player2.play();

        Assert.assertEquals(choices3,choices4);

    }
}
