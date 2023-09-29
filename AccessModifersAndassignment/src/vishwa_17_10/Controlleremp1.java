package vishwa_17_10;

public class Controlleremp1 {
	
	public static void main(String[] args) {

		// if i want to call instance method then i will have to create an object
		Employee e = new Employee();
		e.name = "vishwa";
		e.empId = 1234;
		e.m1();
		Employee.s1();
		e.m2();
		// if i want to call static method then no need to create an object
		
		System.out.println();

		System.out.println("_______________________________________________");
		System.out.println(e.name);
		System.out.println(e.empId);
		Employee.officeName = "RIGHT_WAY_LEARNING";
		System.out.println(Employee.officeName);
		System.out.println("_______________________________________________");

	}
}
					
					
					
					



				

