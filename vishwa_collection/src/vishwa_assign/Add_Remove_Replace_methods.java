package vishwa_assign;
import java.util.LinkedList;

public class Add_Remove_Replace_methods {
	LinkedList<Integer> list;

	public Add_Remove_Replace_methods() {
		list = new LinkedList<>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		list.add(600);
	}

	Boolean objectAdd(Integer obj) {
		boolean b = list.add(obj);
		System.out.println(list);
		return b;
	}

	Boolean objectExist(Integer obj) {
		boolean bb = list.contains(obj);
		return bb;
	}
	Boolean objectRemove(Integer obj) {
		boolean bbb = list.remove(obj);
		System.out.println(list);
		return bbb;
	}
	//update
	Boolean update(Integer obj) {
		boolean bb = list.add(obj);
		return bb;
	}
//	Boolean objectReplace(Integer obj) {
//		boolean bbb = list.set(0, obj)
//		System.out.println(list);
//		return bbb;
//	}
	
	
	
	public static void main(String[] args) {
		Add_Remove_Replace_methods arr = new Add_Remove_Replace_methods();
		System.out.println(arr.objectAdd(700));
		System.out.println(arr.objectExist(100));
		System.out.println(arr.objectRemove(200));
		System.out.println(arr.update(700));
	}

}
