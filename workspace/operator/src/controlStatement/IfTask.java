package controlStatement;

import java.util.Scanner;

public class IfTask {
	public static void main(String[] args) {
//		����ڿ��� �Ʒ��� �޴��� ����ϰ�
//		��ȣ�� �Է¹޴´�.
//		1. ������
//		2. ������
//		3. �����
//		4. ���
//		����ڰ� �Է��� ��ȣ�� ������ ����� ����Ѵ�.
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0, choice = 0;		
		System.out.print("�Ʒ��� �޴� �� �� ������ ��ȣ�� �������ּ���.\n");
		System.out.print("1. ������\n2. ������\n3. �����\n4. ��� \n");
		Scanner sc = new Scanner(System.in);
		System.out.print("��ȣ �Է� : ");
		choice = sc.nextInt();
		if(choice == 1) {
			System.out.println("Red");
		}else if(choice == 2) {
			System.out.println("Black");
		}else if(choice == 3) {
			System.out.println("Yellow");
		}else if(choice==4){
			System.out.println("White");
		}else {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
		
		/* ����� ���� �ϰ�ó��. �ڹٴ� �ϰ�ó�� �ϴ°� ����. �ϰ�ó�� = ����� �ѹ���.
		 * package controllStatement;

import java.util.Scanner;

public class IfTask {
   public static void main(String[] args) {
//      ����ڿ��� �Ʒ��� �޴��� ����ϰ�
//      ��ȣ�� �Է¹޴´�.
      
//      1. ������
//      2. ������
//      3. �����
//      4. ���

//      ����ڰ� �Է��� ��ȣ�� ������ ����� ����Ѵ�.
      
      String title = "������ ����ּ���!";
      String menu = "1.������\n2.������\n3.�����\n4.���";
      String result = null;
      int choice = 0;
      Scanner sc = new Scanner(System.in);
      
      System.out.println(title);
      System.out.println(menu);
      choice = sc.nextInt();
      
      if(choice == 1) {
         result = "Red";
         
      }else if(choice == 2) {
         result = "Black";
         
      }else if(choice == 3) {
         result = "Yellow";
         
      }else if(choice == 4) {
         result = "White";
         
      }else {
         result = "�߸� �Է��ϼ̽��ϴ�.";
      }
      
      System.out.println(result);
   }
}

		 */
	}
}

