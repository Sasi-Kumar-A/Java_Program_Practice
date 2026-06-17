package Threads;

public class LambdaconsCall {
	
	public static void main(String[] args) {
		//Using Lambda instead of creating a Runnable class
		Thread t1 = new Thread(()->{
			for(int i=1;i<=3;i++)
				System.out.println("Lambda Thread: "+i);
		});
		
		t1.start();
		System.out.println("Main Thread done");
	}
}
