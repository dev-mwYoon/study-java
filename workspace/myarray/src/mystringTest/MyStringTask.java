package mystringTest;

import java.util.Scanner;

public class MyStringTask {
	public static void main(String[] args) {
//		����ڿ��� �Է¹��� ���ڿ� �� �ҹ��ڴ� ��� �빮�ڷ�,
//		�빮�ڴ� ��� �ҹ��ڷ� �����Ѵ�.
//		String data = "", message = "���ڸ� �Է����ּ���.ex)AbDef%&^";
//		Scanner sc = new Scanner(System.in);
//		System.out.println(message);
//		data = sc.next();
//		char[] arChar = new char[data.length()];
//
//		for (int i = 0; i < arChar.length; i++) {
//			arChar[i] = data.charAt(i);
//		}
//		data = "";
////		A = 65, Z = 90 
////		a = 97, z = 122
//		for (int i = 0; i < arChar.length; i++) {
//			if (arChar[i] > (char)96 && arChar[i] < (char)123 ) {
//				arChar[i] = (char) (arChar[i] - 32);
//			} else if (arChar[i] > (char)64 && arChar[i] < (char)91) {
//				arChar[i] = (char) (arChar[i] + 32);
//			} 
//			else {
//				arChar[i] = arChar[i];
//			}
//			data = data + arChar[i];
//		}
//		System.out.println(data);
		
		
//      ������ �ѱ۷� ����
//      ��) 1024 -> �ϰ��̻�
//      String message = "���� : ", result = "";
//      String hangle = "�����̻�����ĥ�ȱ�";
//      Scanner sc = new Scanner(System.in);
//      String data = null;
//      
//      System.out.print(message);
//      data = sc.next();
//      
//      for (int i = 0; i < data.length(); i++) {
//         result += hangle.charAt(data.charAt(i) - 48);
//      }
//      
//      System.out.println(result);
//		������ �ѱ۷� ����
//		��) 1024 -> �ϰ��̻�
		String message = "������ �Է����ּ���." , result = "";
		String data = null;
		String hangle = "�����̻�����ĥ�ȱ�";
		
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		data = sc.next();
		for (int i = 0; i < data.length(); i++) {
			result += hangle.charAt(data.charAt(i) - 48);
		}
		System.out.println(hangle);
//	--------------------------------------------------------------------
//      ����ڿ��� �Է¹��� ���ڿ� �� �ҹ��ڴ� ��� �빮�ڷ�,
//      �빮�ڴ� ��� �ҹ��ڷ� �����Ѵ�.
//      String message = "���� �Է� : ";
//      null�� �ʱ�ȭ �ߴٸ�, ���� �����ڸ� ����ϰڴٴ� ��.
//      ""�� �ʱ�ȭ �ߴٸ�, ���� �����ڸ� ����ϰڴٴ� ��.
//      String string = null, result = "";
//      Scanner sc = new Scanner(System.in);
//      
//      System.out.print(message);
//      string = sc.nextLine();
//      
////      ����ڰ� �Է��� ���ڿ� ���̸�ŭ �ݺ��Ͽ�
//      for (int i = 0; i < string.length(); i++) {
////         �� ���ڸ� c�� ��´�.
//         char c = string.charAt(i);
////         �� ���ڰ� �빮���� ���
//         if(c >= 65 && c <= 90) {
////            �ҹ��ڷ� �����Ͽ� result�� �����Ѵ�.
//            result += (char)(c + 32);
//         }else if(c >= 97 && c <= 122){
////            �ҹ����� ���
////            �빮�ڷ� �����Ͽ� result�� �����Ѵ�.
//            result += (char)(c - 32);
//         }else {
////            ���ĺ��� �ƴϸ� �״�� result�� �����Ѵ�.
//            result += c;
//         }
//      }
//      
//      System.out.println(result);
      
         
      
      
      
//      int number = 0;
//      
//      System.out.print(message);
//      number = sc.nextInt();
//      
//      while(number != 0) { // ��� ����� ���� 0�� �� ������ �ݺ�
//         result = hangle.charAt(number % 10) + result;
//         number /= 10;
//      }
//      System.out.println(result);

	}
}
