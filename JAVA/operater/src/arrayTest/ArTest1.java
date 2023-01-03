package arrayTest;

public class ArTest1 {
	public static void main(String[] args) {
//		int[] arData = {2, 4, 5, 6, 8};
		
//		System.out.println(arData);
//		System.out.println(arData.length);
		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		
//		5, 4, 3, 2, 1을 넣고 출력
//		방법1
//		int[] arDatas = {5, 4, 3, 2, 1};
//		for (int i = 0; i < arDatas.length; i++) {
//			System.out.println(arDatas[i]);
//		}
		
//		5, 4, 3, 2, 1을 넣고 출력
//		방법2
		int[] arNum = new int[5];
		for (int i = 0; i < arNum.length; i++) {
			arNum[i] = 5 - i;
			System.out.print(arNum[i] + " ");
		}
		
	}
}
