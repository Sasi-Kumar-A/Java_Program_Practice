package File_handling;
import java.io.*;
public class readchartochar {
	public static void main(String[] args)throws Exception {
		FileReader fr = new FileReader("D://sazzzz.txt");
		int asci = fr.read();
		while(asci != -1) {
			System.out.println((char)asci);
			asci = fr.read();
		}
		fr.close();
	}
	 
}
