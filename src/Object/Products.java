package Object;

import java.util.Objects;

public class Products {
	String pname;
	int pid;
	double price;
	
	public Products(String pname, int pid, double price) {
		super();
		this.pname = pname;
		this.pid = pid;
		this.price = price;
	}
	
	public String toString() {
		return "Name:"+pname+"-Product Id:"+pid+"Product Price"+price;
	}
	
	public boolean equals(Object o) {
		Products ref1 = (Products)o;
		return pname.equals(this.pname) && pid == this.pid && price == this.price;
	}
	
	public int hashCode() {
		return Objects.hash(pname,pid,price);
	}
	public static void main(String[] args) {
		Products p1 = new Products("Pen",101,10);
		Products p2 = new Products("Scale",102,10);
		Products p3 = new Products("Pen",101,10);
		
		System.out.println("Product 1 & 3 is equal are not: "+ p1.equals(p3));
		System.out.println(p1+ "\n"+p2+"\n"+p3);
		System.out.println(p1.hashCode());
	}

}
