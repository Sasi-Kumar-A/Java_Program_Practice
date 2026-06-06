package StringBuffer_Builder;

public class CRUDOperation {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println("Original: "+sb);
		sb.append(" This is Sasi");
		System.out.println("Appended: " +sb);
		sb.insert(5, " Sasi ");
		System.out.println("Insert: "+sb);
		sb.delete(0, 4);
		System.out.println("Delete: "+sb);
		sb.reverse();
		System.out.println("Reverse: "+sb);
	}
}
