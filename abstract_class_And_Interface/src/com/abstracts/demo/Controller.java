package com.abstracts.demo;


public class Controller {

	public static void main(String[] args) {
		
		// case 1
		//Parent p= new Parent();
		
		// case 2
		Child c = new Child();
		c.m1(); // I am m1 method of Child class
		c.m2(); //I am m2 method of Child class
		c.m3(); // I am m3 method of Parent class
		
		Parent p= new Child();

		p.m1(); 
		p.m2();
		p.m3();
		
		
        caller(p);

		p.m1(); 
		p.m2();
		p.m3();
		p.m1();
		
		caller(p);

		
	}
	
	static void caller(Parent p) {
		p.m1(); 
	    p.m2();
		p.m3();
	}
	
	
	
	
}
