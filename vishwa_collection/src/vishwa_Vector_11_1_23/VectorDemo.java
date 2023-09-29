package vishwa_Vector_11_1_23;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("A");
		v.add("B");
		v.add("C");
		v.add("D");
		v.addElement("E");
		v.add(1, "F");
		System.out.println(v);

	}
}
