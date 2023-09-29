package vishwa_26_9_22;

public class Student {

	String name;
	int rollNumber;
	String std;
	char dividion;
	School s;
	
	
	void studentDetails() {
		
		  System.out.println("student name="+ name);
		  System.out.println("standard="+std);
		  System.out.println("rollnum="+rollNumber);
		  System.out.println("div="+dividion);
		  System.out.println("_________________________");
		  System.out.println(s.schoolName);
		  System.out.println("teacher name="+s.headmaster);
		  System.out.println(s.adr.city);
		  System.out.println(s.adr.pincode);
		
		
		
		
	}
	
	
	
}
