package Stream;

public class Employee {

	
	private int id;
	private String name;
	private Double sal;
	private String job;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Employee(int id, String name, double sal, String job) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.job = job;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", job=" + job + "]";
	}
	
	
	
	
	
}
