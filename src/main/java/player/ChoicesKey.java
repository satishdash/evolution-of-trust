package player;

import game.Choices;

import java.util.Objects;

public class ChoicesKey {
    private final Choices choice1;
    private final Choices choice2;


    public ChoicesKey(Choices choice1, Choices choice2) {
        this.choice1 = choice1;
        this.choice2 = choice2;

    }

    @Override
    public boolean equals(Object obj) {
        if (Objects.isNull(obj)) {
            return Boolean.FALSE;
        }
        if(!(obj instanceof  ChoicesKey)) {
            return Boolean.FALSE;
        }
        ChoicesKey key = (ChoicesKey) obj;
        return key.choice1 == this.choice1 && key.choice2 == this.choice2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(choice1, choice2);
    }
}
