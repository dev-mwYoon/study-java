package controlStatement;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
		//		�����
		//		1~100���� ���
		//		100~1���� ���
		//		1~100���� �� ¦���� ���

		//		�ǹ�
		//		1~10���� �� ���
		//		1~n���� �� ���
		//		���
		//		A~F���� ���
		//		A~F���� �� C�����ϰ� ���

		//		���̾�
		//		0 1 2 3 0 1 2 3 0 1 2 3 ���
		//		aBcDeFgH..Z ���

		// �����
		char alpha = 'A';
		System.out.print("1~100���� ��� : ");
		for(int i=1; i<=100; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("100~1���� ���");
		for(int i=100; i>=1; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("1~100���� �� ¦���� ��� : ");
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				System.out.print(i + " ");
			}	
		}
		//		����� ����
		//		for(int i=0; i<50; i++) {
		//			System.out.println((i + 1) *2);
		//		}
		System.out.println();

		// �ǹ�
		System.out.print("1~10���� �� ��� : ");
		int result = 0;
		for(int i=1; i<=10; i++) {
			result += i;
		}
		System.out.println(result);
		result = 0;
		System.out.println("1~n���� �� ���");
		Scanner sc = new Scanner(System.in);
		System.out.print("n�� �Է��ϼ��� : ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			result += i;
		}
		System.out.println(result);
		result = 0;

		// ���
		System.out.print("A~F���� ��� : ");
		for(int i=1; i<=6; i++) {
			System.out.print(alpha + " ");
			alpha++;
		}
		//		����� ����
		//		for(int i = 0; i < 6, i ++) {
		//			System.out.println((char)(i+65));
		//		}

//		����� ����
		System.out.print("\nA~F���� �� C �����ϰ� ��� : ");
		for (int i = 0; i < 5; i++) {
			System.out.println((char)(i > 1 ? i + 66 : i + 65));
		}



		//		���̾�
		System.out.print("\n0 1 2 3 ��� : ");
		for(int i = 1; i <=3; i++) {
			for(int j = 0; j <=3; j++) {
				System.out.print(j + " ");
			}
		}
		// ����� ����
		for(int i = 0; i < 12; i++) {
			System.out.print(i%4 + "");
		}

		//����� ����
		System.out.print("\naBcD.. ��� : ");
		for(int i = 0; i < 26; i++) {
			System.out.println((char)(i%2 == 0 ? i + 97 : i + 65));
		}
	}
}
