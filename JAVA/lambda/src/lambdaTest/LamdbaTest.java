package lambdaTest;

public class LamdbaTest {
	public static void main(String[] args) {
//		LamdbaInter lamdbaInter = (number) -> number % 10 == 0;
//		System.out.println(lamdbaInter.checkMultipleOf10(100));
	
		LamdbaInter lamdbaInter = (number) ->{
			System.out.println("10의 배수 검사");
			return number % 10 == 0;
		};
	
		boolean result = lamdbaInter.checkMultipleOf10(100);
		System.out.println(result);
	}
}
