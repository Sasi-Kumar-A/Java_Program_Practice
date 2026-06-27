package Threads;

class priority extends Thread {
	@Override
	public void run() {
		System.out.println(getName()+"-Priority "+getId());
	}
}
public class Prioritycheck {

	public static void main(String[] args) {
		priority p1 = new priority();
		priority p2 = new priority();
		priority p3 = new priority();
		
		p1.setName("LOW_PRIORITY");
		p2.setName("NORM_PRIORITY");
		p3.setName("MAX_PRIORITY");
		
		p1.setPriority(Thread.MIN_PRIORITY);
		p2.setPriority(Thread.NORM_PRIORITY);
		p3.setPriority(Thread.MAX_PRIORITY);
		
		p1.start();
		p2.start();
		p3.start();
			
	}
}
