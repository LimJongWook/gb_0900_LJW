package controlStatement;

import java.util.Iterator;
import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
//		브론즈
//		1~100까지 출력
//		for (int i = 0; i < 100; i++) {
//			System.out.print(i+1 + " ");
//		}
//		100~1까지 출력
//		for (int i = 0; i < 100; i++) {
//			System.out.print(100-i + " ");
//		}
//		1~100까지 중 짝수만 출력
//		for (int i = 1; i < 50; i++) {
//				System.out.print((i+1)*2+ " ");
//		}
		
//		실버	
//		1~10까지 합 출력
//		int sum = 0;
//		for (int i = 0; i < 10; i++) {
//			sum += i+1;
//		}
//		System.out.println(sum);
		
//		1~n까지 합 출력
//		Scanner sc = new Scanner(System.in);
//		int sum = 0;
//		System.out.print("1~n 까지 값의 n을 입력하세요 : ");
//		int count = sc.nextInt();
//		for (int i = 0; i < count; i++) {
//			sum += i+1;
//		}
//		System.out.println(sum);
		
//		골드
//		A~F까지 출력
//		for (int i = 0; i < 6; i++) {
//			System.out.println((char)(i+65));
//		}
		
//		A~F까지 중 C제외하고 출력
//		for (int i = 0; i < 5; i++) {
//			System.out.println(i>1 ? (char)(i+1+65) : (char)(i+65));
//		}
		
//		다이아
//		0 1 2 3 0 1 2 3 0 1 2 3 출력
//		for (int i = 0; i < 4; i++) {
//			System.out.println(i % 4 + " ");
//		}
		
//		aBcDeFgH..... 출력
		for (int i = 0; i < 26 ; i++) {
			if(i%2 == 0) {
				System.out.print((char)(i	+97));
			}else {
				System.out.print((char)(i+65));
			}
		}
	}
}
