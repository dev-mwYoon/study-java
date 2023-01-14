package exceptionTest;

import java.util.Scanner;

public class Chatting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = null;
		
		System.out.print("메시지 : ");
		message = sc.nextLine();	// 공백까지 받을 때
		
		if(message.contains("바보")) {
			try {
				throw new BadWorldException("욕설은 안돼요!");	// alt + shift + z = 해당 블럭을 어떤 문법으로 감쌀지.
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				e.printStackTrace();
			}	// 예외를 필드에 올려서 발생시키는 것을 예외 던지기(throw)
		}
	}
}
