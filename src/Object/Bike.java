// Equals()
package Object;

public class Bike {
	String name;
	double price;
	
	Bike(String name,double price){
		super();
		//L.I
		this.name = name;
		this.price = price;
	}
	@Override
	
	public String toString() {
		return name+":"+price;
	}
	
	public static void main(String[] args) {
		Bike r1 = new Bike("MT-15",22000);
		Bike r2 = new Bike("MT-15",22000);
		
		boolean data = r1.equals(r2);
		System.out.println(r1+"\n"+r2);
		System.out.println(data);
	}

}
