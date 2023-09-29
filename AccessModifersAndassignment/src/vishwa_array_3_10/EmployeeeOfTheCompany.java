package vishwa_array_3_10;

public class EmployeeeOfTheCompany {

	String fname;
	String lname;
	int age;
	String salary;
	char cabin;

	public static void main(String[] args) {

		// EmployeeeOfTheCompany[] e = new EmployeeeOfTheCompany[3];

		EmployeeeOfTheCompany x = new EmployeeeOfTheCompany();

		x.fname = "vishwa";
		x.lname = "rajput";
		x.age = 10;
		x.salary = "50k";
		x.cabin = 'D';
		// e[0] = x;

		EmployeeeOfTheCompany y = new EmployeeeOfTheCompany();

		y.fname = "Nirmal";
		y.lname = "rajput";
		y.age = 11;
		y.salary = "55k";
		y.cabin = 'A';

		// e[1] = y;

		EmployeeeOfTheCompany z = new EmployeeeOfTheCompany();

		z.fname = "sonal";
		z.lname = "dhas";
		z.age = 12;
		z.salary = "60k";
		z.cabin = 'B';

		// e[2] = z;

		EmployeeeOfTheCompany[] e = { x, y, z };

		// System.out.println(e[0].fname);
		// System.out.println(e[0].lname);
		// System.out.println(e[0].age);
		// System.out.println(e[0].salary);
		// System.out.println(e[0].cabin);

		// System.out.println(e[1].fname);
		// System.out.println(e[1].lname);
		// System.out.println(e[1].age);
		// System.out.println(e[1].salary);
		// System.out.println(e[1].cabin);

		// System.out.println(e[2].fname);
		// System.out.println(e[2].lname);
		// System.out.println(e[2].age);
		// System.out.println(e[2].salary);
		// System.out.println(e[2].cabin);

		for (int i = 0; i < e.length; i++) {

			System.out.println(e[i].fname);
			System.out.println(e[i].lname);
			System.out.println(e[i].age);
			System.out.println(e[i].salary);
			System.out.println(e[i].cabin);
		}

	}

}
