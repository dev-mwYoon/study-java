package myarrayTest;

import java.util.Iterator;
import java.util.Scanner;

public class MyArTask1 {
	public static void main(String[] args) {
//		�����
//		1~10���� �迭�� ��� ���
//		int[] arData = new int[10];
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i + 1;
//			System.out.println(arData[i]);
//		}
		
//		10~1���� �� ¦���� �迭�� ��� ���
//		int[] arData = new int[5];
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = 10 - i * 2;
//			System.out.println(arData[i]);
//		}
		
//		1~100���� �迭�� ���� �� Ȧ���� ���
//		int[] arData = new int[100];
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i + 1;
//			System.out.print(arData[i] % 2 == 1 ? arData[i] + "\n" : "");
//		}
		
//		�ǹ�
//		1~100���� �迭�� ���� �� ¦���� �� ���
//		int[] arData = new int[100];
//		int total = 0;
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i + 1;
//			total = arData[i] % 2 == 0 ? total + arData[i] : total + 0;
////			if (arData[i] % 2 == 0) {
////				total = total + arData[i];
////			}
//		}
//		System.out.println(total);
		
//		A~F���� �迭�� ��� ��� A B C D E F
//		char[] arData = new char[6];
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (char)(i + 65); // �ڵ� ����ȯ���� ����.
//			System.out.println(arData[i]);
//		}
//		for (char i = 'A'; i < 'G'; i++) {
//			arData[i - 65] = i;
//			System.out.println(arData[i - 65]);
//		}
		
//		A~F���� �� C�����ϰ� �迭�� ���� �� ���
//		char[] arData = new char[6];
//		for (int i = 0; i < arData.length; i++) {
//			if (i == 2) {
//				continue;
//			}
//			arData[i] = (char)(i + 65);
//			System.out.println(arData[i]);
//		}
//		------------------------
//		char[] arData = new char[5];
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (char)(i > 1 ? i + 66 : i+65);
//			System.out.println(arData[i]);
//		}
		
//		���
//		5���� ������ �Է¹ް� �迭�� ���� �� �ִ밪�� �ּҰ� ���
//		int[] arData = new int[5];
//		int max = 0, min = 0;
//		String message = "������ �Է����ּ���.";
//		Scanner sc = new Scanner(System.in);
//		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(message);
//			arData[i] = sc.nextInt();
//			if (i == 0) {
//				max = arData[i];
//				min = arData[i];
//			}
//			max = max > arData[i] ? max : arData[i];
//			min = min < arData[i] ? min : arData[i];
//		}
//		System.out.printf("max : %d, min : %d", max, min);

//		���̾�
//		����ڰ� �Է��� ������ ������ŭ �迭�� ���� �� ������ �Է¹ް� ��� ���ϱ�
		int[] arData = null;
		int total = 0;
		double avg = 0.0;
		String firstMessage = "�迭�� ������ �����ּ���.";
		Scanner sc = new Scanner(System.in);
		System.out.println(firstMessage);
		arData = new int[sc.nextInt()];
		for (int i = 0; i < arData.length; i++) {
			System.out.println("�迭�� �� " + (i + 1) + "�� ° ������ �Է����ּ���.");
			arData[i] = sc.nextInt();
			total += arData[i];
		}
		avg = (double)total / arData.length;
		System.out.println("��� : " + avg);
	}
}
