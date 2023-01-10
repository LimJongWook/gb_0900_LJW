package wrapperTest;

public class WrapperTask {
	public static void main(String[] args) {
//		1, 13.5, 86.6F, 'Z', "Hi", false
		// 위 6개의 값을 6칸 배열에 담기
		
		Object[] arObj = {1, 13.5, 86.6F, 'Z', "Hi", false};
		
		
		for (int i = 0; i < arObj.length; i++) {
			System.out.println(arObj[i]);
		}
	}
}
