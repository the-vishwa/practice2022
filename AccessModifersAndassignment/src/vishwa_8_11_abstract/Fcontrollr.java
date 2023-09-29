package vishwa_8_11_abstract;

public class Fcontrollr {

	public static void main(String[] args) {

		Father f =new Son();
		f.m1();
		Son son = new Son();
		//Father f=new Son();
		son.getFuture("Arrale", 55);
		
         System.out.println("_______");
         
		System.out.println(son.homeName);
		System.out.println(son.where);
		System.out.println(son.expect);
		
    
	}
}
