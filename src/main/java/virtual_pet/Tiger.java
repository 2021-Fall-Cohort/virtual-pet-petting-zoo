package virtual_pet;

public class Tiger extends VirtualPet {

    // talk to shelter noice

    private String breed;
    public int moodLevel;
    public int thirstLevel;
    public int hungerLevel;

    public Tiger(String name, String description, String breed,int hungerLevel, int thirstLevel, int moodLevel) {
        super(name, description);
        this.breed = breed;
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

//    public String getBreed() {
//        return breed;
//    }

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
    public void feed() {
        hungerLevel-=5;
    }

    @Override
    public void water() {
        thirstLevel-=5;
    }

    @Override
    public void play() {
        moodLevel-=5;
    }

    @Override
    public void playPet() {

    }

    @Override
    public String toString() {
        return "Tiger{" +
                "breed='" + breed + '\'' +
                ", moodLevel=" + moodLevel +
                ", thirstLevel=" + thirstLevel +
                ", hungerLevel=" + hungerLevel +
                '}';
    }
}




