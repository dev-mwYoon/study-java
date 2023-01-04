package classTest;

import java.util.Scanner;

public class ClassArray {
	public static void main(String[] args) {
		Shop shop = new Shop("과자", 3000, 10);
		
//		클래스의 배열
		Customer[] customers = {
				new Customer("Tom", "01012341234", 50000, 10),
				new Customer("Jack", "01055556666", 100000, 50)
		};
		Scanner sc = new Scanner(System.in);
//		choice = 손님의 선택 , result = 할인율 적용된 제품 가격
		int choice = 0, result = 0;
		
//		for (int i = 0; i < customers.length; i++) {
//			customers[i] = new Customer();
//		}
		
		System.out.println("어떤 손님으로 진행하시겠어요?");
		System.out.println("1. Tom");
		System.out.println("2. Jack");
		
//		Tom인지 잭인지 선택
		choice = sc.nextInt();
//		고객 클래스 배열의 index(choice-1) 할인된 가격을 고객 잔고에서 뺀 결과.
		result = shop.sell(customers[choice - 1]);
		System.out.println("구매 내역");
		System.out.println("상품명: " + shop.name);
		System.out.println("상품가격: " + shop.price);
		System.out.println("할인율: " + customers[choice - 1].discount);
		System.out.println("최종 결제 금액: " + result);
	}
}

















