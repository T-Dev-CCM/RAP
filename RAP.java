// Import libraries for RAP 
import java.util.Arrays;
// We'll use random number, so import it 
import java.util.Random;
//use scanner to get input
import java.util.Scanner;

// Create main class for RAP 
// Same name as filename without .java
public class RAP {


    // Create main method (entry point) 
    public static void main(String[] args){ //Start point of function
        // Create the variables and arrays
        // Create scanner 
        Scanner scanner = new Scanner(System.in);

        displayTitle(); 

        // Call a method to welcome the user to our program/explain

        welcomeUser();
        // Call goodbye 
        goodbyeUser();

} //closes the main method

// Display title 
public static void displayTitle() {
    System.out.println("\n\n\t*** Welcome to RAP (Room Assignment Program) ***");

}

// Create a method to welcom/explain 

public static void welcomeUser() {
    System.out.println("\n This program will assign empty rooms to new Mars colonists.");
}

public static void goodbyeUser() {
    System.out.println("\n Thank you for using RAP");
}




}


