package com.abstracts.demo;

abstract public class Parent {
    abstract void m1();
	abstract void m2();
	void m3() {
		System.out.println("I am m3 method of Parent class");
	}
}

class Child extends Parent{
	
	void m1() {
		System.out.println("I am m1 method of Child class");
	}
	
	void m2() {
		System.out.println("I am m2 method of child class");
	}
}
