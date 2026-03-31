public class SentenceLinearSearch {

    public static String findSentence(String[] sentences, String word) {

        for (int i = 0; i < sentences.length; i++) {
            if (sentences[i].contains(word)) {
                return sentences[i];   
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {

        String[] sentences = {
            "Java is a programming language",
            "Python is easy to learn",
            "I love coding in Java",
            "Data structures are important"
        };

        String word = "Java";

        String result = findSentence(sentences, word);

        System.out.println(result);
    }
}
