package hashMapTest;

import org.json.JSONException;
import org.json.JSONObject;

public class JSONWork {
	public static void main(String[] args) {
//		상품 클래스 선언(상품 번호, 상품 이름, 상품 가격, 상품 재고)
//		1. 상품 1개를 제작하여 JSON형식으로 변경
		Product shoes = new Product(1,"나이키",12000, 10);
		JSONObject productJSON = new JSONObject(shoes);
		
//		2. JSON형식의 상품 정보 중 상품 재고 출력
		try {
			System.out.println("재고량 : " + productJSON.get("inven"));
		} catch (JSONException e1) {
			e1.printStackTrace();
		}
		
		
//		3. 할인 중인 상품 정보 제작
		Product computer = new Product(2,"삼성노트북",1300000,5);
		JSONObject productDiscountJSON = new JSONObject(computer);
		
		
//		4. 할인 중인 상품의 KEY값은 "discount"로 설정
//		5. JSON형식으로 변경
		try {
			productJSON.put("discount", productDiscountJSON);
			System.out.println(productJSON);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
//		6. JSON에 할인율 필드 추가
//		7. JSON형식의 상품 정보 중 할인률 출력
		try {
			productDiscountJSON.put("discountRate", 30);
			productDiscountJSON = productJSON.getJSONObject("discount");
			System.out.println("할인율 : " + productDiscountJSON.get("discountRate"));
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
			
	}
}
