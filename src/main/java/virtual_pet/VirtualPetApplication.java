package virtual_pet;
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
            System.out.println("Hello and welcome to the Petting zoo! \n");
            System.out.println("Here is the status of all the pets.");
            System.out.println(myShelter.getPets());
            shelterStatus(myShelter);
            System.out.println("What would you like to do next?.");
            System.out.println("1. Feed the pets."); // This applies to all pets, feed all the pets at once.
            System.out.println("2. Give all the pets a drink of water."); // This applies to all pets, water them all at once
            System.out.println("3. Play with a pet."); // Play with a specific Tiger, list them with descriptions, then select
            System.out.println("4. surrender a pet."); // Add a tiger to the shelter.
            System.out.println("5. Adopt a pet.");
            System.out.println("6. Play with all the pets"); // kick out of loop
            System.out.println("7. Quit");
            userChoice = tigerScan.nextLine();

            switch (userChoice) {
                case "1":
                    myShelter.feedAll();
                    System.out.println("All pets have been fed!");
                    break;
                case "2":
                    myShelter.waterAll();
                    break;
                case "3":
                    System.out.println("What pet would you like with?");
                    myShelter.getPetByName("Clancy").playPet();
                    break;
                case "4":
                    System.out.println("What is the pets name?");
                    String name = tigerScan.nextLine();
                    System.out.println("What is the pets description?");
                    String description = tigerScan.nextLine();
                    System.out.println("What is the pets breed?");
                    String breed = tigerScan.nextLine();
                    OrganicPet myTiger = new OrganicPet(name,description,50,50,50, 50);
                    myShelter.surrenderPet(myTiger);
                    break;
                case "5":
                    myShelter.adoptPet(myShelter.getPetByName("Clancy")); // repeat
                    break;
                case "6":
                    myShelter.playAll();
                    break;
                default:
                    System.out.println("Please enter a valid response.");

            }

            myShelter.tick();
        }

        while (userChoice != "7");

    }

    private void shelterStatus(VirtualPetShelter shelter) {
        for(VirtualPet pet: shelter.getPets()){
            System.out.println("Pet: "+ pet.getName());
        }
    }
}

// scanners can use the close() scanner, but usually you use the scanner to scan files




