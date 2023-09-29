package remove.duplicate.elements;

import java.util.ArrayList;
import java.util.List;

public class PrintListUsingArray {

	public static void main(String[] args) {

		

		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(10);
		list.add(10);
		list.add(10);
		list.add(10);
		list.add(10);

		Object[] arr1 = list.toArray();
		for (int i = 0; i < arr1.length; i++) {
			Integer j = (Integer) arr1[i];
			System.out.println(j);

		}

	}
}
