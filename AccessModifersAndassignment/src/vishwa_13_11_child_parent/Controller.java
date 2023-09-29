package vishwa_13_11_child_parent;

public class Controller {

	
	public static void main(String[] args) {
		Parent p = new child();
		p.m1();
		p.m2();
		
		p.equals(p);// equal method of parent class
		// parent refrnc can hold any child object
		//and child can override any parent method except final 
		//and object ref can hold any child object
	}
}
