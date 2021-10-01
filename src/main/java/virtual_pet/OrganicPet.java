package virtual_pet;

public class OrganicPet extends VirtualPet {

    // talk to shelter noice

    public int moodLevel;
    public int thirstLevel;
    public int hungerLevel;

    public OrganicPet(String name, String description, int hungerLevel, int thirstLevel, int moodLevel) {
        super(name, description);
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.moodLevel = moodLevel;

    }

     public int getThirstLevel() {
        return thirstLevel;
     }

     public int getMoodLevel() {
        return moodLevel;
     }


    public int getHungerLevel() {
        return hungerLevel;
    }

    @Override
    public void tick() {
        hungerLevel+= 10;
        thirstLevel+= 10;
        moodLevel+= 10;

    }

    @Override
    public void energize() {
        hungerLevel-=5;
    }

    @Override
    public void fluid() {
        thirstLevel-=5;
    }

    @Override
    public void playPet() {
        moodLevel -=5;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                 '\'' +
                ", moodLevel=" + moodLevel +
                ", thirstLevel=" + thirstLevel +
                ", hungerLevel=" + hungerLevel +
                '}';
    }
}




