package classTest;

public class Shop {
	String name;
	int price;
	int stock;
	
	public Shop() {;}

	public Shop(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	int sell(Customer customer) {
//		구매하면 재고 하나씩 줄음
		stock--;
//		할인율 적용하여 지불해야하는 값
//							1000 * (1.0 - 10 / 100)
		int result = (int)(price * (1.0 - customer.discount / 100.0));
//		고객의 돈에서 할인율 적용된 제품가격을 빼서 고객 잔고로 다시 설정함.
		customer.money = customer.money - result;
		return result;
	}
}

















