package controlStatement;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
//		두 정수 대소비교
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		String message = "두개의 정수를 입력하세요", result = "";
		
		System.out.println(message);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if(num1 > num2) {
			result = "큰값 : " + num1;
		}else if(num2 > num1) {
			result = "큰값 : " + num2;
		}else {
			result = "두 수가 같습니다.";
		}
		
		System.out.println(result);
	}
}
