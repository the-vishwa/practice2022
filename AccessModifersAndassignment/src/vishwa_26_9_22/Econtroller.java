package vishwa_26_9_22;

public class Econtroller {

	public static void main(String[] args) {

		Employee e = new Employee();
		e.name = "vishwa";
		e.impid = 123456;
		e.contact = 7385809072l;

		Ecompany ec = new Ecompany();
		ec.name = "microsoft";
		ec.regNo = "123abc";
		e.comp = ec;

		Addresss ad = new Addresss();
		ad.city = "dhule";
		ad.pincode = 4025408;
		e.adr = ad;

		Addresss x = new Addresss();
		x.city = "washington";
		x.pincode = 9805263;
		ec.adr = x;

//		    		 System.out.println(e.name);
//		    		 System.out.println(e.impid);
//		    		 System.out.println(e.contact);
//		    		 System.out.println(e.adr.city);
//		    		 System.out.println(e.adr.pincode);
//		    		 System.out.println("_____________________________");
//		    		 System.out.println(e.comp.name);
//		    		 System.out.println(e.comp.regNo);
//		    		 System.out.println(e.comp.adr.city);
//		    		 System.out.println(e.comp.adr.pincode);

		e.printEmpDetails();

	}

}
