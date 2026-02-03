package JSON.json_demo;
import com.fasterxml.jackson.databind.*;
import java.io.File;
import java.util.Iterator;
import java.util.Map;

public class PrintJsonKeysValues {
	public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = mapper.readTree(new File("C:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\jsonDataHandling\\json-demo\\src\\main\\java\\JSON\\json_demo\\data.json"));

        printJson(rootNode);
    }

    // Recursive method
    public static void printJson(JsonNode node) {

        if (node.isObject()) {
            Iterator<Map.Entry<String, JsonNode>> fields = node.fields();

            while (fields.hasNext()) {
                Map.Entry<String, JsonNode> entry = fields.next();
                System.out.println(entry.getKey() + " : " + entry.getValue());

                printJson(entry.getValue());
            }
        } 
        else if (node.isArray()) {
            for (JsonNode element : node) {
                printJson(element);
            }
        }
    }
}
