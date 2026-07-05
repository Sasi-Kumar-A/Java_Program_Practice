package Threads;

class ThreadA extends Thread{
	public void run() {
		for(int i=1;i<20;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}

class ThreadB extends Thread{
	public void run() {
		for(int i=1;i<20;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i*i);
		}
	}
}
public class Printingsquarenumber {

	public static void main(String[] args) {
		ThreadA t1 = new ThreadA();
		ThreadB t2 = new ThreadB();
		
		t1.start();
		t2.start();
	}
}
