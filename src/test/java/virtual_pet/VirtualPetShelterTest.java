package virtual_pet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest {
    VirtualPetShelter underTest;

    @BeforeEach
    void setup(){
        underTest = new VirtualPetShelter();
    }

    @Test
    void getPetByName() {
        OrganicPet underTest = new OrganicDog("cool", "cool", 25,25,25, 50);
       String name = underTest.getName();
       assertEquals("cool", name);

    }

    @Test
        void shouldBeAbleToACreatePetAndAddToShelter() {
        OrganicPet cool = new OrganicDog("cool", "cool", 25, 25,25,25);
        underTest.shelterPets.add(cool);
        assertEquals("cool",underTest.shelterPets.get(4).getName());
        }

    @Test
        void shouldBeAbleToRemovePetFromShelter() {
        OrganicPet cool = new OrganicDog("cool", "cool", 25, 25,25,25);
        underTest.shelterPets.add(cool);
        underTest.shelterPets.remove(cool);
        int sizeOfShelter = underTest.getPets().size();
        assertEquals(4, sizeOfShelter);

    }

    @Test
    void shouldFeedAllThePets() {
        OrganicPet cool = new OrganicDog("cool", "cool", 25, 25,25, 25);
        underTest.shelterPets.add(cool);
        underTest.feedAll();
        assertEquals(20, cool.getHungerLevel());
    }

    @Test
    void shouldWaterAllThePets() {
        OrganicPet cool = new OrganicDog("cool", "cool", 25, 25,25,25);
        underTest.shelterPets.add(cool);
        underTest.waterAll();
        assertEquals(20, cool.getThirstLevel());
    }

    @Test
    void shouldTickMethodOnAllThePets() {
        OrganicPet cool = new OrganicDog("cool", "cool", 25, 25,25,25);
        underTest.shelterPets.add(cool);
        underTest.tick();
        assertEquals(35, cool.getHungerLevel());

    }

    @Test
    void shouldBeAbleToPlayWithAllPets() {
        OrganicPet cool = new OrganicDog("cool", "cool", 25, 25,25,25);
        underTest.shelterPets.add(cool);
        underTest.playAll();
        assertEquals(20,cool.getMoodLevel());
    }

    @Test
    void shouldBeAbleToGetTigerByDescription() {
        OrganicPet cool = new OrganicDog("cool", "cool", 25,25,25, 25);
        underTest.shelterPets.add(cool);
        underTest.getPetByDescription("cool");
        assertEquals("cool", cool.getPetByDescription());
    }
}
