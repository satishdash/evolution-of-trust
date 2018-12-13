import game.Choices;
import game.Points;
import game.Rules;
import org.junit.Test;
import player.ChoicesKey;

import static junit.framework.TestCase.assertEquals;

public class RulesTest {

    private Rules rules = new Rules();

    @Test
    public void testGetChoice() {
        rules.setUpRuleMap();
        Points expected = new Points(0, 0);
        Points actual = rules.getPointsFromChoices(Choices.CHEAT, Choices.CHEAT);
        assertEquals("Expected cheat & cheat but seems different", expected, actual);
    }
}
