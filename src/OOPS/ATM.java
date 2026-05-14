package OOPS;

public class ATM {
	String card_holder;
	String exp;
	private int pin;
	
	public ATM(String card_holder,String exp, int pin) {
		//L.I
		this.card_holder = card_holder;
		this.exp = exp;
		this.pin = pin;
	}
	
	public int getPin() {
		return pin;
	}
	
	public void setPin(int pin) {
		this.pin = pin;
	}
}
