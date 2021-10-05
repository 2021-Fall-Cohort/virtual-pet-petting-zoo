package virtual_pet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VirtualPetShelterTest {

    VirtualPetShelter underTest;
    private Assertions Assert;

    @Test
    void getPetByName() {
        Tiger underTest = new Tiger("cool", "cool", "cool", 25, 25, 25);
        String name = underTest.getName();
        assertEquals("cool", name);

    }

    @Test
    void shouldBeAbleToAcreatpetAddToShelter() {

    }

    @Test
  public void shouldWaterPet() {
        VirtualPet underTest = new VirtualPet();
        underTest.water();
        int thirsty = underTest. thirstlevel ();
        Assert.assertEquals(20, thirsty);
    }

    @Test
public void shouldHaveHungerPet() {
 VirtualPet underTest = new VirtualPet();
 int hunger = underTest.getHunger();
00000000000000000000000000000000000000 Assert.assertEquals(10, hunger);




