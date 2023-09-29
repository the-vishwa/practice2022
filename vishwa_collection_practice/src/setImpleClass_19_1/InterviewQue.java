package setImpleClass_19_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class InterviewQue {

	public static void main(String[] args) {
//		 without readymade or customlogic.? pending

		List<Integer> list = new ArrayList();

		list.add(10);
		list.add(50);
		list.add(50);
		list.add(30);
		list.add(10);
		list.add(100);
		list.add(5);

		List<Integer> al = new ArrayList();
		for (int i = 0; i < list.size(); i++) {
			if (!al.contains(list.get(i))) {
				al.add(list.get(i));
			}
		}
		System.out.println(al);

//		 remove Duplicate with the help of hashset
		HashSet<Integer> set = new HashSet<>(list);
		System.out.println(set);


	}
}
