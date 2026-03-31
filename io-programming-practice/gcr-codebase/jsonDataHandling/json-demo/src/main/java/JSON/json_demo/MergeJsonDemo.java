package JSON.json_demo;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;

public class MergeJsonDemo {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        // Read JSON files
        ObjectNode json1 = (ObjectNode) mapper.readTree(new File("C:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\jsonDataHandling\\json-demo\\src\\main\\java\\JSON\\json_demo\\student.json"));
        ObjectNode json2 = (ObjectNode) mapper.readTree(new File("C:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\jsonDataHandling\\json-demo\\src\\main\\java\\JSON\\json_demo\\json1.json"));

        // Merge json2 into json1
        json1.setAll(json2);

        // Print merged JSON
        System.out.println(
                mapper.writerWithDefaultPrettyPrinter()
                      .writeValueAsString(json1)
        );
    }
}
