package factoryMethod_Iterator_13_15_1;

import java.util.Enumeration;
import java.util.Vector;

public class EnnemurationDemo {
public static void main(String[] args) {
	Vector<Integer> al = new Vector<>();

	for (int i = 10; i <= 100; i = i + 6) {
		al.add(i);
	}
	// here only two methods us for legacy classes vector and stack
	Enumeration<Integer> en = al.elements();
	while(en.hasMoreElements()) {
	System.out.println(	en.nextElement());
	}
}
}
