package arrayListTask;

import java.util.ArrayList;

public class Restaurant{
	public ArrayList<Food> foods = DBConnecter.foods;
	
// 	음식 추가
	public void add(Food food) {
		foods.add(food);
	}
	
//	음식 이름으로 음식 종류 조회
	public String lookUp(String name) {
		String kind = null;
		for (int i = 0; i < foods.size(); i++) {
			if(foods.get(i).getName().equals(name)) {
				kind = foods.get(i).getKind();
			}
		}
		return kind;
	}

//	사용자가 원하는 종류의 음식 전체 조회
	public ArrayList<Food> findFood(String kind){
		ArrayList<Food> kindInfo = new ArrayList<Food>();
		for (Food food : foods) {
			if(food.getKind().equals(kind)) {
				kindInfo.add(food);
			}
		}
		return kindInfo;
	}
	
//	음식 종류 수정 후 가격 10% 상승
	public void changeKind(Food food) {
		int price = price10Up(food);
		for (Food foodInfo : foods) {
			if(foodInfo.getName().equals((food.getName()))) {
				food.setKind(food.getKind());
				food.setPrice(price);
			}
		}
	}
	
//	10% 가격인상
	public int price10Up(Food food) {
		int price = food.getPrice();
		price += price * 0.1;
		
		return price;
	}
	
	
//	사용자가 원하는 종류의 음식 개수 조회
	public int kindCount(String kind) {
		int count = 0;
		
		for (Food food : foods) {
			if(food.getKind().equals(kind)) {
				count++;
			}
		}
		return count;
	}
}
