package inputTest;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //ctrl + shift + o
		
//		�ʱⰪ : ���� � ���� ������ �� �� �ִ� ��
//		���� : 0
//		�Ǽ� : 0.0
//		���� : ' '
//		���ڿ� : null
		
		String name = "";
		System.out.print("�̸� : ");
		name = sc.next();
		System.out.println(name + "�� ȯ���մϴ�.");
		
	}
}