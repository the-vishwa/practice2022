package collectionAPI_9_1;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayList_9_1 {
	public static void main(String[] args) {

		ArrayList al = new ArrayList();// 1 zero args construct

		for (int i = 1; i <= 5; i++) {
			al.add(i);
		}
		System.out.println(al.size());

		// 2 construct
		ArrayList<Integer> al1 = new ArrayList(10);

		// 3 construct
		LinkedList<Integer> ll = new LinkedList<>();
		ArrayList<Integer> al2 = new ArrayList(ll);// (collection c)
// 
	}
}
