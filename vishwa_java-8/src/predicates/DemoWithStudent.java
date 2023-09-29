package predicates;

class Student {
	String name;
	Double Percentage;

	// public Student() {}
	public Student(String name, Double percentage) {
		super();
		this.name = name;
		Percentage = percentage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPercentage() {
		return Percentage;
	}

	public void setPercentage(Double percentage) {
		Percentage = percentage;
	}

}


public class DemoWithStudent {
	public static void main(String[] args) {
		Student s = new Student("vishwa", 45.60);
		Student s1 = new Student("nirmal", 60.60);
		Student s2 = new Student("kudip", 65.60);
		Student s3 = new Student("premjit", 70.60);
		Predicate<Student> ch = t -> {
			if (t.getPercentage() > 61.0) {
				return true;
			} else {
				return false;
			}

		};
		System.out.println(ch.check(s2)); // test metghod
	}

}






