package OOPS;

public class Fruits {
	String name;
	String taste;
	static String origin = "India";
	
	Fruits(String fname,String ftaste){
		name = fname;
		taste = ftaste;
	}
	public void details() {
		System.out.println("Name of the Fruit is :"+name);
		System.out.println("Taste of the Fruit is :"+taste);
		System.out.println("Origin of the Fruit is :"+origin);
	}
}
