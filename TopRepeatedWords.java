import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopRepeatedWords {

    public static void main(String[] args) throws IOException {
        // Create a map to store the word counts
        Map<String, Integer> wordCounts = new HashMap<>();

        // Read the CSV file
        BufferedReader reader = new BufferedReader(new FileReader("words.csv"));
        String line;
        while ((line = reader.readLine()) != null) {
            // Split the line into words
            String[] words = line.split(",");

            // Iterate over the words and update the word counts
            for (String word : words) {
                wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
            }
        }

        // Create a priority queue to store the top 3 repeated words
        PriorityQueue<Map.Entry<String, Integer>> queue = new PriorityQueue<>((e1, e2) -> e2.getValue() - e1.getValue());

        // Add the word counts to the priority queue
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            queue.add(entry);
        }

        // Print the top 3 repeated words
        for (int i = 0; i < 3; i++) {
            Map.Entry<String, Integer> entry = queue.poll();
            System.out.println(entry.getKey());
        }

        reader.close();
    }
}