import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Scanner;

public class StringCollections {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList to store strings
        ArrayList<String> stringList = new ArrayList<>();

        // Create a HashSet to store unique strings
        HashSet<String> stringSet = new HashSet<>();

        // Create a HashMap to store word frequencies
        HashMap<String, Integer> wordFrequencyMap = new HashMap<>();

        // Input 10 strings
        for (int i = 0; i < 5; i++) {
            String inputString = scanner.nextLine();

            // Add to ArrayList
            stringList.add(inputString);

            // Add to HashSet (to ensure uniqueness)
            stringSet.add(inputString);

            // Populate HashMap with word frequencies
            String[] words = inputString.split("\\s+");
            for (String word : words) {
                // Convert to lowercase to treat words case-insensitively
                word = word.toLowerCase();

                // Update frequency in the HashMap
                wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
            }
        }

        // Close the Scanner to prevent resource leak
        scanner.close();

        // Print contents of ArrayList
        System.out.println("\nList Contains:");
        for (String str : stringList) {
            System.out.println(str);
        }

        // Print contents of HashSet
        System.out.println("\nSet Contains:");
        for (String str : stringSet) {
            System.out.println(str);
        }

        // Print contents of HashMap
        System.out.println("\nFrequency of the words:");
        for (String word : wordFrequencyMap.keySet()) {
            System.out.print("Word = " + word);
            System.out.println(", Frequency = " + wordFrequencyMap.get(word));
        }
    }
}
