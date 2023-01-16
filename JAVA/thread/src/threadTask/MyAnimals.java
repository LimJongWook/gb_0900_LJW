package threadTask;

public class MyAnimals implements Runnable {
	
	final int COUNT = 10;
	
	@Override
	public void run() {
		for (int i = 0; i < COUNT; i++) {
			System.out.println(Thread.currentThread().getName());
			try {Thread.sleep(500);} catch (InterruptedException e) {;}
		}
	}
	
}
