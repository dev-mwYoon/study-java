package exceptionTest;

import java.util.Scanner;

public class Chatting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = null;
		
		System.out.print("�޽��� : ");
		message = sc.nextLine();	// ������� ���� ��
		
		if(message.contains("�ٺ�")) {
			try {
				throw new BadWorldException("�弳�� �ȵſ�!");	// alt + shift + z = �ش� ���� � �������� ������.
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				e.printStackTrace();
			}	// ���ܸ� �ʵ忡 �÷��� �߻���Ű�� ���� ���� ������(throw)
		}
	}
}
