package virtual_pet;

public class RoboticPet extends VirtualPet {

    public int powerLevel;
    public int oilLevel;
    private int disrepairLevel;

    public int getPowerLevel() {
        return powerLevel;
    }

    public int getOilLevel() {
        return oilLevel;
    }

    public int getDisrepairLevel() {
        return disrepairLevel;
    }

    public RoboticPet(String name, String description, int disrepairLevel, int oilLevel, int powerLevel) {
        super(name, description);
        this.disrepairLevel = disrepairLevel;
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
        powerLevel -=10;
    }
    @Override
    public void tick(){

    }
}
