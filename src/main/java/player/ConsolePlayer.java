package player;

import game.Choices;
import game.ChoicesQueue;
import reader.InputMapper;
import reader.InputReader;
import reader.InvalidInputException;

public class ConsolePlayer extends AbstractPlayer {
    private final String playerName;
    private final InputMapper inputMapper;
    private int playerScore;
    private InputReader reader;
    private Choices currentChoice;

    public ConsolePlayer(String playerName, InputReader inputReader) {
        super(playerName);
        this.playerName = playerName;
        inputMapper = new InputMapper();
        reader = inputReader;

    }

    public Choices play() throws InvalidInputException {
        System.out.println("Enter a value 0 or 1 :");
        currentChoice = inputMapper.getChoice(reader.read());
        ChoicesQueue.choicesQueue.offer(currentChoice);
        return currentChoice;
    }

    @Override
    public Choices getCurrentChoice() {
        return currentChoice;
    }
}