package myarrayTest;

import java.util.Iterator;
import java.util.Scanner;

public class MyArTask1 {
	public static void main(String[] args) {
//		브론즈
//		1~10까지 배열에 담고 출력
//		int[] arData = new int[10];
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i + 1;
//			System.out.println(arData[i]);
//		}
		
//		10~1까지 중 짝수만 배열에 담고 출력
//		int[] arData = new int[5];
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = 10 - i * 2;
//			System.out.println(arData[i]);
//		}
		
//		1~100까지 배열에 담은 후 홀수만 출력
//		int[] arData = new int[100];
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i + 1;
//			System.out.print(arData[i] % 2 == 1 ? arData[i] + "\n" : "");
//		}
		
//		실버
//		1~100까지 배열에 담은 후 짝수의 합 출력
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
		
//		A~F까지 배열에 담고 출력 A B C D E F
//		char[] arData = new char[6];
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (char)(i + 65); // 자동 형변환되지 않음.
//			System.out.println(arData[i]);
//		}
//		for (char i = 'A'; i < 'G'; i++) {
//			arData[i - 65] = i;
//			System.out.println(arData[i - 65]);
//		}
		
//		A~F까지 중 C제외하고 배열에 담은 후 출력
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
		
//		골드
//		5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
//		int[] arData = new int[5];
//		int max = 0, min = 0;
//		String message = "정수를 입력해주세요.";
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

//		다이아
//		사용자가 입력할 정수의 개수만큼 배열을 만든 후 정수를 입력받고 평균 구하기
		int[] arData = null;
		int total = 0;
		double avg = 0.0;
		String firstMessage = "배열의 개수를 적어주세요.";
		Scanner sc = new Scanner(System.in);
		System.out.println(firstMessage);
		arData = new int[sc.nextInt()];
		for (int i = 0; i < arData.length; i++) {
			System.out.println("배열에 들어갈 " + (i + 1) + "번 째 정수를 입력해주세요.");
			arData[i] = sc.nextInt();
			total += arData[i];
		}
		avg = (double)total / arData.length;
		System.out.println("평균 : " + avg);
	}
}
