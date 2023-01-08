package job;

import java.util.Random;
import java.util.Scanner;

// 타짜
// 족보(끗, 땡, 광땡)
// 나랑 상대방과 대결
// 계급: 호구, 물주, 마담, 타짜
// 패를 받을 시 추가 금액 설정
// 같은 패가 나올 시 다음 판 두 배
// 다이, 고 결정
// 판돈: 1억
// 연속 3회 승리 시 계급 상승

public class CardMaster {
	String nickname; // 닉네임
	int money; // 보유 금액
	int level; // 등급
	int deck; // 패
	int winCount; // 연승 횟수

	public CardMaster() {
		;
	} // 기본생성자 {;} 는 일부러 비워둔거니 건들지 마라

	public CardMaster(String nickname, int money) { // 매개변수를 통해 전역변수(닉네임과 돈) 값 설정
		this.nickname = nickname;
		this.money = money;
	}

//   판돈 및 추가 금액을 받는다.
	void deposit(int money) {
		this.money -= money;
	}

//   끗(60) 땡(30) 광땡(10)
	void getMyDeck() {
		Random random = new Random();
		int[] rating = { 0, 1, 1, 1, 2, 2, 2, 2, 2, 2 }; // 0일때 광땡 1일때 땡 2면 끗
		this.deck = rating[random.nextInt(rating.length)];
	}

	int battle(CardMaster cardMaster) { // 상대방과 게임 매개변수를 클래스타입으로 받아 그 클래스의 필드에 접근 가능
//      -1 : draw, 0 : lose, 1 : win
		boolean draw = this.deck == cardMaster.deck; // 상대 덱과 내 덱이 같으면 draw에 true
		boolean lose = this.deck > cardMaster.deck; // 상대 덱보다 내 덱이 안좋으면 lose에 true
		boolean win = this.deck < cardMaster.deck; // 상대 덱보다 내 덱이 좋으면 win에 true
		boolean[] status = { draw, lose, win }; // boolean 타입인 status 배열에 draw lose win 담아줌
		int result = 0; // result 초기화

		for (int i = -1; i < 2; i++) { // for문으로 반복 돌려서 status[1 + i]의 값이 true일때 result에
			if (status[1 + i]) { // i를 담아줌으로써 인덱스 번호로 승, 무, 패 를 알 수 있음
				result = i;
				break;
			}
		}
		return result; // 결과값 int타입으로 리턴 -1, 0, 1중 리턴해서 승, 무, 패

	}

