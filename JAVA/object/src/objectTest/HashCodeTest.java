package objectTest;

import java.util.Random;

public class HashCodeTest {
	public static void main(String[] args) {
		String data1 = "ABC";
		String data2 = "ABC";
		
//		System.out.println(data1);
//		System.out.println(data2);
		
//		System.out.println(data1.toString());
//		System.out.println(data2.toString());
		
		System.out.println(data1.hashCode());
		System.out.println(data2.hashCode());
	}
}
