package virtual_pet;
import java.util.ArrayList;
import java.util.Scanner;

public class VirtualPetApplication {


    // interacting and gameplay should go HERE in the main
    Scanner tigerScan = new Scanner(System.in);

    public static void main(String[] args) {
        VirtualPetApplication myApp = new VirtualPetApplication();
        myApp.gameLoop();
    }
    public void gameLoop() {
        String userChoice = "";
        VirtualPetShelter myShelter = new VirtualPetShelter();
        do{
            shelterStatus(myShelter);


        }
        while (userChoice != "6");



        System.out.println("Hello and welcome to the petting zoo! \n" +
                        "Here is the status of all of the animals in the petting zoo.\n");

        for (Tiger tiger: ) {
            System.out.println(tiger.getName());
            System.out.println(tiger.getDescription());
            System.out.println(tiger.getHungerLevel());
            System.out.println(tiger.getMoodLevel());
            System.out.println(tiger.getThirstLevel());
        }

        System.out.println("What would you like to do next? \n"
        + "1. Feed the pets.\n" // This applies to all pets, feed all the pets at once.
        + "2. Give the pets a drink.\n" // This applies to all pets, water them all at once
        + "3. Play with a pet. \n" // Play with a specific Tiger, list them with descriptions, then select
        + "4. Surrender your Tiger.\n" // Add a tiger to the shelter. .add() from array list
        + "5. Adopt a tiger. \n" // Remove a specific tiger from the shelter.  .remove() from array list. For loop through pets and remove specific pet.
         + "6. Quit"); // kick out

  // list out options every time you go through the loop
        int response = int.nextInt();
        // tigerScan.nextLine();

        switch (response) {
            case 1:
                feed();
                break;
            case 2:
                myShelter.waterAll();
            case 3:
                playPet();
            case 4:
                surrenderPet();
            case 5:
                adoptPet();
            case 6:

        }








// old code

        /* System.out.println("Hello rawr! I am " + clancy.getName() + ", I am " + clancy.getAge() + " years old!"
                + " I am a " + clancy.getBreed() + " tiger.");
        System.out.println("Would you like to 1. feed me, 2. give me a drink, 3. or play with me?");
        System.out.println("Chose one, two, or three");
        */


            /*
        Scanner tigerScan = new Scanner(System.in);
        String answer;
        tigerScan.nextLine();

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
    */

    }

    private void shelterStatus(VirtualPetShelter shelter) {
        for(VirtualPet pet: shelter.getPets()){
            System.out.println("Pet: "+ pet.getName());
        }
    }
}






// scanners can use the close() scanner, but usually you use the scanner to scan files




