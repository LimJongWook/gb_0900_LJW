package exceptionTest;

import java.io.IOException;
import java.util.Scanner;

public class Chatting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = null;
		
		System.out.print("메세지 : ");
		message = sc.nextLine();
		
		if(message.contains("바보")) {
			try {
				throw new BadWordExption("욕설은 안되요!");
			} catch (BadWordExption e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
