package SET_Impl_classess;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SetPro_Intvew {
	public static void main(String[] args)  {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(10);
		list.add(30);
		list.add(40);
		list.add(50);
		
		List<Integer> al = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (!al.contains(list.get(i))) {
				al.add(list.get(i));
			}
		}
		System.out.println(al);
		
//		System.out.println("_________________");
//		System.out.println(list);// insert order follow
//		System.out.println(list.size());
//
//		// how to remove duplicate objects using hasgSet..?
//		HashSet<Integer> h = new HashSet<>(list);
//		System.out.println(h.size());
//		System.out.println(h);

	}
}
