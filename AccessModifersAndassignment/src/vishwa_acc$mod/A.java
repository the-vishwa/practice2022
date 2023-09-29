package vishwa_acc$mod;

abstract class A {

	void m1() { // take this method as an abstract error will be on line no 23
		// cuz if there is any abstract meth complsry we have to take that meth into
		// child
		// but there is no any abtsrcat meth then its ur choice to take or not

		System.out.println("i am a m1 method of class A");

	}

//    	 void m2(){
//    		 
//    		 System.out.println("i am a m2 method of class A");
//    	 }

}

class B extends A {

	void m2() {
		System.out.println("i am a m2 method of class B");
	}

}

class C extends B {

	void m1() {
		System.out.println("i am a m1 method of class C");
	}

	void m3() {

		System.out.println("i am a m3 method of class C");
	}

}

class D extends C {

	void m4() {

		System.out.println("I am a m4 method of class D");
	}

}
