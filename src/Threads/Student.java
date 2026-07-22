package Threads;

class Students extends Thread{

	private String name;
	private Trainer trainer;
	public Students(String name, Trainer trainer) {
		super();
		this.name = name;
		this.trainer = trainer;
	}
	
	@Override
	public void run() {
		trainer.askQuestion(name);
	}
}

class Trainer{
	
	public synchronized void askQuestion(String name) {
		System.out.println("Ask the Question "+name);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Cleared Answer "+name);
	}
}

public class Student{
	
	public static void main(String[] args) {
		Trainer t = new Trainer();
		
		Students s1 = new Students("Ram",t);
		Students s2 = new Students("Alice",t);
		Students s3 = new Students("Bob",t);
		
		s1.start();
		s2.start();
		s3.start();
		
	}
}