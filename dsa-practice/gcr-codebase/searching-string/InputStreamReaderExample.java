
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class InputStreamReaderExample {
    public static void main(String[] args) {
        String filePath = "Sample.txt";
        try {
            //read the data (binary data) in bytes- byte stream
            FileInputStream fis = new FileInputStream(filePath);
            
            //acts as brifge between byte stream and char stream, read the bytes and decode them into character using a charset 
            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);

            //read the file into chunks 
            BufferedReader bf = new BufferedReader(isr);
            String line;
            while((line = bf.readLine())!= null){
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Error is: " + e.getMessage());
        }
    }
}
