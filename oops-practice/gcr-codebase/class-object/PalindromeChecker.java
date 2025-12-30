class PalindromeChecker {

    String text;

    boolean isPalindrome() {

        String cleanedText = text.replaceAll("\\s+", "").toLowerCase();
        String reversedText = "";

        for (int i = cleanedText.length() - 1; i >= 0; i--) {
            reversedText += cleanedText.charAt(i);
        }

        return cleanedText.equals(reversedText);
    }

    void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is palindrome");
        } else {
            System.out.println(text + " is not Palindrome");
        }
    }

    public static void main(String[] args) {

        PalindromeChecker p1 = new PalindromeChecker();
        p1.text = "A man a plan a canal Panama";

        PalindromeChecker p2 = new PalindromeChecker();
        p2.text = "Hello";

        p1.displayResult();
        p2.displayResult();
    }
}
