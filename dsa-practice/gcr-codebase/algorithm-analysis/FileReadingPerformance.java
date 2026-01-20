import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReadingPerformance {

    private static final String FILE_PATH = "largefile.txt"; 

    public static void main(String[] args) throws IOException {

        long start, end;

        // Using FileReader (Character Stream) 
        FileReader fileReader = new FileReader(FILE_PATH);
        BufferedReader br1 = new BufferedReader(fileReader);

        start = System.currentTimeMillis();
        while (br1.read() != -1) {
        }
        end = System.currentTimeMillis();

        System.out.println("FileReader Time: " + (end - start) + " ms");
        br1.close();

        //  Using InputStreamReader (Byte Stream)
        InputStreamReader inputStreamReader =
                new InputStreamReader(new FileInputStream(FILE_PATH));
        BufferedReader br2 = new BufferedReader(inputStreamReader);

        start = System.currentTimeMillis();
        while (br2.read() != -1) {
           
        }
        end = System.currentTimeMillis();

        System.out.println("InputStreamReader Time: " + (end - start) + " ms");
        br2.close();
    }
}
