package vishwa_rajput_;

public class D {

	final void m1() {
		System.out.println("abc");
	}

//
//	void m2() {
//		System.out.println("abc");
//	}

}

class E extends D {

//	void m1() {
//		System.out.println("abc");
//	}
	final void m2() {
		System.out.println("abc");
	}
}

class F extends E {

	final void m3() {
		System.out.println("abc");
	}

}
// doubt cleard.....