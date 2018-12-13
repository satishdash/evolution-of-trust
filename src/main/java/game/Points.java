package game;

import java.util.Objects;

public class Points {
    private final int firstScore;
    private final int secondScore;


    public Points(int firstScore, int secondScore) {
        this.firstScore = firstScore;
        this.secondScore = secondScore;
    }

    public int getFirstScore() {
        return firstScore;
    }

    public int getSecondScore() {
        return secondScore;
    }

    @Override
    public boolean equals(Object obj) {
        if (Objects.isNull(obj)) {
            return Boolean.FALSE;
        }
        if(!(obj instanceof  Points)) {
            return Boolean.FALSE;
        }
        Points points = (Points) obj;
        return points.getFirstScore() == this.firstScore && points.getSecondScore() == this.secondScore;
    }
}
