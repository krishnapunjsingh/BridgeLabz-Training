import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileNotExist {
    public static void main(String[] args) {

        String soruceFile = "input.txt";

        try {
            FileReader fileReader = new FileReader(soruceFile);
            BufferedReader br = new BufferedReader(fileReader);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("File Not Found");
        }
    }
}
