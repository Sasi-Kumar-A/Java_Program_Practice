package File_handling;
import java.io.*;
public class FileOutputSt {

	public static void main(String[] args) throws Exception{
		FileOutputStream fout = new FileOutputStream("D://James.txt");
		String data = "Haii this is James to make the data to write  in the file";
		byte data_W[] = data.getBytes();
		fout.write(data_W);
		fout.close();
		System.out.println("Done");
	}

}
