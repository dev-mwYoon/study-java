package job;

import java.util.Random;
import java.util.Scanner;

class job{
	
//	- Ÿ¥ ( �븧�� < ������ < �Ʊ� < ¦�� < ��� < �����)
//	- Ȯ�� (����(30%) < ���(30%) < �˸�(20%) < ����(20%))
//	- ����, Ƽ�� (�븧��(40) < ������(40) < �Ʊ�(40) < ¦��(40) < ���(40) < �����)
//		���� 40 = ���20 = �˸�10 = ����5
//		���� 8 = ���4 = �˸�2 = ����1
//		���� 1 = ���2 = �˸�4 = ����8
	
	
	
	String job; // 
	int grade; // 1 > 2 > 3 > 4 > 5
	int income; // 100 / 200 / 300 / 400 / 500
	int upCount; // 5�� ��÷���� �������� ����
	
	{
//		���� �ʱ� �ڱ�
		income = 100;
		upCount++;
	}
	public job(String job, int grade, int income) {
		this.job = job;  
		this.grade = grade; 
		this.income = income; 
	}
	
//	�õ��� ������ 10�� ����
//	���� �� 100 ȹ��
	int rating(int play) {
		Random random = new Random();
		int result = 0;
		int[] rating = new int[10];
		for (int i = 0; i < 2; i++) {
			rating[i] = 1;
		}
		for (int i = 0; i < play; i++) {
			if (rating[random.nextInt(10)] == 1) {
				result ++;
			}
		}
		return result;
	}
	
	
}

public class Sharper {
	public static void main(String[] args) {
		
//		�޴�
//		1. ���� ���� "�����" "�Ʊ�" "¦��" "���" "������"
//		2. �ܰ� ���� 1 2 3 4 5
//		3. �̱� 10 20 30 40 50 �� ���� ȹ��
//		4. ����
		String[] menuMessage = {"�޴��� ����ּ���.", "1. ���� ����", "2. �ܰ� ����", "3. �̱�", "4. ����"};
		String[] jobMessage = {"1. �����", "2. �Ʊ�", "3. ¦��", "4. ���", "5. ������"};
		int[] levelMessage = {1, 2, 3, 4, 5};
		String ratingMessage = "";
		int choice = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			for (int i = 0; i < menuMessage.length; i++) {
				System.out.println(menuMessage[i]);
			}
			choice = sc.nextInt();
			if (choice == 1) {
				for (int i = 0; i < jobMessage.length; i++) {
					System.out.println(jobMessage[i]);
				}
			} 
			
		}
		
		
		
	}
}
