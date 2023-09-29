package nirmal_methodOverloading_practice;

public class B {

	void m1(Byte l) {
		System.out.println("i am Byte");
	}

//	void m1(Integer i) {
//		System.out.println("i am interger");
//
//	}

	void m1(Object o) {
		System.out.println("i am object");
	}

	void m1(Number n) {
		System.out.println("i am a number");
	}
	
//	void m1(long l) {
//		System.out.println("i am a long");
//	}

	public static void main(String[] args) {
		B b = new B();
		int i = 20;
		b.m1(i);
//		

		long l = 2091l;
		b.m1(l);
		
//	Check:- long into Long While match is not find go to parent means Number;
		
		
//		long convert into Long >>>>>not match>>>>>>>>>Long method check parent means Number.
	
		

	}
}
