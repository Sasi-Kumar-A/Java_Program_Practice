package Stream;

import java.util.*;

public class SortingEmpBySalDesc {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(12, "sasi", 15000, "developer");
		
		Employee e2 = new Employee(38,"Abi",30000,"testing");
		
		Employee e3 = new Employee(23,"Santhosh",23001,"Web");
		
		Employee e4 = new Employee(29,"Sam",10000,"Actor");
		
		List<Employee> li = Arrays.asList(e1,e2,e3,e4);
		
		li.stream()
		.sorted((a,b) -> b.getSal().compareTo(a.getSal()))
		.limit(3)
		.forEach(System.out::println);
		
		
	}

}
