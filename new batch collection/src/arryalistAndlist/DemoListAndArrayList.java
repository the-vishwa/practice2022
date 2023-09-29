package arryalistAndlist;

import java.util.ArrayList;
import java.util.List;

public class DemoListAndArrayList {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list.indexOf(10));
//		System.out.println(list.remove(10));//exception
		list.add(100);
		System.out.println(list.remove(2));

		Integer i = 40;
		System.out.println(list.remove(i));
		
//		System.out.println(list.add(10));
//		System.out.println(list.size());
//		System.out.println("before remove calling=" + list.isEmpty());
//
//		System.out.println(list.removeAll(list));
//
//		System.out.println("after remove calling=" + list.isEmpty());
		System.out.println(list);
	}

}
