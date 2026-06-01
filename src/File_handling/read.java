package File_handling;

import java.io.File;

public class read {
	public static void main(String[] args) throws Exception {
		File my_file = new File("E://sazzzz.txt");
		my_file.createNewFile();
		try {
			System.out.println("Path is Invalid");
		}catch (Exception e) {
			System.out.println("Done");
		}
	}
}
