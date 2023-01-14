package mynike;

public class Building {
	public static void main(String[] args) {
		
		Nike jamsil = new Nike();
		Nike gangnam = new Nike();
		
		gangnam.register(new FormAdapter() {
			
			@Override
			public String[] getMenu() {
				return new String[] {"�߰�"};
			}
		});
		
		jamsil.register(new Form() {
			
			@Override
			public void sell(String menu) {
				String[] menus = getMenu();
				for (int i = 0; i < menus.length; i++) {
					if (menus[i].equals(menu)) {
						System.out.println(menu + " �ǸſϷ�");
					}
				}
			}
			
			
			@Override
			public String[] getMenu() {
				return new String[] {"�󱸰�", "�౸��", "�ȭ"};
			}
		});
	}
}
