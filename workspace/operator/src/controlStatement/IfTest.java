package controlStatement;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		int num1 = 0, num2 = 0;
		String result = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ���� ���� �Է� : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if(num1 > num2) {
			result = "ū �� : " + num1;
		} else if(num1 < num2) {
			result = "ū �� : " + num2;
		} else {
			result = "�� ���� �����ϴ�.";
		}
		System.out.println(result);
	}
}