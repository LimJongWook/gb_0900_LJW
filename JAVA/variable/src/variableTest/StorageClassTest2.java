package variableTest;

public class StorageClassTest2 {
	public static void main(String[] args) {
		StorageClassTest1 object = new StorageClassTest1();
	
		StorageClassTest1.increaseData_s();
		StorageClassTest1.increaseData_s();
		StorageClassTest1.increaseData_s();
		StorageClassTest1.increaseData_s();
		StorageClassTest1.increaseData_s();
		object = new StorageClassTest1();
		StorageClassTest1.increaseData_s();
		StorageClassTest1.increaseData_s();
		StorageClassTest1.increaseData_s();
		StorageClassTest1.increaseData_s();
		StorageClassTest1.increaseData_s();
		
		
//		object.increaseData();
//		object.increaseData();
//		object.increaseData();
//		object.increaseData();
//		object.increaseData();
//		object = new StorageClassTest1();
//		object.increaseData();
//		object.increaseData();
//		object.increaseData();
//		object.increaseData();
//		object.increaseData();
	}
}
