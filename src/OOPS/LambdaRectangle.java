package OOPS;

interface rectangle{
	int getrectangle(int a, int b);
}

public class LambdaRectangle {
	public static void main(String[] args) {
		rectangle r = (int x , int y)-> x*y;
		System.out.println(r.getrectangle(10, 2));
	}
	
}
