
package vishwa_assign;

import java.util.Iterator;
import java.util.LinkedList;

public class DDD {

	LinkedList<Integer> list;//=new LinkedList<>();

	public DDD() {
		list = new LinkedList<>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(100);
		list.add(700);
		list.add(700);
		list.add(800);
	}

	// delete 300
	public void ObjectRemove(Integer obj) {
		System.out.println(list);
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			Integer i = itr.next();
			if (i.equals(obj)) {
				itr.remove();
			}
		}
		System.out.println(list);
	}

	public static void main(String[] args) {
		DDD c = new DDD();
		c.ObjectRemove(800);

	}

}
