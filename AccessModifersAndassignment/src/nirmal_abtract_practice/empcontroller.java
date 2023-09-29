package nirmal_abtract_practice;

public class empcontroller {

	public static void main(String[] args) {

		info i = new info();

		System.out.println(i.firstname);
		System.out.println(i.lastname);
		System.out.println(i.id);
		i.getEmployeeinfo("indra", "rajput", 23);

	}

}
