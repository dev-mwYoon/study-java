package myarrayTest;

import java.util.Iterator;
import java.util.Scanner;

public class MyArTask2 {
	public static void main(String[] args) {
//		각 버튼을 눌렀을 때 이동하는 페이지는 다음과 같다.
		
//		btn1 : 회원가입 페이지
//		btn2 : 로그인 페이지
//		btn3 : 마이 페이지
		
//		회원가입 -> 로그인 -> 마이 페이지
//		위 순서대로 입력해야 하며, 만약 이전 단계를 진행하기 전에 다음 단계 버튼을 누를 경우, 이전 단계에 대한 메시지를 출력해준다.
//		예) 로그인 클릭 시, "회원가입을 먼저 진행해주세요" 출력
		
//		알맞은 단계의 버튼을 누르면, 해당 단계에 대한 메세지를 출력해준다.
//		예) 회원가입 클릭 시, 회원가입 성공
//			마이 페이지 클릭 시, 본인 이름과 나이 출력
		
		String[] arBtn = {"btn1", "btn2", "btn3"};
		String[] arSucMsg = {"회원가입 성공", "로그인 성공", "윤민우(23)"};
		String[] arErMsg = {"잘못 입력하셨습니다.","회원가입을 먼저 진행해주세요", "로그인을 먼저 진행해주세요"};
		int click = 0;
		String firstMsg = "버튼을 클릭 해주세요. 입력 예)1\n버튼 목록 예시";
		Scanner sc = new Scanner(System.in);
		
		

		
//		// 첫번째
//		while(true) {
//			System.out.println(firstMsg);
//			for (int i = 0; i < arBtn.length; i++) {
//				System.out.println(arBtn[i]);
//			}
//			click = sc.nextInt();
//			if (click == 1) {
//				System.out.println(arSucMsg[0]);
//				break;
//			} 
//			// 로그인부터 눌렀을 때
//			else if (click == 2) {
//				System.out.println(arErMsg[1]);
//			} 
//			// 마이페이지부터 눌렀을 때
//			else if (click == 3){
//				System.out.println(arErMsg[2]);
//			} 
//			// 아예 잘못 눌렀을 때
//			else {
//				System.out.println(arErMsg[0]);
//			}
//		}
//		// 두번째
//		while(true) {
//			System.out.println(firstMsg);
//			for (int i = 0; i < arBtn.length; i++) {
//				System.out.println(arBtn[i]);
//			}
//			click = sc.nextInt();
//			if (click == 1) {
//				System.out.println(arSucMsg[0]);
//			} 
//			// 로그인 눌렀을 때
//			else if (click == 2) {
//				System.out.println(arSucMsg[1]);
//				break;
//			} 
//			// 마이페이지 눌렀을 때
//			else if (click == 3){
//				System.out.println(arErMsg[2]);
//			} 
//			// 아예 잘못 눌렀을 때
//			else {
//				System.out.println(arErMsg[0]);
//			}
//		}
//		//세번째
//		while(true) {
//			System.out.println(firstMsg);
//			for (int i = 0; i < arBtn.length; i++) {
//				System.out.println(arBtn[i]);
//			}
//			click = sc.nextInt();
//			if (click == 1) {
//				System.out.println(arSucMsg[0]);
//			} 
//			// 로그인 눌렀을 때
//			else if (click == 2) {
//				System.out.println(arSucMsg[1]);
//			} 
//			// 마이페이지 눌렀을 때
//			else if (click == 3){
//				System.out.println(arSucMsg[2]);
//				break;
//			} 
//			// 아예 잘못 눌렀을 때
//			else {
//				System.out.println(arErMsg[0]);
//			}
//		}
		
		
		for (int i = 0; i < arBtn.length; i++) {
			System.out.println(firstMsg);
			System.out.println("1. " + arBtn[0]);
			System.out.println("2. " + arBtn[1]);
			System.out.println("3. " + arBtn[2]);
			click = sc.nextInt();
			switch (click) {
			case 1:
				if (i == 0) {
					System.out.println(arSucMsg[i]);
					break;
				} else{
					System.out.println(arSucMsg[0]);
					i--;
					break;
				}
			case 2:
				if (i == 1) {
					System.out.println(arSucMsg[i]);
					break;
				} else if(i < 1) { // 첫시도인데 2번을 누름
					System.out.println(arErMsg[1]);
					i--;
					break;
				} else { // 마지막 시도일 때 2번을 누름
					System.out.println(arSucMsg[1]);
					i--;
					break;
				}
			case 3:
				if (i == 2) {
					System.out.println(arSucMsg[i]);
					break;
				} else { // 첫번째 혹은 두번째 시도에 3번을 누름.
					System.out.println(arErMsg[2]);
					i--;
					break;
				}
			}
		}
		
	}
}
