package predicates2;

public class A {

// even odd	

	
	Boolean test(Integer i) {
		if (i % 2 == 0) {

			return true;
		} else {
			
			return false;
		}
		
	}
	

	public static void main(String[] args) {

		A a= new A();
		System.out.println(a.test(3));
		
	}

}
