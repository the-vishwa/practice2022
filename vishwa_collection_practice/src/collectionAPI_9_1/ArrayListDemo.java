package collectionAPI_9_1;

//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
import java.util.*;

public class ArrayListDemo {
	public static void main(String[] args) {
// 1 2 3 4 6		arrlist
// 1 3 4 6		linkdlist
		Collection c = new ArrayList();
		List list = new ArrayList();
		// collection can only objects not primitive
		// insertion ordr preserv
		// duplicate allow
		// null insertion allow
		ArrayList al = new ArrayList();
		al.add(100);// primitive to Wrapper>>autoboxing
		al.add(100);
		al.add(10);
		al.add(new Integer(20));
		al.add("vishwa");// string
		al.add(null);
		al.add(null);
		al.add('A');
		al.add(2, 80);// list method 2nd index//
		System.out.println(al);
		System.out.println("----------");
		Student t = new Student();// can store hetro obj
		al.add(t);
		System.out.println("10 wala obj="+al.get(2));
		
		boolean b = al.add('B');
		System.out.println("-" + b);
		al.add(new Student());

		Vector v = new Vector<>();
		v.add("vinayak");
		v.add(90);
		v.add(90);
		v.add(null);

		al.addAll(v);// dif btwn add /all, of in vector will be passd in ArraList
		// al.add(v); // special string object created

		// al.remove(1);
		System.out.println(al.size());

		for (Object o : al) {
			System.out.println(o);
		}
	}
}

class Student {
	@Override
	public String toString() {
		return "hi";
	}

}