package oops;

class Test3 {

	int m1(int a, int b) {
		int s = a + b; //
		return s;

	}

}

public class Test1 extends Test3 {
	
	public  Test1() {
	// jar dusrya class cha obj pahije tar composition obj banavne	
	}
	
	
	public static void main(String[] args) {
		
		Test1 tt=  new Test1();
		int  i = tt.m1(12, 01);
		System.out.println(i);
		
	}

}
