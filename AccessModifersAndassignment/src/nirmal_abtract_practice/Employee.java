package nirmal_abtract_practice;

abstract class Employee {
	String firstname;
	String lastname;
	int id;

	abstract void getEmployeeinfo(String firstname ,String lastname, int id);

}

class info extends Employee {
	String firstname = "nirmal";
	String lastname = "rajput";
	int id = 34;

	public void getEmployeeinfo(String firstname ,String lastname, int id) {
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(id);
				

	}


	}

