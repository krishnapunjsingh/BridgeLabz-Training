import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {

    public static void main(String[] args) throws IOException {

        Map<String, Integer> frequencyMap = new HashMap<>();

        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String line;

        while ((line = br.readLine()) != null) {
            line = line.toLowerCase().replaceAll("[^a-z ]", " ");
            String[] words = line.split("\\s+");

            for (String word : words) {
                if (!word.isEmpty()) {
                    frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
                }
            }
        }

        br.close();
        System.out.println(frequencyMap);
    }
}
