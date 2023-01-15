package ArrayListTask2;

import java.util.ArrayList;

public class Restaurant {
	public ArrayList<Food> foods = DBConnecter.foods;
	private final double KEY = 0.1;
//	이름으로 중복 검사
	public Food checkFood(String name) {
		Food food = null;
		for (Food temp : foods) {
			if (temp.getName().equals(name)) {
				food = temp;
			}
		}
		return food;
	}
	
////	카테고리 중복 검사
//	private String[][] checkCategory(String category) {
//		String[][] arTemp = new String[4][];
//		String needFood = "";
//		int number = 0;
////		for (Food temp : foods) {
////			if (temp.getCategory().equals(category)) {
////				needFood += temp.getName();
////				number ++;
////			}
////		}
//		
//		for (int i = 0; i < arTemp[i].length; i++) {
//			for (int j = 0; j < foods.size(); j++) {
//				if (foods.get(i).getCategory().equals(category)) {
//					needFood += foods.get(i).getName();
//					number ++;
//					arTemp[i][j] = number+ ", " + needFood;
//				}
//			}
//		}
//		
//		return arTemp;
//	}
	
//	- 음식 추가
	public void addFood(String name) {
		foods.add(checkFood(name));
	}
	
//	- 음식 이름으로 음식 종류 조회
	public String findFood(String name) {
		return checkFood(name).getCategory();
	}
	
//	- 사용자가 원하는 종류의 음식 전체 조회
	public ArrayList<Food> sellectOneOfCategory(String category){
		return arCategory(category);
		
//		String needFood = "";
//		Food temp = test(category);
//		
//		needFood += test(cate)
//		return test(category)
		
//		String needFood = "";
//		for (Food temp : foods) {
//			if (temp.getCategory().equals(category)) {
//				needFood += temp.getName();
//			}
//		}
//		return needFood;
	}
//	- 음식 종류 수정 후 가격 10% 상승 >> 이 두 메소드 합친건 화면에서?
	public void increasePriceForChangeCategory(Food food) {
		changeCategory(food);
		increasePrice(food.getName());
	}

//	음식 종류 수정
	public void changeCategory(Food food) {
		Food changeCategory = null;
		changeCategory = checkFood(food.getName());
		foods.set(foods.indexOf(changeCategory), food);
	}
	
//	가격 상승
	public int increasePrice(String name) {
		return (int) (checkFood(name).getPrice() * (1 + KEY));
	}
	

	
//	- 사용자가 원하는 종류의 음식 개수 조회
	public int numberOfSelectCategory(String category) {
		return arCategory(category).size();
		
//		int number = 0;
//		for (Food temp : foods) {
//			if (temp.getCategory().equals(category)) {
//				number ++;
//			}
//		}
//		
//		return number;
	}
	
//	카테고리 중복 검사
	public ArrayList<Food> arCategory(String category) {
		ArrayList<Food> arFood = null;
		for (Food temp : foods) {
			if (temp.getCategory().equals(category)) {
				arFood.add(temp);
			}
		}
		return arFood;
	}
	
	
//	a[i] = {"7, 초밥, 덮밥" }
	
}
