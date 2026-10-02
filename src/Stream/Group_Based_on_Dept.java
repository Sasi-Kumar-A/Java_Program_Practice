package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Group_Based_on_Dept {
	public static void main(String[] args) {
Employee e1 = new Employee(12, "sasi", 15000, "developer");
		
		Employee e2 = new Employee(38,"Abi",30000,"testing");
		
		Employee e3 = new Employee(23,"Santhosh",23001,"Web");
		
		Employee e4 = new Employee(29,"Sam",10000,"Web");

		Employee e5 = new Employee(11,"Manu",46000,"testing");
		
		
		
		List<Employee> li = Arrays.asList(e1,e2,e3,e4,e5);
		
		
		Map<String, List<Employee>> map =  li.stream()
											.collect(Collectors.groupingBy(Employee :: getJob));
		
		map.values().stream().forEach(System.out::println);
		
	}
}
