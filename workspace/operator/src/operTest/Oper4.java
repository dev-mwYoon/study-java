package operTest;

import java.util.Scanner;

public class Oper4 {
	public static void main(String[] args) {
//		�ɸ� �׽�Ʈ
		/*
		 * Q. ����� �����ϴ� ���� �����ϼ���.
		 * 1. ������
		 * 2. �����
		 * 3. ������
		 * 4. ���
		 * 
		 * ������ : �Ұ��� �������̰� �������̴�.
		 * ����� : �߶��ϰ� ��� �Ϳ��� �����ְ� ���ϴ�.
		 * ������ : �����ϰ� ����ϰ� ��ö�ϰ� ������.
		 * ��� : õ�簰�� ����ϰ� ������ �����ϰ� ������� ����.
		 * 
		 */
		int num = 0; // ���� �Է��� ���� �ʱⰪ ����.
		String menu = "Q. ����� �����ϴ� ���� �����ϼ���.\n1. ������\n2. �����\n3. ������\n4. ���"
				,red = "1. ������ : �Ұ��� �������̰� �������̴�." , yellow = "2. ����� : �߶��ϰ� ��� �Ϳ��� �����ְ� ���ϴ�." 
				,black = "3. ������ : �����ϰ� ����ϰ� ��ö�ϰ� ������.", white = "4. ��� : õ�簰�� ����ϰ� ������ �����ϰ� ������� ����.", result = null; // menu = Q(����) , result = ���� ��� ��.
		System.out.println(menu);
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt(); // num = 1~4 ���̿� ���� �Է��� ��. 
		
		// ���� ����� result�� 1�̸� �������� ������ ������, �ƴ϶�� 2��� ������� ������ ������, �ƴ϶�� 3�̶�� �������� ���õ� ������, �ƴ϶�� 4��� ����� ���õ� ������, �ƴ϶�� ���⿡ ����.�� �����Ѵ�.
		result = num == 1 ? result = red : num == 2 ? result = yellow 
				: num == 3 ? result = black : num == 4 ? result = white : "���⿡ �����ϴ�.";
		System.out.println(result); // ���� ����� ���
		sc.close();	// scanner�� �ݾ��ش�.
		
		// ����� ����
//      �ɸ� �׽�Ʈ
//      /*
//       * Q. ����� �����ϴ� ���� �����ϼ���.
//       * 1. ������
//       * 2. �����
//       * 3. ������
//       * 4. ���
//       * 
//       * ������ : �Ұ��� �������̰� �������̴�.
//       * ����� : �߶��ϰ� ��� �Ϳ��� �����ְ� ���ϴ�.
//       * ������ : �����ϰ� ����ϰ� ��ö�ϰ� ������.
//       * ��� : õ�簰�� ����ϰ� ������ �����ϰ� ������� ����.
//       * 
//       */
//      String message = "Q. ����� �����ϴ� ���� �����ϼ���.";
//      String choiceMessage = "1.������\n2.�����\n3.������\n4.���";
//      String redMessage = "�Ұ��� �������̰� �������̴�."; 
//      String yellowMessage = "�߶��ϰ� ��� �Ϳ��� �����ְ� ���ϴ�."; 
//      String blackMessage = "�����ϰ� ����ϰ� ��ö�ϰ� ������."; 
//      String whiteMessage = "õ�簰�� ����ϰ� ������ �����ϰ� ������� ����.";
//      String errorMessage = "�ٽ� �Է����ּ���.";
//      String result = null;
//      Scanner sc = new Scanner(System.in);
//      int choice = 0;
//      
//      System.out.println(message + "\n" + choiceMessage);
//      choice = sc.nextInt();
//      
////      result = choice == 1 ? redMessage :
////         choice == 2 ? yellowMessage :
////            choice == 3 ? blackMessage :
////               choice == 4 ? whiteMessage :
////                  errorMessage;
////      if(choice == 1) {
////         result = redMessage;
////         
////      }else if(choice == 2) {
////         result = yellowMessage;
////         
////      }else if(choice == 3) {
////         result = blackMessage;
////         
////      }else if(choice == 4) {
////         result = whiteMessage;
////         
////      }else {
////         result = errorMessage;
////         
////      }
//      
//      switch(choice) {
//      case 1:
//         result = redMessage;
//         break;
//      case 2:
//         result = yellowMessage;
//         break;
//      case 3:
//         result = blackMessage;
//         break;
//      case 4:
//         result = whiteMessage;
//         break;
//      default:
//         result = errorMessage;
//         break;
//      }
//      
//      System.out.println(result);

		
		
	}
}