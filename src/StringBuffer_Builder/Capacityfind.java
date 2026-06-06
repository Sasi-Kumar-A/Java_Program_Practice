package StringBuffer_Builder;

public class Capacityfind {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();//StringBuffer Obj created means 16 memory allocated
		StringBuffer sb2 = new StringBuffer("Hello");// If we pass the parameterized constructor that will perform as like given element + 16 size
		System.out.println(sb2.capacity());
		System.out.println(sb.capacity());//16
		sb.append("12345678901234567");// Once we add more than 16 it will create new Array
		//(c.c)*2 +2
		System.out.println(sb.capacity());//34
		System.out.println(sb.length());
	}
}
