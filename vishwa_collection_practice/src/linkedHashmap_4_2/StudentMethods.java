package linkedHashmap_4_2;

import java.util.HashMap;
import java.util.Set;

public class StudentMethods {

	private HashMap<Integer, Student> map;

	public StudentMethods() {
		this.map = new HashMap<>();

	}

	void addMethod(Integer i, Student s) {
		map.put(i, s);

	}

	void getMethod(Integer i) {
		System.out.println(map.get(i));
	}

	void update(Integer i, Student s) {
		map.put(i, s);
	}

	void delete(Integer i) {
		System.out.println(map.remove(i));
	}

	void printall() {
		Set<Integer> set = map.keySet();
		for (Integer e : set) {
			Student s = map.get(e);
			System.out.println(e + "=>" + s);

		}
	}

}
//void putMethod() {
//	map.put(24, new Student(1, "Rana"));
//	map.put(23, new Student(2, "nirmal"));
//	map.put(27, new Student(3, "nirmal"));
//	map.put(26, new Student(4, "kuldip"));
//	map.put(24, new Student(1, "vishwa"));
//	Set<Integer> e = map.keySet();
//	Iterator<Integer> itr = e.iterator();
//	while (itr.hasNext()) {
//		Integer ee = itr.next();
//		Student in = map.get(ee);
//		System.out.println(ee + "=" + in);
//
//	}
//
//}
//
//void getMethod() {
//	Student s = map.get(24);
//	System.out.println(s);
//}
//
//void keySep() {
//	Set<Integer> i = map.keySet();
//	System.out.println(i);
//
//}
//
//void valueSep() {
//	Collection<Student> ss = map.values();
//	for (Student student : ss) {
//		System.out.println(student);
//	}
//}
//
//void deleteMethod() {
//	Student o = map.remove(27);
//	System.out.println(o);
//}
//}