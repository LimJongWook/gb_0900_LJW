package codingTest;

import java.util.Iterator;

public class CodingTest1 {
	
	public int result(String number) {
//		연속되는 1의 최대 개수 구하기
//		0을 없애고 배열에 담아주기
		int result = 0;
		
//		처음 배열의 길이를 담아주기
		String[] numbers = number.split("0");
		try {
			result = numbers[0].length();
			
			for (int i = 0; i < numbers.length; i++) {
//				담아준 길이보다 더 길다면 다시 담아준다.
					if(result < numbers[i].length()) {
						result = numbers[i].length();
					}
			}
		} catch (Exception e) {;}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		String number = "00000";
		int result = 0;
		CodingTest1 c = new CodingTest1();
		
		result = c.result(number);
		System.out.println(result);
	}
}
