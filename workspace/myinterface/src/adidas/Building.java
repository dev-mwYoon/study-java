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
						System.out.println("�Ǹ� �Ϸ�");
					}
				}
				
			}
			
			@Override
			public String[] getMenu() {
				return new String[] {"��", "�ȭ", "Ƽ����"};
			}
		});
		
		jamsil.register(new FormAdapter() {
			
			@Override
			public String[] getMenu() {
				return new String[] {"����"};
			}
		});
		
	}
}
