package game;

import player.Player;
import player.Player;
import reader.InvalidInputException;

public class Game {

    private final Player first;
    private final Player second;
    private int rounds = 1;
    private final Rules rules;

    public Game(int rounds, Player playerFirst, Player playerSecond, Rules rules) {
        first = playerFirst;
        second = playerSecond;
        this.rounds = rounds;
        this.rules = rules;
        rules.setUpRuleMap();
    }

    public void start() {
        int index = 0;

        while (index < rounds) {
            Choices firstPlayerChoice = null;
            Choices secondPlayerChoice = null;
            try {
                 firstPlayerChoice = first.play();
                 secondPlayerChoice = second.play();

            } catch (InvalidInputException e) {
                System.out.println("Enter the choices again.");
                continue;
            }
            Points points = rules.getPointsFromChoices(firstPlayerChoice, secondPlayerChoice);
            first.updateScore(points.getFirstScore());
            second.updateScore(points.getSecondScore());

            displayScore();

            index++;
        }
    }

    private void displayScore() {
        System.out.println(String.format("\n%s = %d, %s = %d", first.getName(), first.getPlayerScore()
                , second.getName()
                , second.getPlayerScore()));
    }
}
