package objectTest;

import java.util.Random;

public class HashCodeTest {
	public static void main(String[] args) {
		Random r = new Random();
		
		System.out.println(r.hashCode());
		
		String data1 = "ABC";
		String data2 = "ABC";
		String data3 = new String("ABC");
		
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data1.toString());
		System.out.println(data2.toString());
		System.out.println(data1.hashCode());	// 재정의
		System.out.println(data2.hashCode());	// 재정의
		
	}
}
