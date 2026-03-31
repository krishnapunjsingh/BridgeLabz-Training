import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UpperToLowerFileCopy {

    public static void main(String[] args) {

        String sourceFile = "source.txt";
        String destinationFile = "output.txt";

        try (
                FileReader fr = new FileReader(sourceFile);
                BufferedReader br = new BufferedReader(fr);
                FileWriter fw = new FileWriter(destinationFile);
                BufferedWriter bw = new BufferedWriter(fw)
        ) {

            int ch;
            while ((ch = br.read()) != -1) {
                bw.write(Character.toLowerCase((char) ch));
            }

            System.out.println("File converted to lowercase successfully.");

        } catch (IOException e) {
            System.out.println("File not found or IO error occurred.");
        }
    }
}
