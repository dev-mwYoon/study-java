package job;

import java.util.Random;
import java.util.Scanner;

// Ÿ¥
// ����(��, ��, ����)
// ���� ����� ���
// ���: ȣ��, ����, ����, Ÿ¥
// �и� ���� �� �߰� �ݾ� ����
// ���� �а� ���� �� ���� �� �� ��
// ����, �� ����
// �ǵ�: 1��
// ���� 3ȸ �¸� �� ��� ���

public class CardMaster {
	String nickname; // �г���
	int money; // ���� �ݾ�
	int level; // ���
	int deck; // ��
	int winCount; // ���� Ƚ��

	public CardMaster() {
		;
	} // �⺻������ {;} �� �Ϻη� ����аŴ� �ǵ��� ����

	public CardMaster(String nickname, int money) { // �Ű������� ���� ��������(�г��Ӱ� ��) �� ����
		this.nickname = nickname;
		this.money = money;
	}

//   �ǵ� �� �߰� �ݾ��� �޴´�.
	void deposit(int money) {
		this.money -= money;
	}

//   ��(60) ��(30) ����(10)
	void getMyDeck() {
		Random random = new Random();
		int[] rating = { 0, 1, 1, 1, 2, 2, 2, 2, 2, 2 }; // 0�϶� ���� 1�϶� �� 2�� ��
		this.deck = rating[random.nextInt(rating.length)];
	}

	int battle(CardMaster cardMaster) { // ����� ���� �Ű������� Ŭ����Ÿ������ �޾� �� Ŭ������ �ʵ忡 ���� ����
//      -1 : draw, 0 : lose, 1 : win
		boolean draw = this.deck == cardMaster.deck; // ��� ���� �� ���� ������ draw�� true
		boolean lose = this.deck > cardMaster.deck; // ��� ������ �� ���� �������� lose�� true
		boolean win = this.deck < cardMaster.deck; // ��� ������ �� ���� ������ win�� true
		boolean[] status = { draw, lose, win }; // boolean Ÿ���� status �迭�� draw lose win �����
		int result = 0; // result �ʱ�ȭ

		for (int i = -1; i < 2; i++) { // for������ �ݺ� ������ status[1 + i]�� ���� true�϶� result��
			if (status[1 + i]) { // i�� ��������ν� �ε��� ��ȣ�� ��, ��, �� �� �� �� ����
				result = i;
				break;
			}
		}
		return result; // ����� intŸ������ ���� -1, 0, 1�� �����ؼ� ��, ��, ��

	}

