package OOPS;

public class FruitObjGen {
	public static void main(String args[]) {
		System.out.println("Start");
		Fruits f1 = new Fruits("Orange","Sweet & Mild Sore");
		Fruits f2 = new Fruits("Banana","Sweet");
		Fruits f3 = new Fruits("Apple","Sweet");
		Fruits f4 = new Fruits("Orange","Sweet & Mild Sore");
		Fruits f5 = new Fruits("Orange","Sweet & Mild Sore");
		
		f1.details();
		f2.details();
		f3.details();
		f4.details();
		f5.details();
		
		System.out.println("End");
	}
}
