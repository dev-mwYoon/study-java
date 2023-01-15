package collectionTest;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
	
	public static void main(String[] args) {
		ArrayList<Integer> test = new ArrayList<Integer>();
		test.add(20);
		test.add(30);
		test.add(10);
//		Collections.sort(test);
		
		System.out.println("=========================");
			System.out.println(test);
		Collections.sort(test);
		
		System.out.println("=========================");
			System.out.println(test);
		
		
	}
	 
	
}
