package JSON.json_demo;
import com.fasterxml.jackson.databind.*;
import java.io.File;

public class FilterJsonByAge {
	public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        // Read JSON array
        JsonNode rootNode = mapper.readTree(new File("C:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\jsonDataHandling\\json-demo\\src\\main\\java\\JSON\\json_demo\\student.json"));

        System.out.println("Students with age > 25:");

        for (JsonNode node : rootNode) {
            int age = node.get("age").asInt();

            if (age > 25) {
                System.out.println(node.toPrettyString());
            }
        }
    }
}
