package player;

import game.Choices;
import game.ChoicesQueue;
import reader.InputMapper;
import reader.InvalidInputException;

public class CopyCatPlayer extends AbstractPlayer {
    private final String playerName;
    private int playerScore;
    private boolean isFirstTime = Boolean.TRUE;
    private Choices currentChoice = Choices.COOPERATE;

    public CopyCatPlayer(String playerName) {
        super(playerName);
        this.playerName = playerName;
    }

    public void updateScore(int score) {
        playerScore += score;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public Choices play() throws InvalidInputException {
        if(isFirstTime) {
            isFirstTime = Boolean.FALSE;
            ChoicesQueue.choicesQueue.poll();
            return currentChoice;
        }

        System.out.println("Entering first players choice :");
        currentChoice =  ChoicesQueue.choicesQueue.poll();
        return currentChoice;
    }

    public String getName() {
        return playerName;
    }

    @Override
    public Choices getCurrentChoice() {
        return  currentChoice;
    }
}