package Treeset_24_1;

import java.util.ArrayList;
import java.util.TreeSet;

public class DemoArryToTree {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList();
		al.add(50);
		al.add(17);
		al.add(10);
		al.add(10);
		al.add(200);

		TreeSet<Integer> tree = new TreeSet<>(al);
		ArrayList<Integer> al1 = new ArrayList(tree);
		//System.out.println(al1);

		TreeSet<String> al12 = new TreeSet<>();
		al12.add("v");
		al12.add("b");
		al12.add("v");
		System.out.println(al12);

	}
}
