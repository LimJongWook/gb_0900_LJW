package arrayListTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DateApp {

	public ArrayList<Love> love = DBConnecter.love;
	
//	추가
	public void add(Love user) {
		love.add(user);
	}
	
//	사용자가 원하는 나이의 이상형 목록 조회
	public ArrayList<Love> findIdeal(int age){
		ArrayList<Love> idealInfo = new ArrayList<Love>();
		
		for (Love user : love) {
			if(user.getAge() == age) {
				idealInfo.add(user);
			}
		}
		return idealInfo;
	}
	
//	이상형의 나이 수정
	public void changeAge(Love user) {
		for (Love userInfo : love) {
			if(userInfo.getNum() == user.getNum()) {
				user.setAge(user.getAge());
			}
		}
	}
	
//	이상형 나이 순 정렬
	public ArrayList<Love> sortAge() {
		ArrayList<Love> idealInfoSort = new ArrayList<Love>();
		ArrayList<Integer> age = new ArrayList<Integer>();
		
		for (int i = 0; i < love.size(); i++) {
			age.add(love.get(i).getAge());
		}
		Collections.sort(age);
		
		for (int i = 0; i < age.size(); i++) {
			for (int j = 0; j < love.size(); j++) {
				if(age.get(i) == love.get(i).getAge()) {
					idealInfoSort.add(love.get(i));
				}
			}
		}
		
		return idealInfoSort;
	}
	
}
