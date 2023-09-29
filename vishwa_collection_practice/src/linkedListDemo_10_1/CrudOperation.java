package linkedListDemo_10_1;

import java.util.Iterator;
import java.util.LinkedList;

public class CrudOperation {
	LinkedList<Integer> list;

	public CrudOperation() {
		this.list = new LinkedList<>();
		list.add(70);
		list.add(50);
		list.add(50);
		list.add(60);
		list.add(80);
		list.add(90);
		// list.add(null);
	}

	Boolean isObjectExist(Integer obj) {
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			Integer ii = itr.next();
			if (ii.equals(obj)) {
				return true;
			}
		}
		return false;
	}

	Integer checkFrequency(Integer obj) {
		int cnt = 0;
		Iterator<Integer> itr = this.list.iterator();//0/1/
		while (itr.hasNext()) {
			System.out.println("-while-");
			Integer iii = itr.next();
			if (iii.equals(obj)) {
				cnt++; // 1 //2
				System.out.println("=if=");
			}
			//while limit
		}
		return cnt;
	}

	void deleteObject(Integer obj) {
		System.out.println(list);
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			Integer iiii = itr.next();//
			if (iiii.equals(obj)) {
				itr.remove();
			}
		}
		System.out.println(list);
	}

	public static void main(String[] args) {
		 CrudOperation c = new CrudOperation();
//		 System.out.println(c.isObjectExist(50));
//		 System.out.println(c.checkFrequency(50));
		 //c.deleteObject(70);

	}
}