package vishwa_Meth_and_RetrnType_27_9;



public class ABCcontroller {

	public static void main(String[] args) {
		
		A a = new A();
		a.a= 10;
		a.b=20;
		int x = a.sum();
		System.out.println(x);
		
		
		B b = new B();
		A ss = b.getAobj();
		int y =  ss.sum();
	    System.out.println(y);
		//System.out.println(b.getAobj().ss.sum());     
		
	    C c = new C();
	   A rrr = c.getAobj();
	   int z = rrr.sum();
	   System.out.println(z);
	    
	    
	    
	}
	
}
