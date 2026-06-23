package OOPS;


interface Welcome{
	void greeting();
}

class welcomeImp implements Welcome{
	public void greeting() {
		System.out.println("Welcome to the World of java");
	}
}
public class LocalInner {

	public static void main(String[] args) {
		Welcome w = new welcomeImp();
		w.greeting();
		
		class greet implements Welcome{
			public void greeting() {
				System.out.println("This is to Prove the Structure");
			}
		}
		Welcome w1 = new greet();
		w1.greeting();
	}
}
