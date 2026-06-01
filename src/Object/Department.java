package Object;

public class Department {
	String name;

	public Department(String name) {
		super();
		this.name = name;
//		System.out.println(name+" is Created");
	}
	
	public void finalize() {
		System.out.println(name+"is destroyed");
	}
	public static void main(String[] args)throws Exception {
		Department d1 = new Department("CSE");
		Department d2 = new Department("IT");
		Department d3 = new Department("AIDS");
		
		d2 =null;
		System.gc();
		Thread.sleep(2000);
	}
}
