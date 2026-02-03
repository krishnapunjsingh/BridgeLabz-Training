package JSON.json_demo;
//package JSON.json_demo;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class ReadSpecificFields {
	public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        // Read JSON file
        JsonNode rootNode = mapper.readTree(new File("C:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\jsonDataHandling\\json-demo\\src\\main\\java\\JSON\\json_demo\\student.json"));

        // Extract specific fields
        String name = rootNode.get("name").asText();
        String email = rootNode.get("email").asText();

        System.out.println("Name  : " + name);
        System.out.println("Email : " + email);
    }
}
