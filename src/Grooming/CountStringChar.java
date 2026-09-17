package Grooming;

public class CountStringChar {

	public static void main(String[] args) {
		String s1 = "aaabbcccdd";
		String s = "";
		
		char arr[] = s1.toCharArray();
		for(int i=0;i<arr.length;i++) {
			int count = 1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					count++;
					arr[j] = '0';
				}
			}
			if(arr[i] != '0') {
				s = s+arr[i]+count;
			}
		}
		System.out.println(s);
	}
}
