package vishwa_pack2_for_query;

import vishwa_pack1_for_query.A;

public class C {

	public static void main(String[] args) {

		A a = new A("Rajput", "Maharashtra");  //para constructor
		A.cityName="Dondaicha";  // static city name
		A.setfName("Vishwa"); // static and private fname // static properties doesnt need set-get and para constru
		
	                                                          
		System.out.println(a.stateName);                       //String y = a.getStateName();
		System.out.println(A.cityName);                       //a.getStateName();
		String x = A.getfName();                             //String p = A.getCityName();
		String y = a.getLname(); 
		
		
		System.out.println(x);                    
		System.out.println(y);
		
		
		a.m1();
		A.m2();
		
	}
}
