package File_handling;
import java.io.*;
public class SerializableStud {

	public static void main(String[] args)throws Exception {
		FileOutputStream fout = new FileOutputStream("D://Student.txt");
		ObjectOutputStream ob_out = new ObjectOutputStream(fout);
		ob_out.writeObject(new Student(101,"Sasi",98));
		ob_out.close();
		fout.close();
		System.out.println("Done");
	}

}
