package extends_Implements;

public class Concrete {
// CASE 1
	void m1() {
	}
}

abstract class B extends Concrete {
	void m1() {
	}
}

//CASE 2
class C extends B {
	void m1() {
	}
}
// CASE 3,1 same

//CASE 4 
abstract class D extends B {
	void m1() {
	}
}

// CASE 5
interface E {
	void m1();
}


class F implements E {
	public void m1() {
	}
}

abstract class Kiran implements E{
	
}

interface G {
	void m1();

	void m2();
}

// CASE 6,7
class H implements E, G { // multiple inheritance allow for interface
	public void m1() {
	}

	public void m2() {
	}

}

// CASE 8
abstract class I implements G {
	public abstract void m1();
}

// CASE 8

interface J {
	void m1();
}

abstract class K implements J {
	// here cant force to override that interface method
}

// CASE 9
interface S {
	void m5();
}

abstract class L implements S {
	abstract void m6();
}

class M extends L {
	public void m5() {
	}

	void m6() {
	}

}

//CASE 10
interface N {
	void m7();
}

interface O extends N {
	void m8();
}

class T implements O {
	public void m7() {
	}

	public void m8() {
	}

}

//CASE 11
interface P {
}

interface Q {
}

abstract class R implements P, Q {

}
