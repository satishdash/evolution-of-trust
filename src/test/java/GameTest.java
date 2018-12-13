import game.Choices;
import game.Game;
import game.Points;
import game.Rules;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import player.ConsolePlayer;
import reader.InputReader;
import reader.InvalidInputException;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class GameTest {


    @Mock
    InputReader inputReader;

    @Mock
    Rules rules;

    @Mock
    ConsolePlayer player1;


    @Mock
    ConsolePlayer player2;


    @Test
    public void gameStartTest() throws InvalidInputException {
        Mockito.when(player1.play()).thenReturn(Choices.COOPERATE);
        Mockito.when(player2.play()).thenReturn(Choices.CHEAT);
        Mockito.when(rules.getPointsFromChoices(Choices.COOPERATE, Choices.CHEAT))
                .thenReturn(new Points(-1, 3));

        Game game = new Game(1,player1,player2,rules);
        game.start();

        verify(player1).play();
        verify(player1).updateScore(-1);
        verify(player2).updateScore(3);
    }
}
