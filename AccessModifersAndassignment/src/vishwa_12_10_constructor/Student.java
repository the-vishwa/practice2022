package vishwa_12_10_constructor;

public class Student {

	
	String name;
	int rollNo;
	String collegeName;
	
	Student(){} // zero arg constructor
	
	// param constructor

	public Student( String name,int rollNo, String collegeName) {
		
		this.name = name;
		this.rollNo = rollNo;
		this.collegeName = collegeName;
	}
	
	
	
	
}
