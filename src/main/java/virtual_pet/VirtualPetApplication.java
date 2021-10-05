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
            System.out.println("3. Play with a pet.");// Play with a specific Tiger, list them with descriptions, then select
            System.out.println("4. surrender a pet."); // Add a tiger to the shelter.
            System.out.println("5. Adopt a pet.");
            System.out.println("6. Play with all the pets"); // kick out of loop
            System.out.println("7. Feed a specific pet");
            System.out.println("8. Water a specific pet");
            System.out.println("9. Walk a pet");
            System.out.println("10. Quit");
            userChoice = tigerScan.nextLine();

            switch (userChoice) {
                case "1":
                    myShelter.feedAll();
                    System.out.println("All pets have been fed!");
                    break;
                case "2":
                    myShelter.waterAll();
                    System.out.println("All pets have fluid!");
                    break;
                case "3":
                    System.out.println("What is the name of the pet you would like to play with?");
                    String petname = tigerScan.nextLine();
                    VirtualPet myPet = myShelter.getPetByName(petname);
                    myPet.playPet();
                    System.out.println(myPet.getName() + "had a great time!");
                    break;
                case "4":
                    System.out.println("What is the pets name?");
                    String name = tigerScan.nextLine();
                    System.out.println("What is the pets description?");
                    String description = tigerScan.nextLine();
                    System.out.println("Do you want an organic pet or a robotic pet?");

                    String roboticOrganicResponse = tigerScan.nextLine();
                    if (roboticOrganicResponse.equalsIgnoreCase("robotic")) {
                        System.out.println("Do you want a cat or a dog?");
                        String catOrDogResponse = tigerScan.nextLine();
                        if (catOrDogResponse.equalsIgnoreCase("cat")) {
                            RoboticPet myRoboCat = new RoboCat(name, description, 50,50,50);
                            myShelter.surrenderPet(myRoboCat);

                        }
                        else if (catOrDogResponse.equalsIgnoreCase("dog")) {
                            RoboticPet myRoboDog = new RoboDog(name, description, 50,50,50);
                            myShelter.surrenderPet(myRoboDog);
                        }
                    }

                    else if (roboticOrganicResponse.equalsIgnoreCase("organic")) {
                        System.out.println("Do you want a cat or a dog?");
                        String roboCatOrDogResponse = tigerScan.nextLine();

                        if (roboCatOrDogResponse.equalsIgnoreCase("cat")) {
                            OrganicPet myCat = new OrganicCat(name, description, 50, 50,50,50);
                            myShelter.surrenderPet(myCat);
                            System.out.println(myShelter.getPets());
                        }
                        else if (roboCatOrDogResponse.equalsIgnoreCase("dog")) {
                            OrganicPet myDog = new OrganicDog(name, description, 50,50,50,50);
                            myShelter.surrenderPet(myDog);
                        }
                    }

                    break;
                case "5":
                    System.out.println("What pet do you want to adopt?");
                    String adoptname = tigerScan.nextLine();
                    myShelter.adoptPet(myShelter.getPetByName(adoptname));
                    break;
                case "6":
                    myShelter.playAll();
                    System.out.println("All the pets had a dang ole good time!");
                    break;
                case "7":
                    System.out.println("What pet would you like to feed");
                    String feedName = tigerScan.nextLine();
                    VirtualPet myPetFeed = myShelter.getPetByName(feedName);
                    myPetFeed.energize();
                    System.out.println(myPetFeed.getName() + " feels energized!");
                case "8":
                    System.out.println("What pet would you like to give fluid?");
                    String fluidName = tigerScan.nextLine();
                    VirtualPet myPetFluid = myShelter.getPetByName(fluidName);
                    myPetFluid.fluid();
                    System.out.println(myPetFluid.getName() + " feels lubricated!");
                case "9":
                    System.out.println("What pet would you like to walk?");
                    String walkName = tigerScan.nextLine();
                    VirtualPet myPetWalk = myShelter.getPetByName(walkName);
                    myPetWalk.walk();
                    System.out.println(myPetWalk.getName() + " went on a walk!");
                default:
                    System.out.println("Please enter a valid response.");

            }

            myShelter.tick();
        }

        while (userChoice != "10");

    }

    private void shelterStatus(VirtualPetShelter shelter) {
        for(VirtualPet pet: shelter.getPets()){
            System.out.println("Pet: "+ pet.getName());
        }
    }
}




