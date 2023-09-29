package vishwa_hashCode_$_toString_14_12;

class AAA {
	int x;
	int y;
	
	@Override
	public int hashCode() {
		
		return x+y;
	}
}

public class Hashcode {
	public static void main(String[] args) {
		AAA a = new AAA();
		a.x = 2;
		a.y = 3;
		System.out.println(a.getClass().getName() +"@"+ a.hashCode());
		System.out.println(a.toString());
		System.out.println(a);
		System.out.println(a.hashCode());

	}
}
