import game.Game;
import game.Rules;
import player.CheatPlayer;
import player.ConsolePlayer;
import player.CopyCatPlayer;
import player.Player;
import reader.InputReader;

public class Driver {

    public static void main(String[] args) {
        InputReader reader = new InputReader();

        Player first = new ConsolePlayer("X", reader);
        Player second = new CopyCatPlayer("Y");

        Rules rules = new Rules();
        Game game = new Game(5, first, second, rules);
        game.start();
    }
}