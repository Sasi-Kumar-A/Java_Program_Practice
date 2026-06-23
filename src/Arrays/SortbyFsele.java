package Arrays;

import java.util.Arrays;

public class SortbyFsele {
	//Sort the element by the given number as per ascending starting digit of every number
	
	public static void main(String[] args) {
		int[] arr = {3,10,50,25,6,9,123};
		String[] str = new String[arr.length];
		int x = 0;
		for(int i:arr)
		{
			str[x++] = ""+i;
		}
		Arrays.sort(str);
		int y = 0;
		for(String s : str)
			arr[y++] = Integer.parseInt(s);
		
		System.out.println(Arrays.toString(arr));
	
	}
}
