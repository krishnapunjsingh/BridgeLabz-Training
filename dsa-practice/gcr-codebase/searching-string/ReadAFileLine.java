import java.io.BufferedReader;
import java.io.FileReader;

public class ReadAFileLine {
    public static void main(String[] args) {
        String filePath = "Sample.txt";
        try {
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine())!= null){
               System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
    
}
