package vishwa_26_9_22;

public class Employee {

	String name;
	 int impid;
	 long contact;
	 Ecompany comp;
	 Addresss adr;
	 
	// both type here using method and normal
	 void printEmpDetails() {
		 
		 
		 System.out.println(name);
		 System.out.println(impid);
		 System.out.println(contact);
		 System.out.println(adr.city);
    	 System.out.println(adr.pincode);
		 System.out.println("_____________________________");
		 System.out.println(comp.name);
		 System.out.println(comp.regNo);
		 System.out.println(comp.adr.city);
		 System.out.println(comp.adr.pincode);

		 
	 }
}
	 
		 
		 
		 
		 
		 
		 
		 
 
	 
	 

