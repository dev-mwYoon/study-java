package northface;
//��ȭ �ǽ�(Ŭ���� ~ �͸� Ŭ����)
//
//- ��Ÿ���� ���� Ŭ���� ����(register(Form form))
//- ���� ���� ��� �������̽� ����(Form)
//- �ǹ� Ŭ���� ����(main �޼ҵ�)
//
//��Ÿ���� ���� ���� �� ���翡 ����� �ۼ��Ͽ� ����
//- ���� ��Ŀ��� �޴���(getMenu())�� �Ǹ� ���(sell(String menu))�� �ۼ��Ѵ�.
//- �������� �޴� �״�� �Ǹ��� �� �־�� �ϰ�, ������� ���� ���� ������̴�.
//- (�� ������ �Ǹ� ����� �ٸ��� ������) ���� ���� ������� ������ �Ǹ� ����� ���� ����.
public class NorthFace {
	public void register(Form form) {
		String[] menu = form.getMenu();
		for (int i = 0; i < menu.length; i++) {
			System.out.println(menu[i]);
		}
		if (form instanceof FormAdapter) {
			System.out.println("���� ���� ��� �����Դϴ�.");
			return;
		}
		form.sell("�ȭ");
		
	}
}
