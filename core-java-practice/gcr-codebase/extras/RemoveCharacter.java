import java.util.Scanner;

class RemoveCharacter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter character to remove: ");
        char removeChar = sc.next().charAt(0);

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != removeChar) {
                result = result + ch;
            }
        }

        System.out.println("Modified String: \"" + result + "\"");
    }
}
