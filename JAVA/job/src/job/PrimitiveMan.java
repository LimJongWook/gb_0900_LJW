package job;

//	- ���� : ���ϴ� ������ Ŭ������ ���� (������ - ������ - ����� ��� - �ܰ��� )
//	- �ݵ�� ���� â���� �Ǿ�� �Ѵ�.
// 	- Ȯ���� �߰��Ѵ�.
// 	- ������ �ʿ��� �ʵ�� �󸶵��� �߰� ������ �����ϴ�.
//		Ex) ����, Ƽ�� �±�, ���� 5ȸ ���� �� ���� �� ��
public class PrimitiveMan {
	String identity;
	String gender;
	int count;
	int restCount;
	boolean check;
	
	{
		restCount = 10;
	}
	
	public PrimitiveMan() {}
	
//  ������ �϶��� ���
	void faming() {
		check = true;
	}
	
	
	void rest() {
		check = true;
	}
	
	boolean count(int count) {
		return count >= 5;
	}
	
	
}
