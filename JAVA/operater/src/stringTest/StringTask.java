package stringTest;

import java.util.Iterator;
import java.util.Scanner;

public class StringTask {
	public static void main(String[] args) {
//		사용자에게 입력받은 문자열 중 소문자는 모두 대문자로,
//		대문자는 모두 소문자로 변경한다.
//		Scanner sc = new Scanner(System.in);
//		String msg = "영어로 입력하세요 예)AbCD";
//		null로 초기화했다면, 대입 연산자를 사용하겠다는 뜻.
//		""로 초기화 했다면, 누적 연산자를 사용하겠다는 뜻.
//		String text = null;
//		String text1 = "";
//		
//		메시지 출력
//		System.out.println(msg);
//		text에 입력 문자 받기
//		text = sc.nextLine();
//
//		text의 길이만큼 반복문을 돌린다.
//		for (int i = 0; i < text.length(); i++) {
//			문자 자료형에 문자열의 문자를 뽑는다.
//			char c = text.charAt(i);
//			if(c >= 65 && c <= 90) {
//				 text1 += (char)(c + 32);
//			}else if(c >= 97 && c <= 122) {
//				text1 += (char)(c - 32);
//			}else{
//				text1 += c;
//			}
//		}
//		System.out.println(text1);
		
		
//		정수를 한글로 변경
//		예) 1024 -> 일공이사
		Scanner sc = new Scanner(System.in);
		String str = "공일이삼사오육칠팔구";
		String msg = "정수를 입력하세요\n 예)1024";
		String number = "";
		String result = "";
		
		System.out.println(msg);
		number = sc.next();
		
		for (int i = 0; i < number.length(); i++) {
			 result += str.charAt(number.charAt(i)-48);
		}
		
		System.out.println(result);
	
//      int number = 0;
//      
//      System.out.print(message);
//      number = sc.nextInt();
//      
//      while(number != 0) { // 계속 나누어서 몫이 0이 될 때까지 반복
//         result = hangle.charAt(number % 10) + result;
//         number /= 10;
//      }
//      System.out.println(result);

		
		
		
		
	}
}
