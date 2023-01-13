package collectionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.IntStream;

public class StreamTask {
	public static void main(String[] args) {
		ArrayList<Integer> datas = new ArrayList<Integer>();
		
//		10부터 1까지 ArrayList에 담고 출력
//		IntStream.range(0, 10).forEach(v -> datas.add(10-v));
//		System.out.println(datas);

//		1부터 10까지 ArrayList에 담고 출력
//		IntStream.range(1, 11).forEach(datas::add);
//		System.out.println(datas);
		
//		ABCDEF를 각문자별로 출력
//		"ABCDEF".chars().forEach(v -> System.out.println((char)v));
//		IntStream.range('A', 'F').forEach(c -> System.out.println((char)c));

//		1~100까지 중 홀수만 ArrayList에 담고 출력
//		IntStream.range(1, 51).map(v -> v * 2 - 1).forEach(datas::add);;
//		System.out.println(datas);

//		A~F까지 중 D제외하고 ArrayList에 담고 출력
//		IntStream.range('A', 'F').map(c -> c > 67 ? c + 1 : c).forEach(c -> System.out.println((char)c));
	
//		5개의 문자열을 모두 소문자로 변경(Black, WHITE, reD, yeLLow, PINk), toLowerCase()
//		ArrayList<String> datas2 = new ArrayList<String>(Arrays.asList("Black","WHITE","reD","PINk"));
//		datas2.stream().map(String::toLowerCase).forEach(v -> System.out.println(v));
		
//		1~100까지 중 홀수만 ArrayList에 담고 출력	
//		IntStream.range(1, 101).filter(v -> v % 2 != 0).forEach(datas::add);
//		System.out.println(datas);
		
//		Apple, banana, Melon 중 첫번째 문자가 대문자인 문자열 출력
//		ArrayList<String> datas3 = new ArrayList<String>(Arrays.asList("Apple","banana","Melon"));
//		datas3.stream().filter(v -> v.charAt(0) >= 'A' && v.charAt(0) <= 'Z').forEach(v -> System.out.println(v));
		
//		한글을 정수로 변경
		String e = "공일이삼사오육칠팔구";
//		String f = "공사공구";
		String a = "1024";
		
//		f.chars().map(e::indexOf).forEach(System.out::print);
//		정수를 한글로 변경
		
		a.chars().map(c -> c - 48).forEach(c -> System.out.println((char)c));
	
	}
}
