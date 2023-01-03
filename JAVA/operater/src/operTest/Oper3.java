package operTest;

import java.util.Scanner;

public class Oper3 {
	public static void main(String[] args) {
//		사용자에게 키를 입력받고
//		정수라면 정수로 출력
//		실수라면 실수로 입력
//		예) 183 -> 183 출력
//		183.5 -> 183.5 출력
//		삼항 연산자를 사용
		Scanner sc = new Scanner(System.in);

//		키를 저장할 변수
		double height = 0.0;
//		실수인지 정수인지 판단
		String result = "";
		String msg = "당신의 키는?";
		String forLength = "";
		int length = 0;
		boolean check = false;
		
		System.out.println(msg);
//		사용자가 입력한 값
		height = sc.nextDouble();
		check = height - (int)height == 0;
		forLength = height - (int)height + "";
		
		length = forLength.length() > 8 ?  8 :  forLength.length();
		
//		값이 0이면 true 아니면 false
		
//		값이 0이 면 %.0f 입니다 아니면 %.1f 입니다.가 result의 값이 된다.
		result = check ? "%.0f 입니다" : "%." + (length - 2)  + "fcm";
//		printf() 사용으로 printf(서식문자,값)
		System.out.printf(result,height);
	
	}
}
