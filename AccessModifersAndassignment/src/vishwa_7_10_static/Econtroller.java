package vishwa_7_10_static;

public class Econtroller {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.name="vishwa";
		e.empId=4512;
		
		Employee e1 = new Employee();
		e1.name="nirmal";
		e1.empId=4613;
		
		Employee e2 = new Employee();
		e2.name="kuldip";
		e2.empId=4714;
		
		Employee.companyName="RWL.PVT.LTD";
		
		
		
		// below loop is just for understanding!
		
		
		      Employee[] ee = {e,e1,e2};
		for(int i=0;i<ee.length;i++) {
			 System.out.println(ee[i].name);
			 System.out.println(ee[i].empId);
			 System.out.println(Employee.companyName);
			 System.out.println("____________");
		}
		
		
	}
	
}
