package File_handling;
import java.io.*;
public class FileInputSt {

	public static void main(String[] args)throws Exception {
		FileInputStream fin = new FileInputStream("D://James.txt");
		byte data[] = fin.readAllBytes();
		for(byte i:data) {
			System.out.print((char)i);
		}

	}

}
