package Jsonoperations;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class jsonwriting {

	public static void main(String[] args) throws IOException {
		JSONObject jsonobject = new JSONObject();
		jsonobject.put("Name","haema");
		jsonobject.put("Age", "23");
		JSONArray array = new JSONArray();
		array.add("sedhu");
		array.add("haema");
		jsonobject.put("arrays", array);
		FileWriter writer = new FileWriter("demo.json");
		writer .write(jsonobject.toJSONString());
		writer.close();
		
		
	}

}
