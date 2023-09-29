package vishwa_9_1_23;

import java.util.ArrayList;
import java.util.Iterator;

class Student {
	private String name;
	private Integer age;
	private String place;

	public Student() {

	}

	public Student(String name, Integer age, String place) {
		super();
		this.name = name;
		this.age = age;
		this.place = place;

	}

	public static void getStudentDetails(Integer age, ArrayList<Student> al) {
		Iterator<Student> itr = al.iterator();
		while (itr.hasNext()) {
			Student i = itr.next();
			if (i.getAge().equals(age)) {
				System.out.println(i);
			}

		}

	}

	public static void ObjectRemove(String name, ArrayList<Student> al) {
		Iterator<Student> itr = al.iterator();
		while (itr.hasNext()) {
			String i = itr.next().getName();
			if (i.equals(name)) {
				itr.remove();
			}
			System.out.println(i);
		}

	}

	public static void getName(ArrayList<Student> al) {
		Iterator<Student> itr = al.iterator();
		while (itr.hasNext()) {
			String i = itr.next().getName();
			System.out.println(i);
		}

	}

	public static void searchByplace(String place, ArrayList<Student> al) {
		Iterator<Student> itr = al.iterator();
		while (itr.hasNext()) {
			Student i = itr.next();
			if (i.getPlace().equals(place)) {
				System.out.println(i);
			}
		}

	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", place=" + place + "]";
	}

}

public class AsignmentOncurcer {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student("sachin sir", 22, "pune"));
		al.add(new Student("vishwa", 10, "Arale"));
		al.add(new Student("nirmal", 15, "suray"));
		al.add(new Student("kuldip", 20, "pimpri"));
		al.add(new Student("premjit", 25, "shirpur"));
		al.add(new Student("darpan", 14, "shirpur"));
		al.add(new Student("yogesh", 9, "dhule"));
		al.add(new Student("Prashant",9, "dhule"));

		Student.getStudentDetails(9, al);
		System.out.println("___________");
		Student.ObjectRemove("yogesh", al);
		System.out.println("___________");
		Student.getName(al);
		System.out.println("___________");
		Student.searchByplace("shirpur", al);

	}
}
