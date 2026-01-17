
import java.io.BufferedReader;
import java.io.FileReader;

public class OccuranceUsingFileReader {
    public static void main(String[] args) {
        String filePath = "Sample.txt";
        String targetWord = "java";
        int count = 0;
        try {
            FileReader fr = new FileReader(filePath);
            BufferedReader bd = new BufferedReader(fr);
            String line;
            while((line = bd.readLine() ) != null){
                String[] words = line.split("\\s+");
                for(String word : words){
                    word = word.toLowerCase().replaceAll("[^a-z]", "");
                    if(word.equals(targetWord.toLowerCase())){
                        count++;
                    }
                }
            }
            System.out.println("The word '" + targetWord + "' appears " + count + " times in the file.");
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
