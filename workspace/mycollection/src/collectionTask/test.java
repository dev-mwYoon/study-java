package collectionTask;

import java.util.ArrayList;
//private String name;
//private String id;
//private String password;
//private String phoneNumber;
public class test {
	
	
	public static void main(String[] args) {
		
		ArrayList<User> users = DBConnecter.users;
		UserField userField = new UserField();
		User user = new User();
		
		user.setId("abc");
		user.setName("���ο�");
		user.setPassword("1234");
		user.setPhoneNumber("01012341234");
		
		
		userField.signUp(user);
		
		user.setCertificationNumber("2321");	// ������ȣ ��ü �־�а�.
		
		
		
		int index = 0;
		
		user = users.get(0);
		
		System.out.println(users.indexOf(0));
		
		
		System.out.println(user);

	}
}
