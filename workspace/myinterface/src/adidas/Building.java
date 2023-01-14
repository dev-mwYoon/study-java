package adidas;

public class Building {
	public static void main(String[] args) {
		Adidas gangnam = new Adidas();
		Adidas jamsil = new Adidas();
		
		gangnam.register(new Form() {
			
			@Override
			public void sell(String menu) {
				String[] menus = getMenu();
				for (int i = 0; i < menus.length; i++) {
					if (menus[i].equals(menu)) {
						System.out.println("판매 완료");
					}
				}
				
			}
			
			@Override
			public String[] getMenu() {
				return new String[] {"물", "운동화", "티셔츠"};
			}
		});
		
		jamsil.register(new FormAdapter() {
			
			@Override
			public String[] getMenu() {
				return new String[] {"구제"};
			}
		});
		
	}
}
