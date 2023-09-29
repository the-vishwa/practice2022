package vishwa_17_10;



public class Employee {

	
	String name;
	int empId;
	long cellPhone;
    static String officeName;
    
    void m1() {
    	System.out.println("I am instance method of m1");
    }
    
    static void s1() {
    	System.out.println("I am static method of s1");
    }
	
    
    void m2() {
    	System.out.println(name);
    	System.out.println(empId);
    	System.out.println(cellPhone);
    	m1();
    	
    	System.out.println(Employee.officeName); 
    	Employee.s1();                           
    }
    
    static void s2() {
    	System.out.println(officeName); 
    	Employee.s1();                           
 
    
    	Employee e= new Employee();
    	System.out.println(e.name);
    	System.out.println(e.empId);
    	System.out.println(e.cellPhone);
    	e.m1();
    }
}

