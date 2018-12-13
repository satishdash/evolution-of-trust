package game;

import player.ChoicesKey;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Rules {
    Map<ChoicesKey, Points> map = Collections.emptyMap();

    public void setUpRuleMap(){
        map = new HashMap<>();
        map.put(new ChoicesKey(Choices.CHEAT, Choices.COOPERATE), new Points(3, -1));
        map.put(new ChoicesKey(Choices.CHEAT, Choices.CHEAT), new Points(0,0));
        map.put(new ChoicesKey(Choices.COOPERATE, Choices.COOPERATE), new Points(2, 2));
        map.put(new ChoicesKey(Choices.COOPERATE, Choices.CHEAT), new Points(-1, 3));
    }

    public Points getPointsFromChoices(Choices first, Choices second) {
        return map.get(new ChoicesKey(first, second));
    }
}
