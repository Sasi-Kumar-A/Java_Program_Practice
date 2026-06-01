//hash code()
package Object;

import java.util.Objects;

public class Employee {
	int eid;
	String ename;
	double sal;
	
	public Employee(int eid, String ename, double sal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
	}
	
	//hash code() Override
	@Override
	//Generate the integer based on the states since state are same so same hashCode
	public int hashCode() {
		return Objects.hash(eid,ename,sal);
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(101,"Alice",25000);
		Employee e2 = new Employee(101,"Alice",25000);
	
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());

	}

}
