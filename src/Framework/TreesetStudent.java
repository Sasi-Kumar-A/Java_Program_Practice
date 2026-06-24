package Framework;

public class TreesetStudent implements Comparable<TreesetStudent>{

	Integer id;
	String name;
	double mark;
	
	public TreesetStudent(int id, String name, double mark) {
		super();
		this.id = id;
		this.name = name;
		this.mark = mark;
	}
	
	@Override
	public String toString() {
		return "Student id=" +id+", Name = "+name+",Mark= "+mark;
	}
	
	@Override
	public int compareTo(TreesetStudent s) {
		return this.id.compareTo(s.id);
	}
	
	
}
