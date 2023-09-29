package vishwa_Vector_11_1_23;

import java.util.LinkedList;
import java.util.Vector;
// 1] constructor
public class VectorDM {
	public static void main(String[] args) {
		Vector<Integer> vt = new Vector<>();
		System.out.println(vt.capacity());
		System.out.println(vt.size());
		System.out.println("-----------");
		for (int i = 10; i <= 100; i=i+10) {
			vt.add(i);
		}
		System.out.println(vt.capacity());
		System.out.println(vt.size());
		System.out.println("-----------");
		vt.add(110);
		System.out.println(vt.capacity());
		System.out.println(vt.size());
		System.out.println("-----------");
		vt.add(110);
		System.out.println(vt.capacity());
		System.out.println(vt.size());
		System.out.println("-----------");
		
// 2] constructor
		Vector<Integer> vtt = new Vector<>(100);
		System.out.println(vtt.capacity());
		System.out.println(vtt.size());
		System.out.println("-----------");
		for (int i = 1; i <= 101; i++) {
			vtt.add(i);
		}
		System.out.println(vtt.capacity());
		System.out.println(vtt.size());
		System.out.println("---------------");
		
		Vector<Integer> vtt1 = new Vector<>(100,2);
		for (int i = 1; i <= 101; i++) {
			vtt1.add(i);
		}
		System.out.println(vtt1.capacity());
		System.out.println(vtt1.size());
		
		
		// 2] constructor collection
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(101); ll.add(200);
		Vector<Integer> v1 = new Vector<>(ll);
		
		
	}
}
