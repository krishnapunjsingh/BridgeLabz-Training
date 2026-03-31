package JSON.json_demo;
import org.json.JSONArray;
import org.json.JSONObject;
public class StudentJsonObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONArray arr = new JSONArray();
        arr.put("Java");
        arr.put("Math");

        JSONObject obj = new JSONObject();
        obj.put("name", "Tanuj");
        obj.put("age", 21);
        obj.put("subjects", arr);

        System.out.println(obj.toString());

	}

}
