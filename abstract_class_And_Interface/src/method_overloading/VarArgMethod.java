package method_overloading;

public class VarArgMethod {
	
	void m1(int a) {
		System.out.println("m1(int)");
	}
	
	void m1(int... a) {
		
		System.out.println("I am var agr method");
		for(int i =0; i < a.length; i++) {
			System.out.print(a[i] +"  ");
		}
		System.out.println("------------------------------");
	}
	
	
	public static void main(String[] args) {

		VarArgMethod v = new VarArgMethod();
		v.m1(); //  var-arg
		v.m1(1); // m1(int)
		v.m1(1,2,3); // var-arg
		v.m1(1,2,3,4,5,6,7,8,9,0); // var-arg
	}
}
