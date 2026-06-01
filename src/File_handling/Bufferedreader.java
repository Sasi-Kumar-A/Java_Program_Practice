package File_handling;
import java.io.*;
public class Bufferedreader {
	public static void main(String[] args)throws Exception {
		FileReader fr = new FileReader("D://sazzzz.txt");
		BufferedReader br = new BufferedReader(fr);
		String read = br.readLine();
		while(read != null) {
			System.out.println(read);
			read=br.readLine();
			
		}
	}
}
