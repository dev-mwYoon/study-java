package codingTest;
//package codingTest;
//
//import java.util.Scanner;
//import java.util.stream.IntStream;
//
//import javax.sql.rowset.Joinable;
//
//// ���ѽð� : 1�ð�
//// 3���� �����尡 �ִ�.
//// Thread1, Thread2, Thread3
//// ����ڰ� �Է��� ������� �� �˸´� ���ڿ��� ��µȴ�.
//
//// �Է� ��) 3 1 2
//// ��� ��) third first second
//
//// ��, Thread���� �׻� 1, 2, 3 ������ ����Ǿ�� �Ѵ�.
//
//// Thread1 : third
//// Thread2 : first
//// Thread3 : second
//
//// ��� �� �������� ��ȣ�� ����� ��� ���������� ó���Ѵ�.
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
//		String hangle = "�����̻�";
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
//			System.out.println("�Է� : " + inputNumber[0] + "\n��� : " + outputNumber[0]);
//			try {Thread.sleep(500);} catch (InterruptedException e) {;}
//		};
//		second = () -> {
//			System.out.println("�Է� : " + inputNumber[1] + "\n��� : " + outputNumber[1]);
//			try {Thread.sleep(500);} catch (InterruptedException e) {;}
//		};
//		third = () -> {
//			System.out.println("�Է� : " + inputNumber[2] + "\n��� : " + outputNumber[2]);
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
