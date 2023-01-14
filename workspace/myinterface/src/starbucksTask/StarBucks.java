package starbucksTask;

public class StarBucks {
	
	public void register(Form form) {
		String[] menu = form.getMenu();
		for (int i = 0; i < menu.length; i++) {
			System.out.println(menu[i]);
		}
		
		if (form instanceof FormAdapter) {
			System.out.println("무료 나눔 매장입니다.");
			return; // 스위치의 break와 같음. register메소드를 멈추기 위해서 사용?
		}
		form.sell("아메리카노");
	}


}
