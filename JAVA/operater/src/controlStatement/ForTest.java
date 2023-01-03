package controlStatement;

public class ForTest {
	public static void main(String[] args) {
//		이름 10번 출력
		for (int i = 0; i < 10; i++) {
			System.out.println(i+1 + ".임종욱");
		}
		
//		10부터 ~ 1까지 출력
		for (int i = 0; i < 10; i+=1) {
			System.out.print(10-i+" ");
		}
	}
}