	public static void main(String[] args) {
		String[] arLevel = { "호구", "물주", "마담", "타짜" }; // 등급 종류
		String[] decks = { "광땡", "땡", "끗" }; // 패 등급
		String[] status = { "무승부", "패배", "승리" }; // 인덱스 번호로 승, 무, 패
		String message = "1. 대결하기\n2. 나의 정보\n3. 나가기"; // 사용자에게 보여줄 메세지
		String depositMessage = "1. 추가금액 입력\n2. 추가금액 없이 진행"; // 배팅할지 묻는 메세지
		int choice = 0, money = 0, defaultMoney = 10_000, result = 0, depositMoney = 0; // 선택, 금액, 기본 배팅금, 승패 결과값, 배팅금
		Scanner sc = new Scanner(System.in);
		CardMaster me = new CardMaster("고니", 0); // CardMaster클래스 타입의 me 객체 생성하며 생성자로 "고니"로 닉네임설정 돈 0으로 설정
		CardMaster computer = new CardMaster("아귀", 0); // CardMaster클래스 타입의 computer 객체 생성하며 생성자로 "아귀" 0 설정
		String title = null;

		while (true) {
			title = "[" + arLevel[me.level] + "]" + me.nickname + " 자산: " + me.money + "\n" + "["
					+ arLevel[computer.level] + "]" + computer.nickname + " 자산: " + computer.money;
			System.out.println(title); // 상태 출력
			System.out.println(message); // 메세지 출력
			choice = sc.nextInt(); // 사용자가 입력한 정수 값 choice에 담아줌

			if (choice == 3) {
				break;
			} // while문 탈출

			switch (choice) {
			case 1: // 대결하기
				money = 0;
//            me.deposit(defaultMoney);      // 배팅금 지불
//            computer.deposit(defaultMoney);   // 배팅금 지불
				money += defaultMoney * 2; // 서로 낸 금액 담아주기
				me.getMyDeck(); // 패 받기
				computer.getMyDeck(); // 패 받기
				System.out.println("나의 패: " + decks[me.deck]); // 내 패 출력

				System.out.println(depositMessage); // 배팅할지 묻는 메세지
				choice = sc.nextInt(); // 사용자가 입력한 값 담아주기

				if (choice == 1) {
					System.out.print("추가 금액: ");
					depositMoney = sc.nextInt(); // 배팅금 입력받아서 설정
//               me.deposit(depositMoney);         // 내가 가지고있는 금액에서 배팅금 빼기
//               computer.deposit(depositMoney);      // 컴퓨터가 가지고 있는 금액에서 배팅금 빼기
					money += depositMoney * 2; // money 변수에 배팅금 추가해서 배팅금 + 기본 배팅금
				}

				result = me.battle(computer); // result 변수에 내가 컴퓨터와 붙어서 나온 결과 승(1), 패(0), 무(-1) 담아줌
				System.out.println(status[result + 1]);

				switch (result) {
				case -1: // 무승부
					while (result == -1) {
						money *= 2;
						/*
						 * 내가 추가한 코드
						 */
//                  me.money -= money / 2;
//                  computer.money -= money / 2;

						/* 내가 추가한 코드 */
						System.out.println(money);
						me.getMyDeck();
						System.out.println("나의 패: " + decks[me.deck]);
						System.out.println("1. 고\n2. 다이");
						choice = sc.nextInt();
						if (choice == 2) {

							result = 0;
							System.out.println(status[result + 1]);
							System.out.println("결과가 나오기 전 내 돈 : " + me.money + " 컴퓨터 돈 : " + computer.money);
							computer.money += money / 2;
							me.money -= money / 2;
//                me.money -= money  /*- defaultMoney - depositMoney*/;
							me.winCount = 0;
							computer.winCount++;
//                     money = 0;   // 내가 추가한 것
							break;
						}
						result = me.battle(computer);
						System.out.println(status[result + 1]);

						switch (result) {
						case 0: // 패배
							System.out.println("결과가 나오기 전 내 돈 : " + me.money + " 컴퓨터 돈 : " + computer.money);
							computer.money += money / 2;
							me.money -= money / 2;
							System.out.println("내가 패배 일때 내가 다이를 눌렀을 때 내가 가지고 있는 돈 : " + me.money);
							System.out.println("내가 패배 일때 컴퓨터가 다이를 눌렀을 때 내가 가지고 있는 돈 : " + computer.money);
//                     me.money -= money - defaultMoney - depositMoney;
							me.winCount = 0;
							computer.winCount++;
//                     money = 0;   // 내가 추가한 것
							break;
						case 1: // 승리
							System.out.println("결과가 나오기 전 내 돈 : " + me.money + " 컴퓨터 돈 : " + computer.money);
							computer.money -= money / 2;
							me.money += money / 2;
							System.out.println("내가 이겼을 때 내가 다이를 눌렀을 때 내가 가지고 있는 돈 : " + me.money);
							System.out.println("내가 이겼을 때 컴퓨터가 다이를 눌렀을 때 내가 가지고 있는 돈 : " + computer.money);
//                     computer.money -= money - defaultMoney - depositMoney;
							me.winCount++;
							computer.winCount = 0;
//                     money = 0;   // 내가 추가한 것
							break;
						}
					}
					break;
				case 0: // 패배
					System.out.println("결과가 나오기 전 내 돈 : " + me.money + " 컴퓨터 돈 : " + computer.money);
					computer.money += money / 2;
					me.money -= money / 2;
//               me.money -= money - defaultMoney - depositMoney; // 내 돈 = 내 돈 - 베팅액 - 
					me.winCount = 0;
					computer.winCount++;
//               money = 0;   // 내가 추가한 것
					break;
				case 1: // 승리
					System.out.println(money);
					computer.money -= money / 2;
					me.money += money / 2;
//               computer.money -= money - defaultMoney - depositMoney;
					me.winCount++;
					computer.winCount = 0;
//               money = 0;   // 내가 추가한 것
					break;
				}
				if (me.winCount > 2 && me.level < 3) {
					me.level++;
					me.winCount = 0;
				}
				if (computer.winCount > 2 && computer.level < 3) {
					computer.level++;
					computer.winCount = 0;
				}
				break;
			case 2: // 나의 정보
				break;
			default: // 그 외
				System.out.println("다시 입력해주세요.");
				break;
			}
		}

	}
}
