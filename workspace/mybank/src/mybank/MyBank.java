package mybank;

import java.util.Random;
import java.util.Scanner;

public class MyBank {
	String name;
	String accountNumber; // �ߺ�����
	String phoneNumber; // �ߺ�����
	String password;
	
//	�����ܰ�
	int accountMoney;
//	������
	int fees;
	
//	�Ա�
	int deposit;
//	���
	int withdraw;
//	�ܾ���ȸ
	int moneyInquiry;
	
	boolean condition;

	{
		accountNumber = "";
	}

//	�⺻ ������
	public MyBank() {;}

	public MyBank(String name, String phoneNumber, String password, int accountMoney) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.accountMoney = accountMoney;
	}

//	���°��� : ���¹�ȣ 6�ڸ� �����ϴ� �޼ҵ�.
	String getAccountNumber() {
		Random random = new Random();
		int[] randomNumber = new int[6];

//		���¹�ȣ 6�ڸ� ����
		for (int i = 0; i < randomNumber.length; i++) {
			randomNumber[i] = random.nextInt(10);
			accountNumber += randomNumber[i];
		}
		return accountNumber;
	}

//	�Ա�
	int deposit(int accountMoney) {
		this.accountMoney += accountMoney;
		return accountMoney;
	}
	
//	���
	int withdraw(int accountMoney) {
		this.accountMoney -= accountMoney;
		return accountMoney;
	}
	
//	�ܾ���ȸ
	int moneyInquiry() {
		return this.accountMoney;
	}
	
//	���¹�ȣ �ߺ��˻缭��
	boolean duplicateAccountNumber(MyBank bank, String accountNumber) {
		return condition = this.accountNumber.equals(accountNumber);
	}
//	�ڵ��� �ߺ��˻缭��
	boolean duplicatePhoneNumber(MyBank bank, String phoneNumber) {
		return condition = this.phoneNumber.equals(phoneNumber);
	}
//	�α��� ����
	boolean login(MyBank bank, String accountNumber, String password) {
		return condition = this.accountNumber.equals(accountNumber) && this.password.equals(password);
	}

//	� ������ ������� üũ�ϰ� �ش� ������ �޼ҵ����
	public void checkBank(MyBank bank) {
		if (bank instanceof MySinhan) {
			MySinhan sinhan = (MySinhan) bank;
			
		} else if (bank instanceof MyKbstar) {
			MyKbstar kbstar = (MyKbstar) bank;
			
		} else if (bank instanceof MyKakao) {
			MyKakao kakao = (MyKakao) bank;
		}
	}

	public static void main(String[] args) {
//		MyBank bank = new MyBank();
//		System.out.println(bank.accountNumber);
		MyBank[] sinhans = new MyBank[4];
		MyBank[] kbstars = new MyBank[4];
		MyBank[] kakaos = new MyBank[4];
		MyBank[][] arClient = {sinhans, kbstars, kakaos};
		
		int choice = 0;
		boolean condition = false;
		String menuMessage = 
				"1. ���°���\n"
				+ "2. �Ա��ϱ�\n"
				+ "3. ����ϱ�\n"
				+ "4. �ܾ���ȸ\n"
				+ "5. ���¹�ȣ ã��\n"
				+ "6. ������";
		String accoutHelpMessage = 
				"1. ���ο� ���¹߱�\n"
				+ "2. �ڵ��� ��ȣ�� ���� �̿밡��";
		String choiceBankMessgae =
				"1. ����\n"
				+ "2. ����\n"
				+ "3. īī��\n";
				
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println(menuMessage);
			choice = sc.nextInt();
			if(choice == 6) {break;}
			
			switch(choice) {
			case 1:
				System.out.println(choiceBankMessgae + "����");
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				System.out.println(accoutHelpMessage);
				break;
			case 6:
				break;
			default:
				break;
			}
		}
		
		

//		System.out.println(bank[0].getAccountNumber());
	}
}
