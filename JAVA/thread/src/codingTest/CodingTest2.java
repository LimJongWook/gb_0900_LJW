package codingTest;

import java.util.Iterator;

public class CodingTest2 {
	public int solution(String p, String s) {
		int result = 0;
		
		for (int i = 0; i < p.length(); i++) {
			// 비밀번호와 눈금선의 차가 4보다 크면
			if(4 < p.charAt(i) - s.charAt(i) || s.charAt(i) - p.charAt(i) > 4) {
			// 눈금선의 숫자가 비밀번호의 숫자보다 크면 10 - 눈금선 숫자 + 비밀번호
			// 비밀번호의 숫자가 눈금선의 숫자보다 크면 10 - 비멀번호 + 눈금선 숫자
				result += p.charAt(i) > s.charAt(i) ? 10 - p.charAt(i) + s.charAt(i) : 10 - s.charAt(i) + p.charAt(i);
			//눈금선의 숫자가 비밀번호의 숫자보다 크면
			}else if(p.charAt(i) > s.charAt(i)) {
				// 눈금선의 숫자 - 비밀번호의 숫자
				result += p.charAt(i) - s.charAt(i);
			}else { // 비밀번호의 숫자가 더 크면
				// 비밀번호의 숫자 - 눈금선의 숫자
				result += s.charAt(i) - p.charAt(i);
			}
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		String n = "0000";
		String r = "5655";
		int result = 0;
		
		CodingTest2 c = new CodingTest2();
		
		result = c.solution(n, r);
		System.out.println(result);
	}
}
