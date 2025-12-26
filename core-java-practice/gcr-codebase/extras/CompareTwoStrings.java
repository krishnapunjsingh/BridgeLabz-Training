import java.util.Scanner;

class CompareTwoStrings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        int i = 0;
        int minLength = Math.min(str1.length(), str2.length());

        while (i < minLength) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);

            if (c1 < c2) {
                System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
                return;
            } 
            else if (c1 > c2) {
                System.out.println("\"" + str2 + "\" comes before \"" + str1 + "\" in lexicographical order");
                return;
            }
            i++;
        }

        if (str1.length() < str2.length()) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
        } 
        else if (str1.length() > str2.length()) {
            System.out.println("\"" + str2 + "\" comes before \"" + str1 + "\" in lexicographical order");
        } 
        else {
            System.out.println("Both strings are equal");
        }
    }
}
