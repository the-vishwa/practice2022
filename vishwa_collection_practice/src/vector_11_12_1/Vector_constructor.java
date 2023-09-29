package vector_11_12_1;

import java.util.Vector;

public class Vector_constructor {
public static void main(String[] args) {
	// 1 constructor // new capacity = old*2
	Vector<Integer> v = new Vector<>();
	System.out.println(v.size());
	System.out.println(v.capacity()); //10
	
	System.out.println("--------------------");
	for(int i=10; i<=100; i=i+10) {
		v.add(i);
	}
	System.out.println(v.size());
	System.out.println(v.capacity());
	
	System.out.println("-----------------------");
	for(int i=10; i<=110; i=i+10) {
		v.add(i); 
	}
	// 10ml 10// 1ml 10ml cap
	System.out.println(v.size()); //11
	System.out.println(v.capacity());// 20
	
	System.out.println("-------------------");
	//1
	Vector<Integer> v1 = new Vector<>();
	v1.add(12);
	v1.add(12);
	v1.add(12);
	v1.add(12);
	v1.add(12);
	v1.add(12);
	v1.add(12);
	v1.add(12);
	v1.add(12);
	v1.add(12);
	v1.add(12);
	System.out.println(v1.size());
	System.out.println(v1.capacity());
	
	//2 constructor
	System.out.println("----------------------");
	Vector<Integer> v12 = new Vector<>(10,2); // capacity 2 ne vadhvli/ 10 chi 12 zali
	v12.add(12);
	v12.add(12);
	v12.add(12);
	v12.add(12);
	v12.add(12);
	v12.add(12);
	v12.add(12);
	v12.add(12);
	v12.add(12);
	v12.add(12);
	v12.add(12);
	System.out.println(v12.size());
	System.out.println(v12.capacity());
	
}
}
