package myarrayTest;

import java.util.Iterator;
import java.util.Scanner;

public class MyArTask2 {
	public static void main(String[] args) {
//		�� ��ư�� ������ �� �̵��ϴ� �������� ������ ����.
		
//		btn1 : ȸ������ ������
//		btn2 : �α��� ������
//		btn3 : ���� ������
		
//		ȸ������ -> �α��� -> ���� ������
//		�� ������� �Է��ؾ� �ϸ�, ���� ���� �ܰ踦 �����ϱ� ���� ���� �ܰ� ��ư�� ���� ���, ���� �ܰ迡 ���� �޽����� ������ش�.
//		��) �α��� Ŭ�� ��, "ȸ�������� ���� �������ּ���" ���
		
//		�˸��� �ܰ��� ��ư�� ������, �ش� �ܰ迡 ���� �޼����� ������ش�.
//		��) ȸ������ Ŭ�� ��, ȸ������ ����
//			���� ������ Ŭ�� ��, ���� �̸��� ���� ���
		
		String[] arBtn = {"btn1", "btn2", "btn3"};
		String[] arSucMsg = {"ȸ������ ����", "�α��� ����", "���ο�(23)"};
		String[] arErMsg = {"�߸� �Է��ϼ̽��ϴ�.","ȸ�������� ���� �������ּ���", "�α����� ���� �������ּ���"};
		int click = 0;
		String firstMsg = "��ư�� Ŭ�� ���ּ���. �Է� ��)1\n��ư ��� ����";
		Scanner sc = new Scanner(System.in);
		
		

		
//		// ù��°
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
//			// �α��κ��� ������ ��
//			else if (click == 2) {
//				System.out.println(arErMsg[1]);
//			} 
//			// �������������� ������ ��
//			else if (click == 3){
//				System.out.println(arErMsg[2]);
//			} 
//			// �ƿ� �߸� ������ ��
//			else {
//				System.out.println(arErMsg[0]);
//			}
//		}
//		// �ι�°
//		while(true) {
//			System.out.println(firstMsg);
//			for (int i = 0; i < arBtn.length; i++) {
//				System.out.println(arBtn[i]);
//			}
//			click = sc.nextInt();
//			if (click == 1) {
//				System.out.println(arSucMsg[0]);
//			} 
//			// �α��� ������ ��
//			else if (click == 2) {
//				System.out.println(arSucMsg[1]);
//				break;
//			} 
//			// ���������� ������ ��
//			else if (click == 3){
//				System.out.println(arErMsg[2]);
//			} 
//			// �ƿ� �߸� ������ ��
//			else {
//				System.out.println(arErMsg[0]);
//			}
//		}
//		//����°
//		while(true) {
//			System.out.println(firstMsg);
//			for (int i = 0; i < arBtn.length; i++) {
//				System.out.println(arBtn[i]);
//			}
//			click = sc.nextInt();
//			if (click == 1) {
//				System.out.println(arSucMsg[0]);
//			} 
//			// �α��� ������ ��
//			else if (click == 2) {
//				System.out.println(arSucMsg[1]);
//			} 
//			// ���������� ������ ��
//			else if (click == 3){
//				System.out.println(arSucMsg[2]);
//				break;
//			} 
//			// �ƿ� �߸� ������ ��
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
				} else if(i < 1) { // ù�õ��ε� 2���� ����
					System.out.println(arErMsg[1]);
					i--;
					break;
				} else { // ������ �õ��� �� 2���� ����
					System.out.println(arSucMsg[1]);
					i--;
					break;
				}
			case 3:
				if (i == 2) {
					System.out.println(arSucMsg[i]);
					break;
				} else { // ù��° Ȥ�� �ι�° �õ��� 3���� ����.
					System.out.println(arErMsg[2]);
					i--;
					break;
				}
			}
		}
		
	}
}
