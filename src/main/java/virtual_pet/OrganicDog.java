package virtual_pet;

public class OrganicDog extends OrganicPet implements Walkable{
    public OrganicDog(String name, String description, int hungerLevel, int thirstLevel, int moodLevel) {
        super(name, description, hungerLevel, thirstLevel, moodLevel);
    }


    public void walk() {
        hungerLevel +=10;
        moodLevel +=10;
    }
}
