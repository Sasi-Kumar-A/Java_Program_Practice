package File_handling;

import java.io.*;
import java.util.*;

public class Write {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)throws Exception {
		System.out.print("Enter the path:");
		FileWriter my_file = new FileWriter(sc.nextLine());
		System.out.println("Enter the Data:");
		String data = sc.nextLine();
		my_file.write(data);
	}
}
