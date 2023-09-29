package vishwa_20_9_22;

public class EAddress {
     String city;
     int pincode;
     
     
     public static void main(String[] args) {
		Employee e = new Employee();
		e.name="vishwa";
		e.empid=123456;
		
		
		EAddress ad = new EAddress();
		ad.city="dhule";
		ad.pincode=425408;
		e.adr=ad;
		
		System.out.println(e.name);
		System.out.println(e.empid);
		System.out.println(ad.city);
		System.out.println(ad.pincode);
		
	}
}
