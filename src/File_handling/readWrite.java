package File_handling;
import java.io.*;
public class readWrite {

	public static void main(String[] args)throws Exception {
		BufferedWriter bw = new BufferedWriter(new FileWriter("D://sazzzz.text"));
		bw.write("Haii This is Sasi");
		bw.newLine();
		bw.write("Hello");
		bw.close();
		System.out.println("Done");
		
		BufferedReader br = new BufferedReader(new FileReader("D:\\sazzzz.txt"));
		String rd = br.readLine();
		while(rd != null) {
			System.out.println(rd);
			rd = br.readLine();
		}
		
	}
}
