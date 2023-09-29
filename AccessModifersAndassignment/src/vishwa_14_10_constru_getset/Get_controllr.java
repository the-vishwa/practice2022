package vishwa_14_10_constru_getset;

public class Get_controllr {
    public static void main(String[] args) {
		
	
	Get_set g = new Get_set(20,30);
	                                 g.setB(40); // whichever value u want to change then use set methd,
	int aa = g.getA();
	int bb = g.getB();
	
	System.out.println(aa); // privacy
	System.out.println(bb); // privacy
	
	//OR
	
	System.out.println(g.getA());
	System.out.println(g.getB());
	
	
    }
}
