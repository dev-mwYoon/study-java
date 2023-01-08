package mybank;

import java.util.Random;
import java.util.Scanner;

public class MyBank {
	String name;
	String accountNumber; // 중복없음
	String phoneNumber; // 중복없음
	String password;
	
//	통장잔고
	int accountMoney;
//	수수료
	int fees;
	
//	입금
	int deposit;
//	출금
	int withdraw;
//	잔액조회
	int moneyInquiry;
	
	boolean condition;

	{
		accountNumber = "";
	}

//	기본 생성자
	public MyBank() {;}

	public MyBank(String name, String phoneNumber, String password, int accountMoney) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.accountMoney = accountMoney;
	}

//	계좌개설 : 계좌번호 6자리 생성하는 메소드.
	String getAccountNumber() {
		Random random = new Random();
		int[] randomNumber = new int[6];

//		계좌번호 6자리 생성
		for (int i = 0; i < randomNumber.length; i++) {
			randomNumber[i] = random.nextInt(10);
			accountNumber += randomNumber[i];
		}
		return accountNumber;
	}

//	입금
	int deposit(int accountMoney) {
		this.accountMoney += accountMoney;
		return accountMoney;
	}
	
//	출금
	int withdraw(int accountMoney) {
		this.accountMoney -= accountMoney;
		return accountMoney;
	}
	
//	잔액조회
	int moneyInquiry() {
		return this.accountMoney;
	}
	
//	계좌번호 중복검사서비스
	boolean duplicateAccountNumber(MyBank bank, String accountNumber) {
		return condition = this.accountNumber.equals(accountNumber);
	}
//	핸드폰 중복검사서비스
	boolean duplicatePhoneNumber(MyBank bank, String phoneNumber) {
		return condition = this.phoneNumber.equals(phoneNumber);
	}
//	로그인 서비스
	boolean login(MyBank bank, String accountNumber, String password) {
		return condition = this.accountNumber.equals(accountNumber) && this.password.equals(password);
	}

//	어떤 은행을 골랐는지 체크하고 해당 은행의 메소드출력
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
				"1. 계좌개설\n"
				+ "2. 입금하기\n"
				+ "3. 출금하기\n"
				+ "4. 잔액조회\n"
				+ "5. 계좌번호 찾기\n"
				+ "6. 나가기";
		String accoutHelpMessage = 
				"1. 새로운 계좌발급\n"
				+ "2. 핸드폰 번호로 서비스 이용가능";
		String choiceBankMessgae =
				"1. 신한\n"
				+ "2. 국민\n"
				+ "3. 카카오\n";
				
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println(menuMessage);
			choice = sc.nextInt();
			if(choice == 6) {break;}
			
			switch(choice) {
			case 1:
				System.out.println(choiceBankMessgae + "은행");
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
