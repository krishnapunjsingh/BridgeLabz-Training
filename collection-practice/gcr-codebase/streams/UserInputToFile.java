import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;

public class UserInputToFile {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileWriter writer = null;

        try {
            System.out.print("Enter your name: ");
            String name = br.readLine();

            System.out.print("Enter your age: ");
            String age = br.readLine();

            System.out.print("Enter your favorite programming language: ");
            String language = br.readLine();

            writer = new FileWriter("user_details.txt");
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Language: " + language + "\n");

            System.out.println("User details saved successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred while reading input or writing to file.");
        } finally {
            try {
                if (writer != null) writer.close();
                br.close();
            } catch (IOException e) {
                System.out.println("Error closing resources.");
            }
        }
    }
}
