package virtual_pet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrganicDogTest {

    @Test
    public void organicDogHasName() {
        OrganicDog jonas = new OrganicDog("jonas", "pit bull", 50,50,50, 50);
        String dogName = jonas.getName();
        assertEquals("jonas", dogName);
    }

    @Test
    public void organicDogShouldBeWalkable() {
        OrganicDog jonas = new OrganicDog("Jonas", "pit bull", 50,50,50, 50);
        jonas.walk();
        int jonasHunger = jonas.getHungerLevel();
        assertEquals(60, jonasHunger);
    }
}
