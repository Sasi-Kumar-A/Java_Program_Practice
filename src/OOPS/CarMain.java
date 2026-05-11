package OOPS;

public class CarMain {
	public static void main(String args[]) {
		Car c1 = new Car("Verna","Black",1200000);
		Car c2 = new Car("Creta","White",1500000);
		
		c1.detailsofCar();
		c1.e1.detailofEngine();
		c2.detailsofCar();
		c2.e1.detailofEngine();
		
	}
}
