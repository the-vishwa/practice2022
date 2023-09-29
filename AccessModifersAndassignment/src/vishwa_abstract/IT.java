package vishwa_abstract;

public abstract class IT {
	abstract void m1();
	abstract void m2();
	void m3() {
// abstract class havnt fully functinality thats y.. we cant create an object of abstract class.....
// here m3 methd is a concrete method so if we want to override this method its ourr choice ..here its not compulsion
//to override this concrete method 
	}

}
class All extends  IT{
	//here u have to complsry overide abstract method 
	@Override
	void m1() {
		System.out.println("hi");
	}
	@Override
	void m2() {
		System.out.println("hello");
	}
}