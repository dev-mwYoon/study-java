package mymethodTest;

import java.util.Iterator;
import java.util.Scanner;

public class MyMethodTask {
	public static void main(String[] args) {
		MyMethodTask mt = new MyMethodTask();
//	1~10���� println()���� ����ϴ� �޼ҵ�

//	"ȫ�浿"�� n�� println()���� ����ϴ� �޼ҵ�

//	�̸��� n�� println()���� ����ϴ� �޼ҵ�

//	�� ������ ������ ���ִ� �޼ҵ�

//		�� ������ �������� ���ִ� �޼ҵ�(��� ������ �� ��)

//		1~n������ ���� �����ִ� �޼ҵ�

//		Ȧ���� ¦����, ¦���� Ȧ���� �ٲ��ִ� �޼ҵ�

//		���ڿ��� �Է¹ް� �ҹ��ڴ� �빮�ڷ�, �빮�ڴ� �ҹ��ڷ� �ٲ��ִ� �޼ҵ�

//		���ڿ��� �Է¹ް� ���ϴ� ������ ������ �����ִ� �޼ҵ�

//		5���� ������ �Է¹��� �� ���ϴ� �ε����� ���� �����ִ� �޼ҵ�
		
//		5���� ������ �Է¹��� �� ���ϴ� �ε����� ���� �����ִ� �޼ҵ�(void)
		int[] number = {5, 3, 1, 2, 4};
		int[] result = new int[2];
		mt.getMaxMin(number, result);
	
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		

//		indexOf() �����
//		���ڿ��� ���ڸ� �Է¹��� �� �ش� ���ڰ� �� ��° �ε����� �ִ��� �˻��ϰ�
//		���� �ش� ���ڰ� ������ -1�� �����Ѵ�.
//		MyMethodTask mt = new MyMethodTask();
//		System.out.println(mt.indexOf("ABC1211", '1'));
	}

//	1~10���� println()���� ����ϴ� �޼ҵ�
	void print1to10() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
	}

//	"ȫ�浿"�� n�� println()���� ����ϴ� �޼ҵ�
	void printHong(int count) {
		for (int i = 0; i < count; i++) {
			System.out.println(i + ". ȫ�浿");
		}
	}

//	�̸��� n�� println()���� ����ϴ� �޼ҵ�
	void printName(String name, int count) {
		for (int i = 0; i < count; i++) {
			System.out.println(name);
		}
	}

//	�� ������ ������ ���ִ� �޼ҵ�
	int sub(int number1, int number2, int number3) {
		int result = number1 - number2 - number3;
		return result;
	}

//	�� ������ �������� ���ִ� �޼ҵ�(��� ������ �� ��)
	int[] div(int number1, int number2) {
		int[] result = null;
		if (number2 != 0) {
			result = new int[2];
			result[0] = number1 / number2;
			result[1] = number1 % number2;
		}
		return result;
	}

//	1~n������ ���� �����ִ� �޼ҵ�
	int add(int count) {
		int total = 0;
		for (int i = 0; i < count; i++) {
			total += i + 1;
		}
		return total;
	}

//	Ȧ���� ¦����, ¦���� Ȧ���� �ٲ��ִ� �޼ҵ�
	int change(int number) {
		return ++number;
	}

//	���ڿ��� �Է¹ް� �ҹ��ڴ� �빮�ڷ�, �빮�ڴ� �ҹ��ڷ� �ٲ��ִ� �޼ҵ�
//	65~90 , 97~122
	String changeString(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= 65 && c <= 97) {
				result += (char) (c + 32);
			} else if (c >= 97 && c <= 122) {
				result += (char) (c - 32);
			}
		}
		return result;
	}

//	���ڿ��� �Է¹ް� ���ϴ� ������ ������ �����ִ� �޼ҵ� - ex) apple���� p�� ����
	int charCount(String str, char c) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}

//	5���� ������ �Է¹��� �� ���ϴ� �ε����� ���� �����ִ� �޼ҵ�
	int whereIndex(int[] number, int index) {
//		number = new int[5];
		return number[index];
	}

//	�ѱ��� ������ �ٱ��ִ� �޼ҵ�(�ϰ��̻� -> 1024)
	int changeHangle(String str) {
		String hangle = "�����̻�����ĥ�ȱ�";
		String result = "";
		for (int i = 0; i < str.length(); i++) {
//			str�� ù��° ���ڰ� hangle�� ���° ���ڿ� �ִ�.
			result += hangle.indexOf(str.charAt(i));
		}
		return Integer.parseInt(result);
	}
//	5���� ������ �Է¹ް� �ִ밪�� �ּҰ��� �����ִ� �޼ҵ�
	int[] getMaxMin(int[] number) {
		int[] result = new int[2];
		for (int i = 0; i < result.length; i++) {
			result[i] = number[0];
		}
		for (int i = 0; i < number.length; i++) {
			if (result[0] > number[i]) {
				result[0] = number[i];
			}
			if (result[1] < number[i]) {
				result[1] = number[i];
			}
		}
		return result;
	}
	
//	5���� ������ �Է¹ް� �ִ밪�� �ּҰ��� �����ִ� �޼ҵ�(void)
	void getMaxMin(int[] number, int[] result) {
		for (int i = 0; i < result.length; i++) {
			result[i] = number[0];
		}
		for (int i = 0; i < number.length; i++) {
			if (result[0] > number[i]) {
				result[0] = number[i];
			}
			if (result[1] < number[i]) {
				result[1] = number[i];
			}
		}
	}

//	indexOf() �����
//	���ڿ��� ���ڸ� �Է¹��� �� �ش� ���ڰ� �� ��° �ε����� �ִ��� �˻��ϰ�
//	���� �ش� ���ڰ� ������ -1�� �����Ѵ�.
//	int indexOf(String str, char c){
//		int result = 0;
//		for (int i = 0; i < str.length(); i++) {
//			if (c == str.charAt(i)) {
////				result ++;
//				return i;
//			}
//		}
////		if(result == 0) {result = -1;}
////		return result;
//		return -1;
//	}

}
