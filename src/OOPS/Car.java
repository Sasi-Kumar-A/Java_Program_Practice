package OOPS;

public class Car {
	String name, color;
	double price;
	
	Engine e1 = new Engine("Diesel","400HP","4C");//Due to composition use only one engine
//	Engine e2 = new Engine("Petrol","400HP","6C");
	
	Car(String name,String color,double price){
		//L.I
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	public void detailsofCar() {
		System.out.println("Name of the Car: "+name);
		System.out.println("Color of the Car: "+color);
		System.out.println("Price of the Car: "+price);
	}
}
