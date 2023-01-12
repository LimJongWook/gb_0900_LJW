package hashMapTest;

import org.json.JSONException;
import org.json.JSONObject;

public class JSONWork {
	public static void main(String[] args) {
//		��ǰ Ŭ���� ����(��ǰ ��ȣ, ��ǰ �̸�, ��ǰ ����, ��ǰ ���)
//		1. ��ǰ 1���� �����Ͽ� JSON�������� ����
		Product shoes = new Product(1,"����Ű",12000, 10);
		JSONObject productJSON = new JSONObject(shoes);
		
//		2. JSON������ ��ǰ ���� �� ��ǰ ��� ���
		try {
			System.out.println("��� : " + productJSON.get("inven"));
		} catch (JSONException e1) {
			e1.printStackTrace();
		}
		
		
//		3. ���� ���� ��ǰ ���� ����
		Product computer = new Product(2,"�Ｚ��Ʈ��",1300000,5);
		JSONObject productDiscountJSON = new JSONObject(computer);
		
		
//		4. ���� ���� ��ǰ�� KEY���� "discount"�� ����
//		5. JSON�������� ����
		try {
			productJSON.put("discount", productDiscountJSON);
			System.out.println(productJSON);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
//		6. JSON�� ������ �ʵ� �߰�
//		7. JSON������ ��ǰ ���� �� ���η� ���
		try {
			productDiscountJSON.put("discountRate", 30);
			productDiscountJSON = productJSON.getJSONObject("discount");
			System.out.println("������ : " + productDiscountJSON.get("discountRate"));
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
			
	}
}
