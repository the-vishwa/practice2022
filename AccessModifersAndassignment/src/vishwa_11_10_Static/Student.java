package vishwa_11_10_Static;



public class Student {

		int rollNo;
		String name;
		long cellPhone;
	    static String schoolName;
	    
	    void m1() {
	    	System.out.println("I am a m1 method");
	    }
	    
	    static void s1() {
	    	System.out.println("I am a s1 static method");
	    }
		
	    
	    void m2() {
	    	System.out.println(rollNo);
	    	System.out.println(name);
	    	System.out.println(cellPhone);
	    	m1();
	   
	    	System.out.println(Student.schoolName); // or schoolName
	    	//Student.s1();   
	    	 s1();                      
	    }
	    
	    static void s2() {
	    	System.out.println(Student.schoolName);//or schoolName
	    	Student.s1();                          
	 
// we can't access instance variable & 
// method directly inside static method
	    	System.out.println(rollNo);
	    	System.out.println(name);
	    	System.out.println(cellPhone);
	    	m1();
	    	
// for that indirect first create an object of given class and access
	    	Student s= new Student();
	    	System.out.println(s.rollNo);
	    	System.out.println(s.name);
	    	System.out.println(s.cellPhone);
	    	s.m1();
	    	
	    }
	}



