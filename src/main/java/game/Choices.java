package game;

public enum Choices {
    CHEAT("Cheat"),
    COOPERATE("Cooperate");

    private String option;

    Choices(String option) {
        this.option = option;
    }

    public String getOption() {
        return option;
    }


}

