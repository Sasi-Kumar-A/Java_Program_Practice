package OOPS;

public class Marker extends Object {
	public String color = "Black";
	double price = 10;
	
	@Override
	public String toString() {
        return getClass().getName() + "@#@" + Integer.toHexString(hashCode());
    }
	
	public static void main(String args[]) {
		Marker m = new Marker();
		System.out.println(m);
		System.out.println(m.toString());
	}
}
