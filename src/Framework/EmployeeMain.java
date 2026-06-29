package Framework;
import java.util.*;
public class EmployeeMain {

	public static void main(String[] args) throws LowSalaryException{
		
		
		Employee e1 = new Employee(101,"Alice", 25532);
		Employee e2 = new Employee(111,"Bob", 19000);
		Employee e3 = new Employee(109,"Charlis", 35000);
		Employee e4 = new Employee(101,"David", 25532);
		Employee e5 = new Employee(101,"Elma", 12532);
		Employee e6 = new Employee(101,"Fathima", 17220);
		Employee e7 = new Employee(101,"Manish", 55532);
		Employee e8 = new Employee(101,"John", 9652);
		Employee e9 = new Employee(101,"Robert", 17000);
		Employee e10 = new Employee(101,"Xever", 29532);
		
		ArrayList<Employee> li = new ArrayList<>();
		li.add(e1);
		li.add(e2);
		li.add(e3);
		li.add(e4);
		li.add(e5);
		li.add(e6);
		li.add(e7);
		li.add(e8);
		li.add(e9);
		li.add(e10);
		
		ArrayList<Employee>  al = new ArrayList<Employee>();
		for(Employee e : li) {
			try {
				if(e.sal < 20000) {
					throw new LowSalaryException("Low Salary");
				}
			}
			catch(LowSalaryException ex)  {
				System.out.println(ex.getMessage());
				al.add(e);
			}
		}
		
		Collections.sort(al);
		
		for(Employee e : al) {
			System.out.println(e);
		}

//		System.out.println(li);
		
	}
}
