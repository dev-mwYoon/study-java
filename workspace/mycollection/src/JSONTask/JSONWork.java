package JSONTask;

import org.json.JSONException;
import org.json.JSONObject;

public class JSONWork {
	public static void main(String[] args) throws JSONException {
//		상품 클래스 선언(상품 번호, 상품 이름, 상품 가격, 상품 재고)
//		1. 상품 1개를 제작하여 JSON형식으로 변경
//		2. JSON 형식의 상품 정보 중 상품 재고 출력
		
//		3. 할인 중인 상품 정보 제작
//		4. 할인 중인 상품의 KEY값은 "discount"로 설정
//		5. JSON형식으로 변경
//		6. JSON에 할인율 필드 추가
//		7. JSON형식의 상품 정보 중 할인율 출력
		
//		1. 상품 1개를 제작하여 JSON형식으로 변경		
		Product product = new Product(1, "사탕", 500, 100);
		JSONObject productJSON = new JSONObject(product);
		System.out.println(productJSON);

//		2. JSON 형식의 상품 정보 중 상품 재고 출력
		System.out.println(productJSON.get("inventory"));
		// TODO Auto-generated catch block
		
//		3. 할인 중인 상품 정보 제작
		Product product2 = new Product(2, "초콜릿", 1000, 100);
//		4. 할인 중인 상품의 KEY값은 "discount"로 설정
		final double KEY = 0.9; 
//		5. JSON형식으로 변경
		JSONObject productJSON2 = new JSONObject(product2);
		JSONObject discountJSON = new JSONObject(product);
		discountJSON.put("discount", productJSON2);
		System.out.println(discountJSON);
		
		try {
//			6. JSON에 할인율 필드 추가
			productJSON2.put("discount", KEY);
//			7. JSON형식의 상품 정보 중 할인율 출력
			System.out.println(productJSON2.get("discount"));
			System.out.println("전체 출력");
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
