package Threads;

public class deadLock {

	static Object lockA = new Object();
	static Object lockB = new Object();
	
	public static void main(String[] args) {
		Thread t1 = new Thread(()->{
			System.out.println("Thread:A I have got the Lock");
			synchronized (lockA) {
				System.out.println("Thread A Reach lock A");
				try {
					Thread.sleep(100);
					System.out.println("Waiting for the Thread B lock");
				}catch(Exception e) {}
				synchronized (lockB) {
					System.out.println("I got Thread lock B");
				}
			}
			
		});
		
		Thread t2 = new Thread(()->{
			System.out.println("Thread:B I have got the Lock");
			synchronized (lockB) {
				System.out.println("Thread B Reach lock B");
				try {
					Thread.sleep(100);
					System.out.println("Waiting for the Thread B lock");
				}catch(Exception e) {}
				synchronized (lockA) {
					System.out.println("I got Thread lock A");
				}
			}
			
		});
		
		t1.start();
		t2.start();
	}
}
