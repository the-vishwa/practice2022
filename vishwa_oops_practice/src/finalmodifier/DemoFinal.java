package finalmodifier;

public class DemoFinal {
	
	final int a;// jar constructr nasel tr error deil
	
	public DemoFinal(int a) {
		this.a=a;
	}
	
	
	public static void main(String[] args) {
		
		DemoFinal a1 = new DemoFinal(100);	
		DemoFinal a2 = new DemoFinal(200);	
		DemoFinal a3 = new DemoFinal(300);	
	
		System.out.println(a1.a);
		System.out.println(a2.a);
		System.out.println(a3.a);
		
		
		
	}

}
