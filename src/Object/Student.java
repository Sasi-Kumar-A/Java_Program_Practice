package Object;

public class Student implements Cloneable {
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public void details() {
		System.out.println("Name:"+name+"Id:"+id);
		System.out.println("---------------------");
	}
}
