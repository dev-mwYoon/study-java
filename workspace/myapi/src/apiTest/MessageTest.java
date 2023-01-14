package apiTest;

import java.util.HashMap;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class MessageTest {
	public static void main(String[] args) {
		String api_key = "NCSOI8BWPFVQSSKZ";
		String api_secret = "Y35VV7M6OADT2TO3HVCZWM8KIDGMPBQL";
		Message coolsms = new Message(api_key, api_secret);

		// 4 params(to, from, type, text) are mandatory. must be filled
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("to", "01020024879");	// ±èµ¿ÇÑ"01020024879" ±è¼¼À± "01056337014"
		params.put("to", "01056337014");
		params.put("from", "01037091903");
		params.put("type", "SMS");
		params.put("text", "°øºÎÁ»ÇÏ¼¼¿ä");
		params.put("app_version", "test app 1.2"); // application name and version

		try {
			JSONObject obj = (JSONObject) coolsms.send(params);
			System.out.println(obj.toString());
		} catch (CoolsmsException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCode());
		}
	}
}
