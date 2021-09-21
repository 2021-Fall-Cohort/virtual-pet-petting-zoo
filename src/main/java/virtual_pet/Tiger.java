package virtual_pet;

public class Tiger {

    public int hungerLevel;
    private String name;
    private int age;
    private String breed;
    public int moodLevel;
    public int thirstLevel;

    public Tiger(String name, int age, String breed, int hungerLevel, int moodLevel, int thirstLevel) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.moodLevel = moodLevel;
    }

    public String getName() {
        return name;
    }
     public int getThirstLevel() {
        return thirstLevel;
     }

     public int getMoodLevel() {
        return moodLevel;
     }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void tick() {
        hungerLevel++;
        thirstLevel++;
        moodLevel++;

    }

    public void drinkTiger() {
        thirstLevel-= 5;
    }

    public void playTiger() {
        moodLevel-=5;
    }

    public void feedTiger() {
        hungerLevel-=5;
    }

}




