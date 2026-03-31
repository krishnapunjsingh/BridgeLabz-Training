import java.util.Scanner;

public class ReplaceMultipleSpaces {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String input = sc.nextLine();

        String result = input.replaceAll("\\s+", " ");

        System.out.println("Output:");
        System.out.println(result);

    }
}