	public static void main(String[] args) {
		String[] arLevel = { "ȣ��", "����", "����", "Ÿ¥" }; // ��� ����
		String[] decks = { "����", "��", "��" }; // �� ���
		String[] status = { "���º�", "�й�", "�¸�" }; // �ε��� ��ȣ�� ��, ��, ��
		String message = "1. ����ϱ�\n2. ���� ����\n3. ������"; // ����ڿ��� ������ �޼���
		String depositMessage = "1. �߰��ݾ� �Է�\n2. �߰��ݾ� ���� ����"; // �������� ���� �޼���
		int choice = 0, money = 0, defaultMoney = 10_000, result = 0, depositMoney = 0; // ����, �ݾ�, �⺻ ���ñ�, ���� �����, ���ñ�
		Scanner sc = new Scanner(System.in);
		CardMaster me = new CardMaster("���", 0); // CardMasterŬ���� Ÿ���� me ��ü �����ϸ� �����ڷ� "���"�� �г��Ӽ��� �� 0���� ����
		CardMaster computer = new CardMaster("�Ʊ�", 0); // CardMasterŬ���� Ÿ���� computer ��ü �����ϸ� �����ڷ� "�Ʊ�" 0 ����
		String title = null;

		while (true) {
			title = "[" + arLevel[me.level] + "]" + me.nickname + " �ڻ�: " + me.money + "\n" + "["
					+ arLevel[computer.level] + "]" + computer.nickname + " �ڻ�: " + computer.money;
			System.out.println(title); // ���� ���
			System.out.println(message); // �޼��� ���
			choice = sc.nextInt(); // ����ڰ� �Է��� ���� �� choice�� �����

			if (choice == 3) {
				break;
			} // while�� Ż��

			switch (choice) {
			case 1: // ����ϱ�
				money = 0;
//            me.deposit(defaultMoney);      // ���ñ� ����
//            computer.deposit(defaultMoney);   // ���ñ� ����
				money += defaultMoney * 2; // ���� �� �ݾ� ����ֱ�
				me.getMyDeck(); // �� �ޱ�
				computer.getMyDeck(); // �� �ޱ�
				System.out.println("���� ��: " + decks[me.deck]); // �� �� ���

				System.out.println(depositMessage); // �������� ���� �޼���
				choice = sc.nextInt(); // ����ڰ� �Է��� �� ����ֱ�

				if (choice == 1) {
					System.out.print("�߰� �ݾ�: ");
					depositMoney = sc.nextInt(); // ���ñ� �Է¹޾Ƽ� ����
//               me.deposit(depositMoney);         // ���� �������ִ� �ݾ׿��� ���ñ� ����
//               computer.deposit(depositMoney);      // ��ǻ�Ͱ� ������ �ִ� �ݾ׿��� ���ñ� ����
					money += depositMoney * 2; // money ������ ���ñ� �߰��ؼ� ���ñ� + �⺻ ���ñ�
				}

				result = me.battle(computer); // result ������ ���� ��ǻ�Ϳ� �پ ���� ��� ��(1), ��(0), ��(-1) �����
				System.out.println(status[result + 1]);

				switch (result) {
				case -1: // ���º�
					while (result == -1) {
						money *= 2;
						/*
						 * ���� �߰��� �ڵ�
						 */
//                  me.money -= money / 2;
//                  computer.money -= money / 2;

						/* ���� �߰��� �ڵ� */
						System.out.println(money);
						me.getMyDeck();
						System.out.println("���� ��: " + decks[me.deck]);
						System.out.println("1. ��\n2. ����");
						choice = sc.nextInt();
						if (choice == 2) {

							result = 0;
							System.out.println(status[result + 1]);
							System.out.println("����� ������ �� �� �� : " + me.money + " ��ǻ�� �� : " + computer.money);
							computer.money += money / 2;
							me.money -= money / 2;
//                me.money -= money  /*- defaultMoney - depositMoney*/;
							me.winCount = 0;
							computer.winCount++;
//                     money = 0;   // ���� �߰��� ��
							break;
						}
						result = me.battle(computer);
						System.out.println(status[result + 1]);

						switch (result) {
						case 0: // �й�
							System.out.println("����� ������ �� �� �� : " + me.money + " ��ǻ�� �� : " + computer.money);
							computer.money += money / 2;
							me.money -= money / 2;
							System.out.println("���� �й� �϶� ���� ���̸� ������ �� ���� ������ �ִ� �� : " + me.money);
							System.out.println("���� �й� �϶� ��ǻ�Ͱ� ���̸� ������ �� ���� ������ �ִ� �� : " + computer.money);
//                     me.money -= money - defaultMoney - depositMoney;
							me.winCount = 0;
							computer.winCount++;
//                     money = 0;   // ���� �߰��� ��
							break;
						case 1: // �¸�
							System.out.println("����� ������ �� �� �� : " + me.money + " ��ǻ�� �� : " + computer.money);
							computer.money -= money / 2;
							me.money += money / 2;
							System.out.println("���� �̰��� �� ���� ���̸� ������ �� ���� ������ �ִ� �� : " + me.money);
							System.out.println("���� �̰��� �� ��ǻ�Ͱ� ���̸� ������ �� ���� ������ �ִ� �� : " + computer.money);
//                     computer.money -= money - defaultMoney - depositMoney;
							me.winCount++;
							computer.winCount = 0;
//                     money = 0;   // ���� �߰��� ��
							break;
						}
					}
					break;
				case 0: // �й�
					System.out.println("����� ������ �� �� �� : " + me.money + " ��ǻ�� �� : " + computer.money);
					computer.money += money / 2;
					me.money -= money / 2;
//               me.money -= money - defaultMoney - depositMoney; // �� �� = �� �� - ���þ� - 
					me.winCount = 0;
					computer.winCount++;
//               money = 0;   // ���� �߰��� ��
					break;
				case 1: // �¸�
					System.out.println(money);
					computer.money -= money / 2;
					me.money += money / 2;
//               computer.money -= money - defaultMoney - depositMoney;
					me.winCount++;
					computer.winCount = 0;
//               money = 0;   // ���� �߰��� ��
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
			case 2: // ���� ����
				break;
			default: // �� ��
				System.out.println("�ٽ� �Է����ּ���.");
				break;
			}
		}

	}
}
