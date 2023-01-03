package operTest;

import java.util.Scanner;

public class Oper2 {
	public static void main(String[] args) {
//		두 정수 대소비교
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		String message = "두개의 정수를 입력하세요", result = "";

		System.out.println(message);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		result = num1 > num2 ? "큰값 : "+ num1 : num1 == num2 ? "두수는 같습니다." : "큰 값" + num2;
		System.out.println(result);
	
	}
}
