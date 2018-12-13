package player;

import game.Choices;
import reader.InputMapper;
import reader.InputReader;
import reader.InvalidInputException;

public class CheatPlayer extends AbstractPlayer {
    private final String playerName;
    private final InputMapper inputMapper;
    private int playerScore;
    private Choices currentChoice;

    public CheatPlayer(String playerName) {
        super(playerName);
        this.playerName = playerName;
        inputMapper = new InputMapper();
    }

    public void updateScore(int score) {
        playerScore += score;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public Choices play() throws InvalidInputException {
        System.out.println("Entering 0 :");
        currentChoice = inputMapper.getChoice("0");
        return currentChoice;
    }

    public String getName() {
        return playerName;
    }

    @Override
    public Choices getCurrentChoice() {
        return currentChoice;
    }
}