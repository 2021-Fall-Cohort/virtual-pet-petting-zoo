package virtual_pet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoboDogTest {

    @Test
    public void roboDogHasAName() {
        RoboDog robojonas = new RoboDog("robojonas", "robo pit bull", 50,50,50);
        String roboName = robojonas.getName();
        assertEquals("robojonas", roboName);
    }

    @Test
    public void roboDogShouldBeWalkable() {
        RoboDog robojonas = new RoboDog("robojonas", "robo pit bull", 50,50,50);
        robojonas.walk();
        int robojonasPower = robojonas.getPowerLevel();
        assertEquals(40, robojonasPower);
    }
}
