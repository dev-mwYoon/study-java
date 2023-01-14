package northface;
//심화 실습(클래스 ~ 익명 클래스)
//
//- 스타벅스 본사 클래스 선언(register(Form form))
//- 본사 제출 양식 인터페이스 선언(Form)
//- 건물 클래스 선언(main 메소드)
//
//스타벅스 지점 오픈 시 본사에 양식을 작성하여 제출
//- 제출 양식에는 메뉴판(getMenu())과 판매 방식(sell(String menu))을 작성한다.
//- 강남점은 메뉴 그대로 판매할 수 있어야 하고, 잠실점은 무료 나눔 행사중이다.
//- (두 지점은 판매 방식이 다르기 때문에) 무료 나눔 행사중인 지점은 판매 방식이 따로 없다.
public class NorthFace {
	public void register(Form form) {
		String[] menu = form.getMenu();
		for (int i = 0; i < menu.length; i++) {
			System.out.println(menu[i]);
		}
		if (form instanceof FormAdapter) {
			System.out.println("무료 나눔 행사 매장입니다.");
			return;
		}
		form.sell("운동화");
		
	}
}
