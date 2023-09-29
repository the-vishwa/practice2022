package vishwa_assign;

import java.util.Iterator;
import java.util.LinkedList;

public class CCC {

	LinkedList<Integer> list;

	public CCC() {
		list = new LinkedList<>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(100);
		list.add(700);
		list.add(800);
	}

	// check 700 frequency /count of 700 how much time 700 is there
	Integer isObjectExit(Integer obj) {
		int cnt = 0;
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			Integer i = itr.next();
			if (i.equals(obj)) {
				cnt++;
			}
		}

		return cnt;
	}

	public static void main(String[] args) {
		CCC c = new CCC();
		Integer cc = c.isObjectExit(100);
		System.out.println(cc);

	}
}
