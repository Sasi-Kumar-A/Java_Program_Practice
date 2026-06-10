package Threads;

class Person extends Thread{
	@Override
	 public void run() {
		for(int i=10;i>=1;i--) {
			System.out.println(Thread.currentThread().getName()+":"+i);
			
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
		}
		
	}
}
public class WithoutJoin {

	public static void main(String[] args)throws Exception {
		Person t0 = new Person();
		Person t1 = new Person();
		
		t0.start();
		t0.join();
		t1.start();
		
	
		t1.join();
		
		for(int i=1;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
			Thread.sleep(2000);
		}
	}
}
