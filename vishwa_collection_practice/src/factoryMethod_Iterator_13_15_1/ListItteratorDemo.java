package factoryMethod_Iterator_13_15_1;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListItteratorDemo {
public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<>();
	
	for(int i =10; i<=100;i=i+6) {
		al.add(i);
	}
	ListIterator<Integer> listitr = al.listIterator();
	while(listitr.hasNext()) {
		Integer i=listitr.next();
		System.out.println(i);
	}
	System.out.println("------------");
	while(listitr.hasPrevious()) {
		Integer i=listitr.previous();
		System.out.println(i);
	}
	System.out.println("-------------");// OR 
	while(listitr.hasNext()) {
		System.out.println(listitr.next());
	}
	System.out.println("-------");
	while(listitr.hasPrevious()) {
		System.out.println(listitr.previous());
	}
	
}
}
