package vishwa_Lang.pack_methds_of_objectClass;

class A {
}

class BBC {
	int x;
	int y;

	BBC(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public boolean equals(Object o) {

		BBC b1 = (BBC) o; // type casting
		if (this.x == b1.x && this.y == b1.y) {

			return true;

		}
		return false;
	}
	@Override
	public int hashCode() {
		
		return this.x + this.y+123456;
	}

}

public class Hashtable_algo {

	public static void main(String[] args) {
		BBC b = new BBC(2, 3);
		BBC b1 = new BBC(2, 3);// if i change the data then ans will be false
		System.out.println(b == b1); // false 
		System.out.println(b.equals(b1)); // true
		System.out.println(b.hashCode());
	    System.out.println(b1.hashCode());
	    
		System.out.println(b.hashCode()==b1.hashCode()); 
		
	    System.out.println("______________________________________");
	    
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1.equals(s2)); // true 

		System.out.println(s1.hashCode()); // same hashcode
		System.out.println(s2.hashCode()); // same hashcode
		System.out.println(s1.hashCode()==s2.hashCode()); // primitive are same // true
		
	}
}
