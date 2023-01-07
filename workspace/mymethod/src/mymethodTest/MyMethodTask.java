package mymethodTest;

import java.util.Iterator;
import java.util.Scanner;

public class MyMethodTask {
	public static void main(String[] args) {
		MyMethodTask mt = new MyMethodTask();
//	1~10까지 println()으로 출력하는 메소드

//	"홍길동"을 n번 println()으로 출력하는 메소드

//	이름을 n번 println()으로 출력하는 메소드

//	세 정수의 뺄셈을 해주는 메소드

//		두 정수의 나눗셋을 해주는 메소드(몫과 나머지 둘 다)

//		1~n까지의 합을 구해주는 메소드

//		홀수를 짝수로, 짝수를 홀수로 바꿔주는 메소드

//		문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드

//		문자열을 입력받고 원하는 문자의 개수를 구해주는 메소드

//		5개의 정수를 입력받은 후 원하는 인덱스의 값을 구해주는 메소드
		
//		5개의 정수를 입력받은 후 원하는 인덱스의 값을 구해주는 메소드(void)
		int[] number = {5, 3, 1, 2, 4};
		int[] result = new int[2];
		mt.getMaxMin(number, result);
	
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		

//		indexOf() 만들기
//		문자열과 문자를 입력받은 뒤 해당 문자가 몇 번째 인덱스에 있는지 검사하고
//		만약 해당 문자가 없으면 -1을 리턴한다.
//		MyMethodTask mt = new MyMethodTask();
//		System.out.println(mt.indexOf("ABC1211", '1'));
	}

//	1~10까지 println()으로 출력하는 메소드
	void print1to10() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
	}

//	"홍길동"을 n번 println()으로 출력하는 메소드
	void printHong(int count) {
		for (int i = 0; i < count; i++) {
			System.out.println(i + ". 홍길동");
		}
	}

//	이름을 n번 println()으로 출력하는 메소드
	void printName(String name, int count) {
		for (int i = 0; i < count; i++) {
			System.out.println(name);
		}
	}

//	세 정수의 뺄셈을 해주는 메소드
	int sub(int number1, int number2, int number3) {
		int result = number1 - number2 - number3;
		return result;
	}

//	두 정수의 나눗셋을 해주는 메소드(몫과 나머지 둘 다)
	int[] div(int number1, int number2) {
		int[] result = null;
		if (number2 != 0) {
			result = new int[2];
			result[0] = number1 / number2;
			result[1] = number1 % number2;
		}
		return result;
	}

//	1~n까지의 합을 구해주는 메소드
	int add(int count) {
		int total = 0;
		for (int i = 0; i < count; i++) {
			total += i + 1;
		}
		return total;
	}

//	홀수를 짝수로, 짝수를 홀수로 바꿔주는 메소드
	int change(int number) {
		return ++number;
	}

//	문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
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

//	문자열을 입력받고 원하는 문자의 개수를 구해주는 메소드 - ex) apple에서 p의 개수
	int charCount(String str, char c) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}

//	5개의 정수를 입력받은 후 원하는 인덱스의 값을 구해주는 메소드
	int whereIndex(int[] number, int index) {
//		number = new int[5];
		return number[index];
	}

//	한글을 정수로 바궈주는 메소드(일공이사 -> 1024)
	int changeHangle(String str) {
		String hangle = "공일이삼사오육칠팔구";
		String result = "";
		for (int i = 0; i < str.length(); i++) {
//			str의 첫번째 글자가 hangle의 몇번째 글자에 있다.
			result += hangle.indexOf(str.charAt(i));
		}
		return Integer.parseInt(result);
	}
//	5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
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
	
//	5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드(void)
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

//	indexOf() 만들기
//	문자열과 문자를 입력받은 뒤 해당 문자가 몇 번째 인덱스에 있는지 검사하고
//	만약 해당 문자가 없으면 -1을 리턴한다.
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
