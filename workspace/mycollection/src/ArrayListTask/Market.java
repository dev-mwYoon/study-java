package ArrayListTask;

import java.util.ArrayList;

public class Market {
	public ArrayList<Fruit> fruitInfo = DBConnecter.fruits;
	
//	과일 이름 중복 검사
	public Fruit checkFruit(String name) {
		Fruit fruit = null;
		
		for (Fruit temp : fruitInfo) {
			if (temp.getName().equals(name)) {
				fruit = temp;
			}
		}
		return fruit;
	}
	
	
//	과일 추가
	public void addFruit(Fruit fruit) {
//		화면쪽에서 null이 아닐 때 메소드 진행 하므로 필요 x
//		boolean flag = checkFruit(fruit.getName()) == null;
//		if(flag) {fruitInfo.add(fruit);} 
		fruitInfo.add(fruit);
	}
	
	
//	과일 삭제  >>  이건 보통 체크박스로 하기 때문에 void로함.
	public void removeFruit(String name) {
//		화면쪽에서 null이 아닐 때 메소드 진행 하므로 필요 x
//		boolean flag = checkFruit(name) != null;
//		if(flag) {
//			fruitInfo.remove(fruit);
//		}
		Fruit fruit = checkFruit(name);
		fruitInfo.remove(fruit);
	}
	
//	평균 가격
	public int avgFruit() {
		int avg = 0, total = 0;
		for (Fruit temp : fruitInfo) {
			total += temp.getPrice();
		}
		avg = total / fruitInfo.size();
		return avg;
	}
	
//	과일 가격이 평균 가격보다 낮은 지 검사
	public boolean avgPriceUpOrDown(int price) {
		return avgFruit() > price;
	}
	
//	과일 전체 조회
	public ArrayList<Fruit> selectAll() {
		return fruitInfo;
	}
	
//	과일 이름으로 가격 조회
	public int showFruitPrice(String name) {
		return checkFruit(name).getPrice();
	}
	
}
