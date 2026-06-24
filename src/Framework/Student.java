package Framework;

import java.util.*;

public class Student {

	public static void main(String[] args) {
		TreesetStudent s1 = new TreesetStudent(101,"Anniyan",72);
		TreesetStudent s2 = new TreesetStudent(102,"Ambi",72);
		TreesetStudent s3 = new TreesetStudent(103,"Remo",72);
		TreesetStudent s4 = new TreesetStudent(104,"Chettan",72);
		TreesetStudent s5 = new TreesetStudent(105,"A",72);
		
		TreeSet<TreesetStudent> t = new TreeSet<TreesetStudent>();
		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);
		t.add(s5);
		
		for(TreesetStudent a : t) {
			System.out.println(a);
		}
	}
}
