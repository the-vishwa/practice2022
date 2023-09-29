package LinkdHashMap;

import java.util.Set;
import java.util.Iterator;
import java.util.Collection;
import java.util.HashMap;

public class Student_Crud {
	HashMap<Integer, Student> map;

	public Student_Crud() {
		this.map = new HashMap<>();
	}

	void putMethod() {
		map.put(24, new Student(1, "Rana"));
		map.put(23, new Student(2, "nirmal"));
		map.put(27, new Student(3, "nirmal"));
		map.put(26, new Student(4, "kuldip"));
		map.put(24, new Student(1, "vishwa"));
		Set<Integer> e = map.keySet();
		Iterator<Integer> itr = e.iterator();
		while (itr.hasNext()) {
			Integer ee = itr.next();
			Student in = map.get(ee);
			System.out.println(ee + "=" + in);

		}

	}

	void getMethod() {
		Student s = map.get(24);
		System.out.println(s);
	}

	void keySep() {
		Set<Integer> i = map.keySet();
		System.out.println(i);

	}

	void valueSep() {
		Collection<Student> ss = map.values();
		for (Student student : ss) {
			System.out.println(student);
		}
	}

	void deleteMethod() {
		Student o = map.remove(27);
		System.out.println(o);
	}

	
	
	
	
	
//	void update(Integer key, Student v){
//		Student s= map.put(key, v);
//		System.out.println(s);
//	}

}
