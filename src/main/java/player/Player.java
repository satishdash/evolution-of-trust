package player;

import game.Choices;
import reader.InvalidInputException;

public interface Player {
    String getName();
    int getPlayerScore();
    Choices play() throws  InvalidInputException;
    void updateScore(int score);
    Choices getCurrentChoice();
}
