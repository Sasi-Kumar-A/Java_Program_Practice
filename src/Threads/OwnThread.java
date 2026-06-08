package Threads;

public class OwnThread extends Thread{

	public void run() {
		System.out.println("heyyy "+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		OwnThread m1 = new OwnThread();
		OwnThread m2 = new OwnThread();
		OwnThread m3 = new OwnThread();
		//to change or assign the name of the for the thread
		m1.setName("Sasi");
		m1.start();
		m2.start();
		m3.start();
	}
}
