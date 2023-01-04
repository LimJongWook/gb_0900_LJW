package classTest;

class Company{
	static Long sequence;
	static Long total;
	Long id;
	String name;
	Long salary;
	int income;
	
//  생성자를 불러올 때 한번만 실행
	static {
		sequence = 0L;
		total = 0L;
	}
	
//	초기화 블록
	{
		id = ++sequence;
	}
	
	public Company(String name, Long salary) {
		this.name = name;
		this.salary = salary;
	}
	
	void printMyData() {
		System.out.println(id + ", " + name + ", 연 " + salary + "만원" );
	}
}

public class Market {
	public static void main(String[] args) {
		Company 한동석 = new Company("한동석", 4000L);
		Company 정유찬 = new Company("정유찬", 6000L);
		Company 오태양 = new Company("오태양", 7000L);
		Company 김욱성 = new Company("김욱성", 10000L);

		한동석.printMyData();
		정유찬.printMyData();
		오태양.printMyData();
		김욱성.printMyData();
		
		Company.total += 한동석.income = 1000;
		Company.total += 오태양.income = 2000;
		Company.total += 정유찬.income = -10000;
		Company.total += 김욱성.income = -20000;
		
		System.out.println(Company.total);
	}
}
