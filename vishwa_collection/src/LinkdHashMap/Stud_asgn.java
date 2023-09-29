package LinkdHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Stud_asgn {
	HashMap<Integer, Student> map;

	public Stud_asgn() {
		this.map = new HashMap<>();
		map.put(12, new Student(1, "Rana"));// remove duplicate
		map.put(13, new Student(2, "nirmal"));// nirmal
		map.put(14, new Student(3, "nirmal"));//deleted
		map.put(14, new Student(5, "rwl_class"));//deleted
		map.put(15, new Student(4, "kuldip"));//deleted
		map.put(12, new Student(1, "vishwa"));//vishwa
		
	}

	Object getMethod(Integer k) {
		Object s = this.map.get(k);
		return s;
	}

	void deleteMethod(Integer key) {
		Object o = this.map.remove(key);
		System.out.println(o);
	}

	void printAll() { 
		Set<Integer> set = this.map.keySet();
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
			Integer str = itr.next();
			Student in = map.get(str);
			System.out.println(str + "=" + in);

		}
	}

//		Set<Integer> s = map.keySet();
//		System.out.println(s);
//		System.out.println("-------");
//
//		Collection<Student> ss = map.values();
//		for (Student student : ss) {
//			System.out.println(student);
//		}
//		System.out.println("-------");
//
//		Set<Integer> set = map.keySet();
//		Iterator<Integer> itr = set.iterator();
//		while (itr.hasNext()) {
//			Integer str = itr.next();
//			Student in = map.get(str);
//			System.out.println(str + "=" + in);
//
//		}

}
