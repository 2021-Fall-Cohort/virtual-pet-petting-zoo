package virtual_pet;

public abstract class RoboticPet extends VirtualPet {

    public int powerLevel;
    public int oilLevel;
    public int hungerLevel;

    public RoboticPet(String name, String description,int hungerLevel, int oilLevel, int powerLevel) {
        super(name, description);
        this.hungerLevel = hungerLevel;
        this.oilLevel = oilLevel;
        this.powerLevel = powerLevel;

    }

    @Override
    public void fluid() {
        oilLevel -= 5;
    }

   @Override
   public void energize(){
        powerLevel -=5;
   }

    public void playPet() {

    }
    @Override
    public void tick(){

    }
}
