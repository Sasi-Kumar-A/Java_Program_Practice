package Arrays;

public class finddivtablebyrecur {
	public static void table(int n , int i, int k) {
		if(k>i) {
			return;
		}
		
		System.out.println(n*k+"%"+n+"="+k);
		table(n,i,k+1);
	}
	public static void main(String[] args) {
		int n = 2;
		int i=5,k=0;
		table(n,i,k);
	}
}
