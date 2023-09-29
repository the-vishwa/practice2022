package vishwa_26_9_22;

public class Stcontroller {

	public static void main(String[] args) {
		Student st = new Student();
		  st.name="vishwa";
		  st.std="10th";
		  st.rollNumber=007;
		  st.dividion='A';
		  
		  School sc = new School();
		  sc.schoolName = "D.R";
		  sc.headmaster = "marathe";
		  
		  Address ad = new Address();
		  ad.city="dhule";
		  ad.pincode=425408;
		  sc.adr=ad;
		  
		  st.s=sc;
		  
		  
	// here the program is like we can print it in method or class	  
		  
		 
	//  System.out.println("student name="+ st.name);
//		  System.out.println("standard="+st.std);
//		  System.out.println("rollnum="+st.rollNumber);
//		  System.out.println("div="+st.dividion);
//		  System.out.println("school name="+st.s.schoolName);
//		  System.out.println("teacher name="+st.s.headmaster);
//		  System.out.println(ad.city);
//		  System.out.println(ad.pincode);
	  //Student s = new Student();
	  st.studentDetails();
		  
	}
	
}
