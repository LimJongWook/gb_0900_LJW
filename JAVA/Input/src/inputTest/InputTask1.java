package inputTest;

import java.util.Scanner;

public class InputTask1 {
	public static void main(String[] args) {
//		두 정수를 입력한 뒤 덧셈 결과 출력
//		단, next()만 사용한다.
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0 , num2 = 0;
		System.out.print("첫번쨰 정수 : ");
		num1 = Integer.parseInt(sc.next());
		System.out.print("두번째 정수 : ");
		num2 = Integer.parseInt(sc.next());
		
		System.out.println("두 정수의 합: " + (num1+num2));
		System.out.printf("%d + %d = "+(num1+num2),num1,num2);
		
	}
}
