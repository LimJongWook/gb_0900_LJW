package variableTest;

public class StorageClassTest2 {
	public static void main(String[] args) {
		StorageClassTest1 object = new StorageClassTest1();
		
		object.increaseData();
		object.increaseData();
		object.increaseData();
		object.increaseData();
		object.increaseData();
		object = new StorageClassTest1();
		object.increaseData();
		object.increaseData();
		object.increaseData();
		object.increaseData();
		object.increaseData();
	}
}
