package File_handling;
import java.io.*;
public class DeSerializiablestud {

	public static void main(String[] args)throws Exception {
		FileInputStream fin = new FileInputStream("D://Student.txt");
		ObjectInputStream ob_in = new ObjectInputStream(fin);
		Object o = ob_in.readObject();
		ob_in.close();
		fin.close();
		System.out.println(o);

	}

}
