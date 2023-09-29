package method1.overriding.pack;

class AA{
	
	 void m1() {
		System.out.println("I am AA class m1");
	}
	
}

class BB extends AA{
	
	 void m1() {
		System.out.println("I am BB class m1");
	}
}


public class SaticMethodOverridingExample {

	public static void main(String[] args) {
		AA a = new BB();
		a.m1();
	
	}
}
