package com.imp.www;

public class Controller {

	public static void main(String[] args) {
		
		// case 1]
		Parent p=new Parent();
		p.m1();
		p.m2();
		p.getClass();
		System.out.println("--------------------------");
		
		// case 2]
		Child c= new Child();
		c.m1();
		c.m2();
		c.m3();
		System.out.println("--------------------------");
		
//		// case 3]
		
		Parent p1=new Child();
		p1.m1(); // child
		p1.m2(); // parent
	//	p1.m3(); 
		
		// case 4]
		
	
//		//Child c1= new Parent();
	}
}
