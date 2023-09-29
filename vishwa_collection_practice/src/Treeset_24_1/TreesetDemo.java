package Treeset_24_1;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class TreesetDemo {
public static void main(String[] args) {
	
	TreeSet<Integer> tree = new TreeSet<>();
	tree.add(36);// sorting tech
	tree.add(10);
	tree.add(23);
	tree.add(23);
	//tree.add(null);   not allow
	
	System.out.println(tree);
	// hetro not allow
	TreeSet tree1 = new TreeSet<>();
//	tree1.add("obj");
//	tree1.add("obj1");
	tree1.add(10);
	tree1.add(40);
	tree1.add(60);
	
	System.out.println(tree1);
	
	// hetro allow
	List list = new ArrayList();
	list.add("vi");
	list.add("vis");
	list.add(20);
	list.add(90);
	list.add(200);
	
	System.out.println(list);
}
}
