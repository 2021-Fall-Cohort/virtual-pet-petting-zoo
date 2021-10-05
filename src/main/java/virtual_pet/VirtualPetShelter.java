package virtual_pet;
import java.util.ArrayList;

// holding the collections of Tigreesssssss
// feed all water all should be here so the method calls on all of them

public class VirtualPetShelter {

    ArrayList<VirtualPet> shelterPets;

    public VirtualPetShelter() {
        this.shelterPets = new ArrayList<VirtualPet>();
        shelterPets.add(new OrganicDog("Jonas", "Organic", 50, 50, 50, 50));
        shelterPets.add(new OrganicCat("Ralphie", "Organic", 50, 50, 50, 50));
        shelterPets.add(new RoboCat("CyberTony", "Robotic", 67, 67, 95));
        shelterPets.add(new RoboDog("MechaPhillip", "Robotic", 50, 50, 50));
    }

    public ArrayList<VirtualPet> getPets() {
        return shelterPets;
    }

    public VirtualPet getPetByName(String name) {
        for (VirtualPet currentPet : shelterPets) {
            if (currentPet.getName().equalsIgnoreCase(name)) {
                return currentPet;
            }
        }
        return null;
    }

    public VirtualPet getPetByDescription(String description) {
        for (VirtualPet currentPet: shelterPets) {
            if (currentPet.getDescription().equalsIgnoreCase(description)) {
                return currentPet;
            }
        }
        return null;
    }

    public void adoptPet(VirtualPet pet) {
        shelterPets.remove(pet);
    }

    public void surrenderPet(VirtualPet pet) {
        shelterPets.add(pet);
    }

    public void feedAll() {
        for (VirtualPet currentPet : shelterPets) {
           currentPet.energize();
        }
    }

    public void waterAll() {
        for (VirtualPet currentPet : shelterPets) {
            if(currentPet instanceof OrganicPet){
                ((OrganicPet)currentPet).fluid();
            }
            if(currentPet instanceof RoboticPet){
                ((RoboticPet)currentPet).fluid();
            }
        }
    }

    public void playAll() {
        for (VirtualPet currentPet : shelterPets) {
//           currentPet.play();
        }
    }

    public void tick() {
        for (VirtualPet currentPet : shelterPets) {
            currentPet.tick();
        }

    }

}
