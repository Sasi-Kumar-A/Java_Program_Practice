package OOPS;

public class User {
	public static void main(String args[]) {
		ATM card1 = new ATM("John","12/12/2029",2543);
		System.out.println("\t\t Card Holder Details...");
		System.out.println("Name of the Holder: "+card1.card_holder);
		System.out.println("Expire date is : "+card1.exp);
		System.out.println("Pin "+card1.getPin());
		System.out.println("\t\t Updating the pin");
		card1.setPin(6853);
		System.out.println("Updated Pin is "+card1.getPin());
	}
}
