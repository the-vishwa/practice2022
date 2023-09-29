package oops;
class Parent{
	void m1() {
		System.out.println("m1 pf parent");
	}
	void m2() {
		System.out.println("m2 parent");
	}
	
}
public class AA extends Parent{
	void m1() {
		System.out.println("m1 pf child");
	}
	void m2() {
		System.out.println("m2 child");
	}
	
public static void main(String[] args) {
	Parent aa = new AA();
	aa.m1();
	aa.m2();
	
}
}
