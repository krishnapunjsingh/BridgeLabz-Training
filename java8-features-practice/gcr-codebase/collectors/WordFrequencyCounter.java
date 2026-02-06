import java.util.*;
import java.util.stream.Collectors;

public class WordFrequencyCounter {

    public static void main(String[] args) {

        String paragraph = "java is easy and java is powerful";

        // Split paragraph into words and count frequency
        Map<String, Integer> wordCount =
                Arrays.stream(paragraph.split("\\s+"))
                      .collect(Collectors.toMap(
                              word -> word,      // key = word
                              word -> 1,         // initial count
                              Integer::sum       // merge if duplicate
                      ));

        // Print word frequency
        wordCount.forEach((word, count) ->
                System.out.println(word + " : " + count)
        );
    }
}
