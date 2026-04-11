package Strings;

public class ReplaceString {
	public static String ReplaceStringIndex(String str ,String s2,String s3) {
		String ans[] = str.split(" ");
		String data="";
		for(int i=0;i<ans.length;i++) {
			if(ans[i].equals(s2))
				ans[i] =s3;
			data += ans[i]+" ";
		}
	return data;	
	}
	public static void main(String ars[]) {
		String str = "I love Biriyani";
		String res = ReplaceStringIndex(str,"love","hate");
		System.out.println(res);
	}
}
