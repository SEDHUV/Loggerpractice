package Jsonoperations;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class jsonreading {

	public static void main(String[] args) throws IOException, ParseException {
		JSONParser parser = new JSONParser();
		FileReader reader = new FileReader("demo.json");
		Object parsedobject =  parser.parse(reader);
		JSONObject jsonobject = (JSONObject) parsedobject;
		String age = (String) jsonobject.get("Age");
		System.out.println(age);
		JSONArray Arrays = (JSONArray)jsonobject.get("arrays");
		System.out.println(Arrays);
		Iterator iterator = Arrays.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		
	}

}
