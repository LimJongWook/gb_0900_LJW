package castingTest;

public class Film extends Video {

	@Override
	void printVideo() {
		super.printVideo();
		System.out.println("4D");
	}
}
