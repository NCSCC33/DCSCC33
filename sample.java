Here’s a simple Java program that demonstrates basic concepts like input/output, variables, and a conditional statement:

Copy the code
import java.util.Scanner;

public class SampleProgram {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Prompt the user for their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Display a personalized message
        if (age >= 18) {
            System.out.println("Hello " + name + "! You are an adult.");
        } else {
            System.out.println("Hello " + name + "! You are a minor.");
        }

        // Close the scanner
        scanner.close();
    }
}

How it works:
Input: The program takes the user's name and age as input using the Scanner class.
Conditional Logic: It checks if the user is 18 or older and displays a message accordingly.
Output: A personalized message is printed to the console.

You can run this program in any Java IDE or compiler to see it in action!