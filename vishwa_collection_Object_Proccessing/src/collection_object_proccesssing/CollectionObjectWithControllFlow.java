package collection_object_proccesssing;

import java.util.ArrayList;
import java.util.List;

public class CollectionObjectWithControllFlow {
	public static void main(String[] args)  {
		List<Integer> list = new ArrayList<>();
		list.add(10);	list.add(20);list.add(30);list.add(40);	list.add(50);
		list.add(60);list.add(70);	list.add(80);list.add(90);	list.add(100);
		
//		for(int i= 0; i<list.size() ;i++) {
//			System.out.println(list.get(i));
//		}
		
		
//		for (Integer integer : list) {
//			System.out.println(integer);
//		}
		
		
//		int i=0;
//		while(i<list.size()) {
//			System.out.println(list.get(i));
//			i++;
//		}
		
//		Assignment using loop print odd and even num.?
		
		int[] i = {1,2,3,4,5,6,7,8,9,10};
		for (int j : i) {
			if(j%2==0) {
			System.out.println(j);
		}
		}
		
//		for (Integer i : list) {
//			if(i%2==0) {
//				System.out.println(i);
//			}
//		}	
		
	}
}
