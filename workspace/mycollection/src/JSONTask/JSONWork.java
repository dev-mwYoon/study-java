package JSONTask;

import org.json.JSONException;
import org.json.JSONObject;

public class JSONWork {
	public static void main(String[] args) throws JSONException {
//		��ǰ Ŭ���� ����(��ǰ ��ȣ, ��ǰ �̸�, ��ǰ ����, ��ǰ ���)
//		1. ��ǰ 1���� �����Ͽ� JSON�������� ����
//		2. JSON ������ ��ǰ ���� �� ��ǰ ��� ���
		
//		3. ���� ���� ��ǰ ���� ����
//		4. ���� ���� ��ǰ�� KEY���� "discount"�� ����
//		5. JSON�������� ����
//		6. JSON�� ������ �ʵ� �߰�
//		7. JSON������ ��ǰ ���� �� ������ ���
		
//		1. ��ǰ 1���� �����Ͽ� JSON�������� ����		
		Product product = new Product(1, "����", 500, 100);
		JSONObject productJSON = new JSONObject(product);
		System.out.println(productJSON);

//		2. JSON ������ ��ǰ ���� �� ��ǰ ��� ���
		System.out.println(productJSON.get("inventory"));
		// TODO Auto-generated catch block
		
//		3. ���� ���� ��ǰ ���� ����
		Product product2 = new Product(2, "���ݸ�", 1000, 100);
//		4. ���� ���� ��ǰ�� KEY���� "discount"�� ����
		final double KEY = 0.9; 
//		5. JSON�������� ����
		JSONObject productJSON2 = new JSONObject(product2);
		JSONObject discountJSON = new JSONObject(product);
		discountJSON.put("discount", productJSON2);
		System.out.println(discountJSON);
		
		try {
//			6. JSON�� ������ �ʵ� �߰�
			productJSON2.put("discount", KEY);
//			7. JSON������ ��ǰ ���� �� ������ ���
			System.out.println(productJSON2.get("discount"));
			System.out.println("��ü ���");
			System.out.println(productJSON2);
			System.out.println("===================================");
			int price = (int) productJSON2.get("price");
			double discount = (double) productJSON2.get("discount");
			int discountPrice = (int)(price * discount);
			productJSON2.put("price", discountPrice);
			System.out.println(productJSON2);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
