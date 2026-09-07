package Framework;
import java.util.*;
public class AddallandRemoveall {

	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);
		li.add(6);
		
		ArrayList<Integer> li1 = new ArrayList<>();
		li1.add(6);
		li1.add(7);
		li1.add(8);
		li1.add(9);
		li1.add(10);
		
		System.out.println(li);
		System.out.println(li1);
		
		li.addAll(li1);
		System.out.println(li);
		
		li.removeAll(li1);
		System.out.println(li);
		System.out.println(li.containsAll(li1));
		li.retainAll(li1);
//		li.containsAll(li1);
		
		System.out.println(li);
		System.out.println(li1);
		
	}
}
