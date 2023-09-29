package vishwa_poji_pojo_15_11;

public class Factory {

	public static C getObject() { 
// factory method ..if that method returned others class object that is called as factory method
// Factory method use- i want to hide from someone that what exactly  internal object type.(object kis chij ka bana rahe ho ye muje hide karna hai)
		//B b = new B();             //  is for B class 
		//return b;
	C c = new C ();
	return c;
	}
	public static void main(String[] args) {
		A a = Factory.getObject();
		a.m1(20,10); // we need not to change client code 
	}
}

	
	

