package virtual_pet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoboDogTest {

    @Test
    public void roboDogHasAName() {
        RoboDog robotJonas = new RoboDog("robojonas", "robo pit bull", 50,50,50);
        String roboName = robotJonas.getName();
        assertEquals("robojonas", roboName);
    }

    @Test
    public void roboDogShouldBeWalkable() {
        RoboDog robojonas = new RoboDog("robojonas", "robo pit bull", 50,50,50);
        robojonas.walk();
        int roboJonasPower = robojonas.getPowerLevel();
        assertEquals(40, roboJonasPower);
    }

    @Test
    public void getRoboDogOilLevel() {
        RoboDog roboJonas = new RoboDog("robojonas", "robo pit bull", 50,50,50);
        roboJonas.getOilLevel();
        int roboJonasOilLevel = roboJonas.getOilLevel();
        assertEquals(50, roboJonasOilLevel);
    }

    @Test
    public void getRoboDogDisrepairLevel() {
        RoboDog roboJonas = new RoboDog("robojonas", "robo pit bull", 50,50,50);
        roboJonas.getDisrepairLevel();
        int roboJonasDisrepairLevel = roboJonas.getDisrepairLevel();
        assertEquals(50, roboJonasDisrepairLevel);
    }
}
