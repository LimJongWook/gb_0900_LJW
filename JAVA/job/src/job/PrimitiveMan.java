package job;

//	- 주제 : 원하는 직업을 클래스로 선언 (원숭이 - 원시인 - 평범한 사람 - 외계인 )
//	- 반드시 수익 창출이 되어야 한다.
// 	- 확률을 추가한다.
// 	- 구현에 필요한 필드는 얼마든지 추가 선언이 가능하다.
//		Ex) 승진, 티어 승급, 연속 5회 성공 시 레벨 업 등
public class PrimitiveMan {
	String identity;
	String gender;
	int count;
	int restCount;
	boolean check;
	
	{
		restCount = 10;
	}
	
	public PrimitiveMan() {}
	
//  원시인 일때는 사냥
	void faming() {
		check = true;
	}
	
	
	void rest() {
		check = true;
	}
	
	boolean count(int count) {
		return count >= 5;
	}
	
	
}
