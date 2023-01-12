package mycollectionTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class UserField {
	public ArrayList<User> users = DBConnecter.users;
	// 암호화 시 쓸 KEY
	final static int KEY = 99;
//	아이디 중복검사
	public User idCheck(String id) {
		for (int i = 0; i < users.size(); i++) {
			if(users.get(i).getId().equals(id)) {
				return users.get(i);
			}
		}
		return null;
	}
// 	회원가입
	public void sign(String name, String id, String password, String phoneNumber) {
			User user = new User();
			user.setId(id);
			user.setName(name);
			user.setPassword(encry(password));
			user.setPhoneNumber(phoneNumber);
			users.add(user);
	}
	
//	로그인
	public User login(String id, String password) {
		User user = new User();
		for (int i = 0; i < users.size(); i++) {
			if(users.get(i).getId().equals(id) && users.get(i).getPassword().equals(encry(password))) {
				user = users.get(i);
				return user;
			}
		}
		return null;
	}
	
//	로그인 확인
	public boolean loginCheck(String id, String password) {
		for (int i = 0; i < users.size(); i++) {
			if(users.get(i).getId().equals(id) && users.get(i).getPassword().equals(encry(password))) {
				return true;
			}
		}
		return false;
	}
	
//	암호화
	public String encry(String password) {
		String encryPw = "";
		 for (int i = 0; i < password.length(); i++) {
			encryPw += (char)(password.charAt(i) * KEY);
		}
		return encryPw;
	}
	
//	비밀번호 찾기 서비스
	public String findPw(String phoneNumber) {
		User user = new User();
		String encryPw = null;
		String password = "";
		for (int i = 0; i < users.size(); i++) {
			if(users.get(i).getPhoneNumber().equals(phoneNumber)) {
				user = users.get(i);
				break;
			}
		}

		encryPw = user.getPassword();
		
		for (int i = 0; i < encryPw.length(); i++) {
			password += (char)(encryPw.charAt(i) / KEY);
		}
		
		return password;
	}
	
//	비밀번호 변경
	public void pwChange(User user, String changePw) {
		user.setPassword(encry(changePw));
		users.set(users.indexOf(user), user);
	}
	
//	비밀번호 체크
	public boolean pwCheck(User user, String pw) {
		if(user.getPassword().equals(encry(pw))) {
			return true;
		}
		return false;
	}
	
	
//	인증번호 전송
	public String smsCheck(String phonNumber) {
		String sendPhone = null;
		String number = "";
		number = number();
		
		for (int i = 0; i < users.size(); i++) {
			if(users.get(i).getPhoneNumber().equals(phonNumber)) {
				sendPhone = phonNumber;
				break;
			}else {
				return null;
			}
		}
		   String api_key = ""; //
	       String api_secret = "";//
	       Message coolsms = new Message(api_key, api_secret);

	       // 4 params(to, from, type, text) are mandatory. must be filled
	       HashMap<String, String> params = new HashMap<String, String>();
	       params.put("to", sendPhone);
	       params.put("from", sendPhone );
	       params.put("type", "SMS");
	       params.put("text", "인증번호 : " + number);
	       params.put("app_version", "test app 1.2"); // application name and version

	       try {
	         JSONObject obj = (JSONObject) coolsms.send(params);
	       } catch (CoolsmsException e) {
	         System.out.println(e.getMessage());
	         System.out.println(e.getCode());
	       }
	       System.out.println(number);
		return number;
	}
	
	// 인증번호 뽑아주는 메소드
	public String number() {
		final int SEND_NUMBER = 4;
		Random r = new Random();
		String number = "";	
		
		for (int i = 0; i < SEND_NUMBER; i++) {
			number += r.nextInt(10);
		}
		return number;
	}
	
//	핸드폰 중복 검사
	public boolean phoneNumberCheck(String phoneNumber) {
		for (int i = 0; i < users.size(); i++) {
			if(users.get(i).getPhoneNumber().equals(phoneNumber)) {
				return true;
			}
		}
		return false;
	}
	
//	해당되는 아이디의 핸드폰번호와 같은지 검사하는 메소드
	public boolean phoneNumberCheck(String phoneNumber,String id) {
		for (int i = 0; i < users.size(); i++) {
			if(users.get(i).getPhoneNumber().equals(phoneNumber) && users.get(i).getId().equals(id)) {
				return true;
			}
		}
		return false;
	}
	
}
