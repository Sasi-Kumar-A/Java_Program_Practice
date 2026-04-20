package OOPS;

public class Employee {
	String name;
	String dept;
	double salary;
	static String company = "ABC Com";
	String Attendance;
	
	//Constructor 
	Employee(String name,String dept,double salary,String Attendance){
		// this keyword use to overcome the local variable
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.Attendance = Attendance;
	}
	
	public void details() {
		System.out.println("-------------------------------");
		System.out.println("Name of the Employee "+name);
		System.out.println("Department of the Employee "+dept);
		System.out.println("Salary of the Employee "+salary);
		System.out.println("Company of the Employee "+company);
		System.out.println("Attendance of the Employee "+Attendance);
	}
}
