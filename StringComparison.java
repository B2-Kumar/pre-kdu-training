import java.util.Scanner;

public class StringComparison {
    public static void main (String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Input the first string
        String firstString = scanner.nextLine();

        // Input the second string
        String secondString = scanner.nextLine();

        // Close the Scanner to prevent resource leak
        scanner.close();

        // Print the length of the first string
        System.out.println("The Length of the first string is " + firstString.length());

        // Print the length of the second string
        System.out.println("The Length of the second string is " + secondString.length());

        // Check if the lengths match
        if (firstString.length() == secondString.length()) {
            System.out.println("The length of the two strings are the same");
        } else {
            System.out.println("The length of the two strings are not the same");
        }

        // Check if the two strings are the same
        if (firstString.equals(secondString)) {
            System.out.println("Two strings are equal");
        } else {
            System.out.println("Two strings are not equal");
        }
    }
}
