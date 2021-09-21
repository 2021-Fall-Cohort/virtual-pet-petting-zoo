package virtual_pet;
import java.util.Scanner;

public class VirtualPetApplication {


    public static void main(String[] args) {
        Scanner tigerScan = new Scanner(System.in);
        String answer;

        Tiger clancy = new Tiger("Clancy", 47, "Siberian", 23, 23, 23);

        System.out.println("Hello rawr! I am " + clancy.getName() + ", I am " + clancy.getAge() + " years old!"
                + " I am a " + clancy.getBreed() + " tiger.");
        System.out.println("Would you like to 1. feed me, 2. give me a drink, 3. or play with me?");
        System.out.println("Chose one, two, or three");


        while (true) {
            answer = tigerScan.nextLine().toLowerCase();
            clancy.tick();

            while (answer.equals("one") && (clancy.getHungerLevel()) <25) {
                clancy.feedTiger();
                if (clancy.hungerLevel >=25) {
                    System.out.println("Thank you for feeding me");
                    if (clancy.hungerLevel <=25) {
                        System.out.println("I'm still hungry.");
                    }
                }

                while (answer.equals("two") && (clancy.getThirstLevel()) <25) {
                    clancy.drinkTiger();
                    if (clancy.thirstLevel >=25) {
                        System.out.println("Thank you for giving me water.");
                        if(clancy.thirstLevel <=25) {
                            System.out.println("I'm still thirsty");
                        }
                    }
                }

                while (answer.equals("three") && ((clancy.getMoodLevel()) <25)) {
                    clancy.playTiger();
                    if (clancy.moodLevel >=25) {
                        System.out.println("Thank you for playing with me");
                        if (clancy.moodLevel <=25) {
                            System.out.println("I still want to play.");
                        }
                    }
                }

            }

        }

    }

}











