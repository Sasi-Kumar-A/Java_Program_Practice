package OOPS;

public class Students {
	String name;
	int id;
	String Dept;
	static String Clg = "Hindusthan";
	
	Students(String name , int id, String Dept){
		//L.I
		this.name = name;
		this.id = id;
		this.Dept = Dept;
	}
	public void details() {
		System.out.println("----------------------------");
		System.out.println("Name of the Student "+name);
		System.out.println("Id of the Student "+id);
		System.out.println("Dept of the Student "+Dept);
		System.out.println("Clg of the Student "+Clg);
	}
}
