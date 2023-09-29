package collectionAPI_9_1;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArryAndLINKDLIst {
public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList();
	al.add(10);
	al.add(20);
	al.add(30);
	
	al.add(1,40);

	System.out.println(al);
	System.out.println("---");
	LinkedList<Integer> ll =  new LinkedList<>();
	ll.add(10);//2
	ll.add(20);//3
	ll.add(30);//3
	ll.addLast(50);
	ll.add(1,40);//1
	System.out.println(ll);// 78/40/10/20/30
	
	
	
	
}
}
