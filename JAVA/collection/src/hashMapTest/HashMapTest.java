package hashMapTest;

import java.util.HashMap;

import org.json.JSONException;
import org.json.JSONObject;

public class HashMapTest {
	public static void main(String[] args) {
//		아이디, 비밀번호, 이름, 나이
		HashMap<String, Object> userMap = new HashMap<String, Object>();
		JSONObject userJSON = null;
		
		userMap.put("id", "hds1234");
		userMap.put("password", "1234");
		userMap.put("name", "한동석");
		userMap.put("age", 20);
		
		userJSON = new JSONObject(userMap);
		try {
			userJSON.put("gender", "선택안함");
		} catch (JSONException e) {
			e.printStackTrace();
		}
		System.out.println(userJSON);
		
//		System.out.println(userMap);
//		System.out.println(userMap.get("id"));
		
		
		
		
	}
}
