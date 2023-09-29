package vishwa_tightly_coupling_IS_relat_17_11;
// inheritance
public class A { // Dependency class

	// if A changed his method name as m2..then will impact on class B ........
	void m1() {
		System.out.println("am a m1 method of class A");
	}

}
//loose and tightly coupling happens with help of  extends keyword (inheritance)... 
class B extends A { // dependent class // this is multi level inheritance....... 
	@Override
	void m1() {
		System.out.println("am a m1 method of class B");
	}
}
// class C extends B,A{  this is a multiple inheritance .. n java is not allowing the multiple inheritance  }
