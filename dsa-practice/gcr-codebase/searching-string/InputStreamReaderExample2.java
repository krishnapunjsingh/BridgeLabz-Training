import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class InputStreamReaderExample2 {
    public static void main(String[] args) {
        String filepath = "Output.txt";
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            FileWriter fw = new FileWriter(filepath);

            System.out.println("Enter text (type 'exit' to stop )");
            String line;

            while ((line = br.readLine()) != null) {
                if (line.equalsIgnoreCase("exit")) {
                    break;
                }
                fw.write(line + System.lineSeparator());
            }

            fw.close(); 
            br.close();   

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
