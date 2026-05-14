package OOPS;

public class CM {
	private static CM cm;
	private String name;
	private String date;
	private static String state = "India";
	
	private CM(String name,String date) {
		//L.I
		this.name = name;
		this.date = date;
	}
	
	public static CM getCM(String name,String date) {
		if( cm == null)
			cm = new CM(name,date);
		return  cm;
	}
	
	public String getname() {
		return name;
	}
	public String getdate() {
		return date;
	}
	
	public void getdetails() {
		System.out.println("Name of the Cheif Minister: "+getname());
		System.out.println("Date of the Joining as CM: "+getdate());
		System.out.println("Name of the State is: "+state);
	}
}
