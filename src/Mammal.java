/**
 * Program to choose the species of a new mammal
 */

public class Mammal {

    //Print a description for this task
    System.out.println(
        "Please select the species of mammal you would like to add to the zoo.");
    System.out.println();

    //Prompt the user for the mammal's species (Giraffe, Lion, or Bear)
    System.out.print("Enter 0 for Giraffe, 1 for Lion, or 2 for Bear: ");
    
    //Check for valid species number entry
    if (mammal < 0) {
            System.err.format("%d is invalid. You must enter a number between 0 and 2. %n", mammal);
            System.exit(0);
        }
        else if (mammal > 2) {
            System.err.format("%d is invalid. You must enter a number between 0 and 2. %n", mammal);
            System.exit(0);
        }
    
    //Use number entered to direct the user to the specified species class to gather further information

}
