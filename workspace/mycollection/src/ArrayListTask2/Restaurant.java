package ArrayListTask2;

import java.util.ArrayList;

public class Restaurant {
	public ArrayList<Food> foods = DBConnecter.foods;
	private final double KEY = 0.1;
//	�̸����� �ߺ� �˻�
	public Food checkFood(String name) {
		Food food = null;
		for (Food temp : foods) {
			if (temp.getName().equals(name)) {
				food = temp;
			}
		}
		return food;
	}
	
////	ī�װ� �ߺ� �˻�
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
	
//	- ���� �߰�
	public void addFood(String name) {
		foods.add(checkFood(name));
	}
	
//	- ���� �̸����� ���� ���� ��ȸ
	public String findFood(String name) {
		return checkFood(name).getCategory();
	}
	
//	- ����ڰ� ���ϴ� ������ ���� ��ü ��ȸ
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
//	- ���� ���� ���� �� ���� 10% ��� >> �� �� �޼ҵ� ��ģ�� ȭ�鿡��?
	public void increasePriceForChangeCategory(Food food) {
		changeCategory(food);
		increasePrice(food.getName());
	}

//	���� ���� ����
	public void changeCategory(Food food) {
		Food changeCategory = null;
		changeCategory = checkFood(food.getName());
		foods.set(foods.indexOf(changeCategory), food);
	}
	
//	���� ���
	public int increasePrice(String name) {
		return (int) (checkFood(name).getPrice() * (1 + KEY));
	}
	

	
//	- ����ڰ� ���ϴ� ������ ���� ���� ��ȸ
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
	
//	ī�װ� �ߺ� �˻�
	public ArrayList<Food> arCategory(String category) {
		ArrayList<Food> arFood = null;
		for (Food temp : foods) {
			if (temp.getCategory().equals(category)) {
				arFood.add(temp);
			}
		}
		return arFood;
	}
	
	
//	a[i] = {"7, �ʹ�, ����" }
	
}
