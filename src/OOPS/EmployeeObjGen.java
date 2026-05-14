package OOPS;

public class EmployeeObjGen {
	public static void main(String args[]) {
		Employee e1 = new Employee("ALice","Manager",32000,"Absent");
		Employee e2 = new Employee("Bob","Manager",68853,"Present");
		Employee e3 = new Employee("Charles","Manager",45002,"Absent");
		Employee e4 = new Employee("Francklin","Director",64000,"Present");
		Employee e5 = new Employee("Manisha","Ex",42000,"Present");
		Employee e6 = new Employee("Frances","Manager",38000,"Present");
		Employee e7 = new Employee("Martin","President",50000,"Absent");
		
		Employee Emp[] = {e1,e2,e3,e4,e5,e6,e7};
		for(int i=0;i<Emp.length;i++) {
			if(Emp[i].salary >= 40000) {
				Emp[i].details();
			}
		}
	}
}
