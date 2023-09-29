package vector_11_12_1;

import java.util.Vector;

public class Demo {
public static void main(String[] args) {
	Vector<String> v = new Vector<>();
	v.add("a");
	v.add("c");// b
	v.add("d");
	v.add("e");
	v.add("f");
	v.addElement("N");
	v.addElement(null);
//	v.remove("d");
//	v.remove(1);
	System.out.println(v.firstElement());
	System.out.println(v.lastElement());
	System.out.println(v);
	v.add(1, "B"); // add object index, but insertion in meddle anywhere is not good
	System.out.println(v);
	
}
}
