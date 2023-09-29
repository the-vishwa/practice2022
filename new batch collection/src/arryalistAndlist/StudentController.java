package arryalistAndlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentController {

	public static int getHighest(List<Student> list) {
		int index = -1;
		Double prctg = 0.0;
		for (Student s : list) {
			if (s.getPercentge() > prctg) {
				index = list.indexOf(s);
				prctg = s.getPercentge();

			}

		}

		return index;
	}
	public static void getStudent(List<Student> list) {
		Double prctg = 0.0;
		Student b  = null;
		for (Student s : list) {
			if (s.getPercentge() > prctg) {
				prctg = s.getPercentge();
				b=s;
			}
			
		}
		System.out.println(b);
		
	}

	public static Student getPercent(List<Student> list) {
		Double prctg = 0.0;
		Student s = null;
		for (int i = 0; i < list.size(); i++) {
			s = list.get(i);
			if (s.getPercentge() > prctg) {
				prctg = s.getPercentge();

			}

		}
		return s;

	}

	public static void iterartoMethod(List<Student> list) {

		Iterator<Student> itr = list.iterator();
		Double prctg = 0.0;
		Student v = null;
		while (itr.hasNext()) {
			Student s = itr.next();
			if (s.getPercentge() > prctg) {
				prctg = s.getPercentge();
				v=s;
			}
		}
		System.out.println(v);

	}

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();
		list.add(new Student(12, "vishwa", 60.50));
		list.add(new Student(13, "nirmal", 70.50));
		list.add(new Student(24, "piyush", 75.50));
		list.add(new Student(15, "aakash", 80.50));
//		System.out.println(getPercent(list));

//		int ind = getHighest(list);
//		if (ind > -1) {
//			System.out.println(list.get(ind));
//		} else {
//			System.out.println("the object is not found");
//		}

		getStudent(list);
//		iterartoMethod(list);
//		Student s = iterartoMethod(list);
//		if (s.getPercentge() > -1) {
//			System.out.println(s);
//		}

	}
}
