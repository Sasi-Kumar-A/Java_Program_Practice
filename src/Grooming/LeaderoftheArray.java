package Grooming;

public class LeaderoftheArray {

	public static void main(String[] args) {
		int arr[] = {16,17,4,3,5,2};
		String s = "";
		int max = arr[arr.length-1];
		s = " "+s + max;
		
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i] > max) {
				max = arr[i];
				s = " "+max+s;
			}
		}
		System.out.println(s);
	}
}
