package vishwa_Vector_11_1_23;

import java.util.Vector;

public class Vdemo {
	public static void main(String[] args) {
		Vector<Integer> vt = new Vector<>();
		System.out.println(vt.capacity());
		System.out.println(vt.size());
		System.out.println("-----------");
		for (int i = 1; i <= 10; i=i+10) {
			vt.add(i);
		}
		System.out.println(vt.capacity());
	}
}
