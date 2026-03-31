public class SentenceFormatter {

    public static String formatParagraph(String paragraph) {

        // Step 1: Trim leading/trailing spaces
        paragraph = paragraph.trim();

        // Step 2: Replace multiple spaces with a single space
        paragraph = paragraph.replaceAll("\\s+", " ");

        // Step 3: Ensure one space after punctuation
        paragraph = paragraph.replaceAll("\\s*([.!?])\\s*", "$1 ");

        // Step 4: Capitalize first letter of each sentence
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;

        for (int i = 0; i < paragraph.length(); i++) {
            char ch = paragraph.charAt(i);

            if (capitalizeNext && Character.isLetter(ch)) {
                result.append(Character.toUpperCase(ch));
                capitalizeNext = false;
            } else {
                result.append(ch);
            }

            if (ch == '.' || ch == '?' || ch == '!') {
                capitalizeNext = true;
            }
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        String input = "  this is a test.   how are you?i am fine!   thank you. ";
        System.out.println(formatParagraph(input));
    }
}
