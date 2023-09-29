package vvvv;

class BBB {
	int a=10;
	int b=10;
	 void m1(int x,int y) {
		 System.out.println(x+y);
		 System.out.println(this.a);
		 System.out.println(this.b);
	}
}

public class DDDD {
public static void main(String[] args) {
	BBB bb = new BBB();
	bb.m1(20, 20);
	
}
}
