package lambdaTask2;

import java.util.Iterator;

public class test {
	public static void main(String[] args) {
//		String temp = " A + B - C ";
//		System.out.println(temp);
//		System.out.println(temp.length());
//		System.out.println(temp.trim());
//		System.out.println(temp.trim().length());
		
		String e = "-1+1+2";
		String[] numbers = null;
		numbers = e.split("\\+|\\-");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}
