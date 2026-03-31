package JSON.json_demo;
import java.io.*;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeJsonFiles {
    public static void main(String[] args){
			
    	try {
            ObjectMapper mapper = new ObjectMapper();

            // Read JSON files
            JsonNode json1 = mapper.readTree(new File("C:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\jsonDataHandling\\json-demo\\src\\main\\java\\JSON\\json_demo\\student.json"));
            JsonNode json2 = mapper.readTree(new File("C:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\jsonDataHandling\\json-demo\\src\\main\\java\\JSON\\json_demo\\json1.json"));

            // Ensure both are ObjectNodes
            ObjectNode merged = mapper.createObjectNode();
            if (json1.isObject()) merged.setAll((ObjectNode) json1);
            if (json2.isObject()) merged.setAll((ObjectNode) json2);

            // Print merged JSON
            String result = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(merged);
            System.out.println(result);

        } catch (Exception e) {
            e.printStackTrace();
        }
	}
}
