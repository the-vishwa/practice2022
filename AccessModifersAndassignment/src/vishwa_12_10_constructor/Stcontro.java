package vishwa_12_10_constructor;

public class Stcontro {

	public static void main(String[] args) {

		// param constructor
		Student s = new Student("vishwa", 8100, "D.R");
		System.out.println(s.name);
		System.out.println(s.rollNo);
		System.out.println(s.collegeName);
		System.out.println("_________");

		// OR

		// zero args constrctr

		Student s1 = new Student();
		s1.rollNo = 4646;
		s1.name = "nirmal";
		s1.collegeName = "D.R";

		System.out.println(s1.name);
		System.out.println(s1.rollNo);
		System.out.println(s1.collegeName);

	}
}
