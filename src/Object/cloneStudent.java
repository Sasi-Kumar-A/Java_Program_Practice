package Object;

public class cloneStudent {

	public static void main(String[] args) throws CloneNotSupportedException{
		Student s1 = new Student(101,"Rama");
		Student s2 = (Student)s1.clone();
		Student s3 = (Student)s1.clone();
		
		s1.details();
		s2.details();
		s3.details();
		
		

	}

}
