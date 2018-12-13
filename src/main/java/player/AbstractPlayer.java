package player;

import game.Choices;
import reader.InputMapper;
import reader.InvalidInputException;

abstract public class AbstractPlayer implements Player {

    private final String playerName;
    private int playerScore;

    public AbstractPlayer(String playerName) {
        this.playerName = playerName;
    }

    public void updateScore(int score) {
        playerScore += score;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public String getName() {
        return playerName;
    }
}
