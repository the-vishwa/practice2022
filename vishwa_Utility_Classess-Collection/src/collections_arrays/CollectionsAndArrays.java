package collections_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class CollectionsAndArrays {
	public static void main(String[] args)  {
		ArrayList<String> al = new ArrayList<>();
		al.add("file1");
		al.add("file2");
		al.add("file3");
		al.add("file4");
		// way to secure ArraylList

		// 1]
		Vector<String> v = new Vector<>(al);

		// 2] best way
//	ArrayList<String> AL = (ArrayList<String>) Collections.synchronizedList(al);
		// type mismatch: cannot convert from List<String> to ArrayList<String>

		// or
		List<String> list = Collections.synchronizedList(al);
			System.out.println(list);
			
		int[] data = { 2, 4, 6, 8, 9, 1, 3, 5, 7 };
		for (int i : data) {
			System.out.println(i);
		}
		System.out.println("______");
		Arrays.sort(data);
		for (int i : data) {
			System.out.println(i);
		}
	}
}
