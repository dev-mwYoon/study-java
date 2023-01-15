package hashMapTest;

import java.util.HashMap;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONTask {
	public static void main(String[] args) {
		User user = new User(1, "hds1234", "1234", "ÇÑµ¿¼®", 20);
		JSONObject userJSON = new JSONObject(user);
		JSONObject infoJSON = new JSONObject(user);
		JSONParser parser = new JSONParser();
		
		
		try {
			infoJSON.put("info", userJSON);
			System.out.println(infoJSON);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			HashMap<String, Object> infoMap = (HashMap)parser.parse(infoJSON.toString());
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
