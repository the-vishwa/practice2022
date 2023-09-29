package linkedListDemo_10_1;

import java.util.LinkedList;

public class Crud_oprtionBy_sir {
	private LinkedList<Integer> list;

	public Crud_oprtionBy_sir() {
		this.list = new LinkedList<>();
		list.add(70);
		list.add(50);
		list.add(50);
		list.add(60);
		list.add(80);
		list.add(90);
	}

	Boolean objectExist(Integer obj) {
		if (this.list.contains(obj)) {
			return true;// by me
		}
		return false;
	}

	Boolean objectEExist(Integer obj) {
		boolean b = this.list.contains(obj);
		return b;
	}

	void insertObject(Integer obj) {
		this.list.add(obj);
		System.out.println(list);// by me
	}

	Boolean insertNewObject(Integer obj) {
		boolean b = this.list.add(obj);
		System.out.println(list);
		return b;
	}

	Integer checkFrequency(Integer obj) {
		int cnt = 0;
		for (Integer i : list) {
			if (i.equals(obj)) {
				cnt++;
			}
		}
		return cnt;
	}

	Boolean removeObject(Integer obj) {
		if (this.list.remove(obj)) {
			return true;// by me
		}
		return false;
	}

	Boolean removeObbject(Integer obj) {
		return this.list.remove(obj);
	}

	// replace method pending

	public static void main(String[] args) {
		Crud_oprtionBy_sir cd = new Crud_oprtionBy_sir();
		System.out.println(cd.objectExist(90));
		System.out.println(cd.objectEExist(100));
		cd.insertObject(1000);
		System.out.println(cd.insertNewObject(10000));
		System.out.println(cd.checkFrequency(50));
		System.out.println(cd.removeObject(70));
		System.out.println(cd.removeObbject(90));

	}

}
