package arrayListTask;

import java.util.ArrayList;
import java.util.Iterator;

public class MyMarket {

	public ArrayList<Fruit> fruits = DBConnecter.fruits;

//	과일 추가
	public void addFruit(Fruit fruit) {
		fruits.add(fruit);
	}

// 과일 삭제
	public void removeFruit(String fruitName) {
		for (int i = 0; i < fruits.size(); i++) {
			if(fruits.get(i).getFruitName().equals(fruitName)) {
				fruits.remove(i);
			}
		}
	}
	
// 과일 가격이 평균 가격보다 낮은 지 검사
	public boolean avgDownCheck(int price) {
		int priceTotal = 0;
		int priceAvg = 0;
		
		for (int i = 0; i < fruits.size(); i++) {
			priceTotal += fruits.get(i).getPirce();
		}
			priceAvg = priceTotal / fruits.size();
		
		if(price < priceAvg) {
			return true;
		}
		return false;
	}
	
	// 과일 전체 조회
	public ArrayList<Fruit> totalLookup() {
//		ArrayList<Fruit> fruitsInfo = new ArrayList<Fruit>();
//			for (Fruit fruit : fruits) {
//				fruitsInfo.add(fruit);
//			}
//		return fruitsInfo;
		return fruits;
	}
	
//	과일 이름으로 가격 조회
	public int findFruitPrice(String FruitName) {
		int price = 0;
		for (int i = 0; i < fruits.size(); i++) {
			if(fruits.get(i).getFruitName().equals(FruitName)) {
				price = fruits.get(i).getPirce();
				return price;
			}
		}
		return price;
	}
}
