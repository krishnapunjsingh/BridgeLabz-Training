public class ParagraphAnalyzer {

    public static void analyzeParagraph(String paragraph,String targetWord,String replacementWord) {

        // Edge case: null or empty or spaces only
        if (paragraph == null || paragraph.trim().isEmpty()) {
            System.out.println("Paragraph is empty or contains only spaces.");
            return;
        }

        // Normalize spaces
        paragraph = paragraph.trim().replaceAll("\\s+", " ");

        // Split into words
        String[] words = paragraph.split(" ");

        // 1. Count words
        int wordCount = words.length;

        // 2. Find longest word
        String longestWord = words[0];
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        // 3. Replace word (case-insensitive)
        String replacedParagraph = paragraph.replaceAll("(?i)\\b" + targetWord + "\\b", replacementWord);

        System.out.println("Word Count: " + wordCount);
        System.out.println("Longest Word: " + longestWord);
        System.out.println("Modified Paragraph:");
        System.out.println(replacedParagraph);
    }

    public static void main(String[] args) {
        String paragraph = "Java is powerful and Java is popular";
        analyzeParagraph(paragraph, "java", "Python");
    }
}
