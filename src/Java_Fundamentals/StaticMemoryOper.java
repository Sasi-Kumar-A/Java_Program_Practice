package Java_Fundamentals;

public class StaticMemoryOper {
	static {
		System.out.println("Hii This is a MultiLine Static Inilizer");
		System.out.println("the value of the x is : "+StaticMemoryOper.x);
	}
	
	static int x = 10;
	public static void display() {
		System.out.println("This is display method ");
	}
	static {
		System.out.println("this is the MLSI2 with the x value of :"+ x);
	}
	
	public void Show() {
		System.out.println(" This is Non Static Method ");
	}
	public static void main(String args[]) {
		System.out.println("Hii this is the main method ");
		display();
		System.out.println("this is the end of main");
		StaticMemoryOper sc = new StaticMemoryOper();
		sc.Show();
	}
	
	static boolean main = true;
	static {
		System.out.println("Lets do the best ");
		System.out.println(main);
	}
}
