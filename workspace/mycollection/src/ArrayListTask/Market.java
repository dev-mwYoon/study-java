package ArrayListTask;

import java.util.ArrayList;

public class Market {
	public ArrayList<Fruit> fruitInfo = DBConnecter.fruits;
	
//	���� �̸� �ߺ� �˻�
	public Fruit checkFruit(String name) {
		Fruit fruit = null;
		
		for (Fruit temp : fruitInfo) {
			if (temp.getName().equals(name)) {
				fruit = temp;
			}
		}
		return fruit;
	}
	
	
//	���� �߰�
	public void addFruit(Fruit fruit) {
//		ȭ���ʿ��� null�� �ƴ� �� �޼ҵ� ���� �ϹǷ� �ʿ� x
//		boolean flag = checkFruit(fruit.getName()) == null;
//		if(flag) {fruitInfo.add(fruit);} 
		fruitInfo.add(fruit);
	}
	
	
//	���� ����  >>  �̰� ���� üũ�ڽ��� �ϱ� ������ void����.
	public void removeFruit(String name) {
//		ȭ���ʿ��� null�� �ƴ� �� �޼ҵ� ���� �ϹǷ� �ʿ� x
//		boolean flag = checkFruit(name) != null;
//		if(flag) {
//			fruitInfo.remove(fruit);
//		}
		Fruit fruit = checkFruit(name);
		fruitInfo.remove(fruit);
	}
	
//	��� ����
	public int avgFruit() {
		int avg = 0, total = 0;
		for (Fruit temp : fruitInfo) {
			total += temp.getPrice();
		}
		avg = total / fruitInfo.size();
		return avg;
	}
	
//	���� ������ ��� ���ݺ��� ���� �� �˻�
	public boolean avgPriceUpOrDown(int price) {
		return avgFruit() > price;
	}
	
//	���� ��ü ��ȸ
	public ArrayList<Fruit> selectAll() {
		return fruitInfo;
	}
	
//	���� �̸����� ���� ��ȸ
	public int showFruitPrice(String name) {
		return checkFruit(name).getPrice();
	}
	
}
