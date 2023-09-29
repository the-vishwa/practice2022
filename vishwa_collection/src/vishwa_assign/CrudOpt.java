package vishwa_assign;

import java.util.Iterator;
import java.util.LinkedList;

// delete 300
// update 7000 >> replace 701
public class CrudOpt {

	LinkedList<Integer> list;

	public CrudOpt() {
		list = new LinkedList<>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(100);
		list.add(700);
		list.add(800);
	}

	Boolean isObjectExist(Integer obj) {
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			Integer i = itr.next();
			if (i.equals(obj)) {
				return true;
			}

		}

		return false;
	}

	public static void main(String[] args) {
		CrudOpt c = new CrudOpt();
		System.out.println(c.isObjectExist(100));

	}

}
