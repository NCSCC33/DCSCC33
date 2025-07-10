Here’s a simple Java program to find the greatest of three numbers:

Copy the code
import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Determine the greatest number
        int greatest = num1;

        if (num2 > greatest) {
            greatest = num2;
        }
        if (num3 > greatest) {
            greatest = num3;
        }

        // Output the result
        System.out.println("The greatest number is: " + greatest);

        scanner.close();
    }
}

Explanation:
Input: The program takes three integers as input from the user.
Logic: It compares the numbers using simple if conditions to determine the largest.
Output: The greatest number is displayed.

This program is straightforward and beginner-friendly!