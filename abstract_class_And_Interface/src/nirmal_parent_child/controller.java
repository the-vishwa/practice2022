package nirmal_parent_child;

public class controller {
	public static void main(String[] args) {

//		case 1]

		Parent p = new Parent();
		p.m1();
		p.m2();

		System.out.println("-------------------------------");

//		case 2]

		Child c = new Child();
		c.m1();
		c.m2();
		c.m3();

		System.out.println("-------------------------------");

// note - child can hold its own method as well as parent method		

//		case 3]

		Parent pa = new Child();
		pa.m1();// parent
		pa.m2();// child
		
//	m2 method is having in both (class Parent) or (class Child) but run time jvm call child class method.	

	}

}
