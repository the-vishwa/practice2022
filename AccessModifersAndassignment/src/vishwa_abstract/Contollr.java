package vishwa_abstract;

public class Contollr {
	public static void main(String[] args) {
		// here we cant create a object of abstract class cuz its abstract like see below
		// IT  it = new  IT(); // <<-------- cant do this ......
		// but we can create a refrnc variable of abstract class like see below IT
		IT it = new All(); // <------- yes it can be allowd ....
//		it.m1();
//		it.m2();
//		it.m3();
		caller(it);
		
       All all = new All(); 
       all.m1();
       all.m2();
       all.m3();
	}
	static void caller (IT it) { //here parent parent objcet 
		it.m1();
		it.m2();
		it.m3();
		
	}
	
}
