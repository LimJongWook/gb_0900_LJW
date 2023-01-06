package castingTest;

public class Animation extends Video{
	@Override
	void printVideo() {
		super.printVideo();
		System.out.println("자막 지원");
	}
}
