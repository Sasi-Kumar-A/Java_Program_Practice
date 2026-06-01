package File_handling;
import java.io.*;
import java.util.*;
public class WriteBuffer {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)throws Exception {
		System.out.println("Enter the Path:");
		String path = sc.nextLine();
		FileWriter fw = new FileWriter(path);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("jdhs");
		bw.flush();
		bw.close();
	}
}
