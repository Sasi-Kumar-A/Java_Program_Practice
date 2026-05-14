package OOPS;

class Account {
	private String acc_name;
	private double bal = 0;
	private String dob;
	private long acc_num;
	private int age;
	private long contact;
	
	public String getAccName() {
		return acc_name;
	}
	
	public double getBal() {
		return bal;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAccName(String acc_name) {
		this.acc_name = acc_name;
	}
	
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void Dopsite(double amt) {
		bal +=amt;
	}
	
	public void Withdrawl(double amt) {
		if(bal >= amt) {
			System.out.println("Amount Withdrawl Successfully...");
			bal -=amt;
		}
		else
			System.out.println("Insuffecient Balance...");
	}
	
	
	
}
