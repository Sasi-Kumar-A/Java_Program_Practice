package OOPS;

class A{
	String name;
	int age;
	long phno;
	
	A(String name,long phno,int age){
		this(name,phno);
		//L.I
		this.age = age;
		System.out.println("This is Initialize the Age: "+age);
	}
	
	A(String name,long phno){
		this("Sasi",19,96658230L);
		//L.I
		this.name = name;
		this.phno = phno;
		System.out.println("In this constructor we are Initializint the Name: "+name+"Phone Number: "+phno);
	}
	
	A(String name,int age, long phno){
		System.out.println("In Name: "+name);
		System.out.println("In Age: "+age);
		System.out.println("In Phone Number: "+phno);
	}
	
	A(){
		this("Sasi",998856235L,20);
		//L.I
		System.out.println("This is the Empty Constructor");
	}
	
	void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(phno);
	}
}
public class ChainingProcess {
	public static void main(String[] args) {
		A a = new A();
		a.display();
	}
}
