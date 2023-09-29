package oops;

class Student {
	private int id;
	private String name;

	public Student() {
		this.id = 12;
		this.name = "vishwa";
	}

	public Student(int id, String name) {
//		this.id = id;
//		this.name = name;
		System.out.println(id);
		System.out.println(name);
	}

	public Student(String name) {
		this.id = 1;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {

		this.name = name;
	}
}

public class Constructor_overloading {
	public static void main(String[] args) {
		Student s = new Student();
//		System.out.println(s.getId());
//		System.out.println(s.getName());
		
		Student s1 = new Student(13, "vinayak");
		//System.out.println(s1);
		
		Student s2 = new Student("kiran");
		System.out.println(s2.getId());
		System.out.println(s2.getName());
		
		
	}

}
