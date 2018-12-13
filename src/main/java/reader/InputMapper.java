package reader;

import game.Choices;

public class InputMapper {

    public Choices getChoice(String input) throws InvalidInputException{
        switch(input) {
            case "0":
                return Choices.CHEAT;
            case "1":
                return Choices.COOPERATE;
            default:
                throw new InvalidInputException("ERROR: Valid choices are '0' and '1'");

        }
    }
}
