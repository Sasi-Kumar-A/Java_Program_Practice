package OOPS;

public class Product {
	int pid;
	String pname;
	double price;
	
	Product(int pid, String pname,double price){
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	
	public void details() {
		System.out.println("Produce Id: "+pid+": Product Name: "+pname+":Price:"+price);
	}

	public static void filtermorethan2k(Product...products ) {
		for(Product i : products) {
			if(i.price > 2000) {
				i.details();
			}
		}
	}
	
//	public static void sortLowtoHigh(Product...products ) {
//		for(Product a : products) {
//			for(int i=0;i<products.length-1;i++) {
//				for(int j=1;j<products.length-1;j++) {
//					if(products[i].price > products[j].price) {
//						int temp = products[i];
//						
//					}
//				}
//			}
//		}
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product(101,"Shirt",3000);
		Product p2 = new Product(101,"Jeans",4000);
		Product p3 = new Product(101,"Sun Glass",700);
		Product p4 = new Product(101,"Shoes",300);
		
		Product.filtermorethan2k(p1,p2,p3,p4);
	}

}
