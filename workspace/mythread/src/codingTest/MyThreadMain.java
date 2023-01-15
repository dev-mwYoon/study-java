package codingTest;
//package codingTest;
//
//import java.util.Scanner;
//import java.util.stream.IntStream;
//
//import javax.sql.rowset.Joinable;
//
//// 제한시간 : 1시간
//// 3개의 쓰레드가 있다.
//// Thread1, Thread2, Thread3
//// 사용자가 입력한 순서대로 각 알맞는 문자열이 출력된다.
//
//// 입력 예) 3 1 2
//// 출력 예) third first second
//
//// 단, Thread들은 항상 1, 2, 3 순서로 실행되어야 한다.
//
//// Thread1 : third
//// Thread2 : first
//// Thread3 : second
//
//// 출력 시 쓰레드의 번호도 출력할 경우 가산점으로 처리한다.
//public class ThreadMain {
//	
//	public boolean check(int[] intpuNumber, String hangle) {
//		
//		for (int i = 0; i < intpuNumber.length; i++) {
//			hangle.indexOf(i) == indintpuNumber[i]; 
//		}
//		intpuNumbe
//		
//		return true;
//	}
//	
//	
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String input = null;
//		String hangle = "공일이삼";
//		String[] output = {"first", "second", "third"};
////		String[] order = 
//		int[] outputNumber = new int[3];
//		ThreadTask t = new ThreadTask();
//		Runnable first = null;
//		Runnable second = null;
//		Runnable third = null;
//		
//		
//		
//		
//		
////		input = sc.nextLine();
//		input = "3 1 2";
//		String[] inputNumber = input.split(" ");
//		
////		c -> hangle.indexOf(c)
////		hangle::indexOf
////		hangle.chars().map(hangle::indexOf).filter(i -> i == Integer.parseInt(inputNumber[i])).forEach(i -> outputNumber[i] = i);
////		hangle.chars().map(hangle::indexOf).filter(i -> i == Integer.parseInt(inputNumber[0]))
////	      .filter(i -> i == Integer.parseInt(inputNumber[1]))
////	      .filter(i -> i == Integer.parseInt(inputNumber[2])).forEach(i -> outputNumber[i] = i);
//	    hangle.chars().filter(i -> hangle.indexOf(i) == Integer.parseInt(inputNumber[i])).forEach(i -> System.out.println(i));
//		
//		first = () -> {
//			System.out.println("입력 : " + inputNumber[0] + "\n출력 : " + outputNumber[0]);
//			try {Thread.sleep(500);} catch (InterruptedException e) {;}
//		};
//		second = () -> {
//			System.out.println("입력 : " + inputNumber[1] + "\n출력 : " + outputNumber[1]);
//			try {Thread.sleep(500);} catch (InterruptedException e) {;}
//		};
//		third = () -> {
//			System.out.println("입력 : " + inputNumber[2] + "\n출력 : " + outputNumber[2]);
//			try {Thread.sleep(500);} catch (InterruptedException e) {;}
//		};
//		
//		
//		
//		t.printFirst(first);
//		t.printSecond(second);
//		t.printThird(third);
//		
//		
//		
//		
//	}
//	
//	
//}
