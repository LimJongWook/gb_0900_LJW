package threadTask;

public class MyZoo {
	public static void main(String[] args) {
		final int COUNT = 10;
		String[] crying = {"港港","具克","澜皋"};
		MyAnimals animal = new MyAnimals();
		Thread[] threads = new Thread[3];
		
		Runnable target = () -> {
			for (int i = 0; i < COUNT; i++) {
				System.out.println(Thread.currentThread().getName());
				try {Thread.sleep(500);} catch (InterruptedException e) {;}
			}
		};
		
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(animal, crying[i]);
		} 
		
		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
			if(i != 0) {
				try {threads[i].join();} catch (InterruptedException e) {;}
			}
		}
		
	}
}
 