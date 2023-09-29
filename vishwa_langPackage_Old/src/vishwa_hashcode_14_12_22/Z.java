package vishwa_hashcode_14_12_22;

class Mmm {
	int a;

	Mmm() {

	}

	@Override
	public int hashCode() {
		return this.a;
	}

	@Override
	public String toString() {

		return "rwl";
		// return "ans=" +this.a ;
	}

	@Override
	public boolean equals(Object obj) {
		Mmm m = (Mmm) obj;
		if (this.a == m.a) {
			return true;
		}
		return false;
	}
}

public class Z {
	public static void main(String[] args) {
		Mmm m = new Mmm();
		Mmm m2 = new Mmm();

		System.out.println(m); // overrided tostring method

		System.out.println(m.a); // normal way jvm given default value

		System.out.println(m.equals(m2));  //made it true

		System.out.println(m.hashCode());  
		System.out.println(m2.hashCode());

		
//String s1 = new String("abc"); // data value
//String s2 = new String("abc"); // data value
//
//System.out.println(s1);
//System.out.println(s2);
//System.out.println(s1.hashCode());
//System.out.println(s2.hashCode());
	}
}
