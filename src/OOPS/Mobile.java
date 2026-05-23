package OOPS;

class SIM extends Object
{
	String name;
	double price;
	static String  owner = "Sasi";
	
	SIM(String name, double price){
		this.name = name;
		this.price = price;
	}
}

public class Mobile extends SIM{
	String Operator;
	Mobile(String name, double price ,  String Operator){
		super(name, price);
		this.Operator = Operator;
	}
	
	public void display() {
		System.out.println("Phone Name: "+name);
		System.out.println("Mobile Price: "+price);
		System.out.println("Mobile Price: "+owner);
		System.out.println("Mobile Operator : "+Operator);
	}
	public static void main(String args[]) {
		Mobile s1 = new Mobile("Samsung",45000,"JIO");
		s1.display();
	}
}



