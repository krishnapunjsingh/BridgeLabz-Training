
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceExample {
    public static void main(String[] args) {
        String sourceFile = "info.txt";
        try {
            FileReader fr = new FileReader(sourceFile);
            BufferedReader bd = new BufferedReader(fr);
            String firstLine = bd.readLine();
            System.out.println(firstLine);
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
