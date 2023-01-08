package mybank;

import java.util.Random;

public class test {
	public static void main(String[] args) {
		Random random = new Random();
		
		int randomNumber = random.nextInt(2);
		
		System.out.println(randomNumber);
	}
}
