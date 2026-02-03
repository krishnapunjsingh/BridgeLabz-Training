package JSON.json_demo;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class FilterJson {
	 public static void main(String[] args) throws Exception {

	        ObjectMapper mapper = new ObjectMapper();

	        JsonNode rootNode = mapper.readTree(new File("C:\\BridgeLabz-Training\\io-programming-practice\\gcr-codebase\\jsonDataHandling\\json-demo\\src\\main\\java\\JSON\\json_demo\\student.json"));

	        for (JsonNode user : rootNode) {
	            int age = user.get("age").asInt();

	            if (age > 25) {
	                System.out.println(user.toPrettyString());
	            }
	        }
	    }
}
