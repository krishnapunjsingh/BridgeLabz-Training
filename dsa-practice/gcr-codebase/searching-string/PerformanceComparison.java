import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class PerformanceComparison {

    public static void main(String[] args) {

       
        int n = 1_000_000;

        StringBuilder sb = new StringBuilder();
        long startBuilder = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sb.append("hello");
        }
        long endBuilder = System.nanoTime();
        System.out.println("StringBuilder Time: " + (endBuilder - startBuilder) + " ns");

        StringBuffer sbb = new StringBuffer();
        long startBuffer = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sbb.append("hello");
        }
        long endBuffer = System.nanoTime();
        System.out.println("StringBuffer Time: " + (endBuffer - startBuffer) + " ns");

       
        String filePath = "LargeFile.txt"; 

        long startFR = System.nanoTime();
        int wordCountFR = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCountFR += words.length;
            }
            br.close();
        } catch (Exception e) {
            System.out.println("FileReader Error: " + e.getMessage());
        }

        long endFR = System.nanoTime();
        System.out.println("FileReader Word Count: " + wordCountFR);
        System.out.println("FileReader Time: " + (endFR - startFR) + " ns");

        long startISR = System.nanoTime();
        int wordCountISR = 0;

        try {
            FileInputStream fis = new FileInputStream(filePath);
            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr);

            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCountISR += words.length;
            }
            br.close();
        } catch (Exception e) {
            System.out.println("InputStreamReader Error: " + e.getMessage());
        }

        long endISR = System.nanoTime();
        System.out.println("InputStreamReader Word Count: " + wordCountISR);
        System.out.println("InputStreamReader Time: " + (endISR - startISR) + " ns");
    }
}
