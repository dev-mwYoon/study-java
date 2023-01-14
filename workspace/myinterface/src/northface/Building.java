package northface;

public class Building {
	public static void main(String[] args) {
		NorthFace gangnam = new NorthFace();
		NorthFace jamsil = new NorthFace();
		
		gangnam.register(new Form() {
			
			@Override
			public void sell(String menu) {
				String[] menus = getMenu();
				for (int i = 0; i < menus.length; i++) {
					if (menus[i].equals(menu)) {
						System.out.println(menu + " 판매 완료");
					}
				}
			}
			
			@Override
			public String[] getMenu() {
				return new String[] {"운동화", "티셔츠", "바지"};
			}
		});
		
		jamsil.register(new FormAdapter() {
			
			@Override
			public String[] getMenu() {
				return new String[] {"반품된 새상품"};
			}
		});
	}
}
