package virtual_pet;

public class RoboCat extends RoboticPet{
    public RoboCat(String name, String description, int disrepairLevel, int oilLevel, int powerLevel) {
        super(name, description, disrepairLevel, oilLevel, powerLevel);
    }

    public void walk() {
        powerLevel -=10;
        oilLevel -=10;
    }

}
