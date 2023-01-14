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
						System.out.println(menu + " �Ǹ� �Ϸ�");
					}
				}
			}
			
			@Override
			public String[] getMenu() {
				return new String[] {"�ȭ", "Ƽ����", "����"};
			}
		});
		
		jamsil.register(new FormAdapter() {
			
			@Override
			public String[] getMenu() {
				return new String[] {"��ǰ�� ����ǰ"};
			}
		});
	}
}
