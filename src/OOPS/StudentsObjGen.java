package OOPS;

public class StudentsObjGen {
	public static void main(String args[]) {
		Students s1 = new Students("Alice",101,"CSC");
		Students s2 = new Students("Charlic",102,"ECE");
		
		s1.details();
		s2.details();
	}
}
