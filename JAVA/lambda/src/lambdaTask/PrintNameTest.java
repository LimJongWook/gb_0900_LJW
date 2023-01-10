package lambdaTask;

import java.util.Scanner;

public class PrintNameTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String result = "", firstName = "",secondName = "";
		PrintName printName = (f,s) -> f + s;
		
		System.out.println("성을 입력하세요");
		firstName = sc.next();
		System.out.println("이름을 입력하세요.");
		secondName = sc.next();
		
		result = printName.getFullName(firstName, secondName);
		System.out.println(result);
		
	}
}
