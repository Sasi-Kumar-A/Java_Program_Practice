package Java_Fundamentals;


interface  Cat{
	void food();
}
interface Dog {
	void sleep();	
}
class Animal implements Cat, Dog {
	@Override
	public void food() {
		System.out.println("k");
	}
	
	public void sleep() {
		System.out.println("This will sleep");
	}
}

	
