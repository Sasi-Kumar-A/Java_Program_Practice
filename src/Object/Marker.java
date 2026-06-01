//Equals () Override
package Object;

public class Marker extends Object {
	String name;
	double price;
	
	
	public Marker(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public boolean equals(Object o) {
		Marker mr = (Marker) o;
		return this.name.equals(mr.name) && this.price == mr.price;
	}

	public static void main(String[] args) {
		Marker m1 = new Marker("Black",10);
		Marker m2 = new Marker("Black",10);
		
		boolean data = m1.equals(m2);
		System.out.println(data);
	}

}
