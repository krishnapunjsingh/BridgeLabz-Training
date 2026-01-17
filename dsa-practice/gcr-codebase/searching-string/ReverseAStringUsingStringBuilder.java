public class ReverseAStringUsingStringBuilder {
    
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    
    public static void main(String[] args) {
        String original = "Hello World";
        String reversed = reverseString(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}