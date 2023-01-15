package hashMapTest;

//
import java.util.HashMap;

import org.json.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONTest {
	public static void main(String[] args) {
		User user = new User(1, "hds1234", "1234", "�ѵ���", 20);
//		��ü�� JSON�������� ����
		JSONObject userJSON = new JSONObject(user);
		JSONParser parser = new JSONParser();

		System.out.println(userJSON);

//		try {
//			User result = (User)(parser.parse(userJSON.toString()));
//			System.out.println(result);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		try {
//			JSON ������ ���ڿ��� HashMap���� ����
			HashMap<String, Object> result = (HashMap) (parser.parse(userJSON.toString()));
			System.out.println(result.get("number"));
			System.out.println(result.get("id"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
