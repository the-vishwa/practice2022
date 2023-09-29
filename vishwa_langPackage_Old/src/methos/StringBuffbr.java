package methos;

public class StringBuffbr {
	public static void main(String[] args) {
		
		
		StringBuffer br  = new StringBuffer();
		System.out.println(br.capacity());//16
		
		// aft 16 it will increase
		// new capacity = (old+1)*2
		
		br.append("sssssssssssssssss");
		System.out.println(br.capacity());//34
		
		br.trimToSize(); // hi method  capacity kami karte
		//jevdhi denar tevdhi show karel
		
		br.ensureCapacity(50);// adva capacity kiti te add karu karu shakto

		
		
		Integer  i = new Integer(123);
		int d = i.intValue();
		System.out.println(d); // wrappr to primitive
		
		String ss = new String("123");
		Integer ii  = Integer.parseInt(ss);
		System.out.println(ii);
		
	}
}
