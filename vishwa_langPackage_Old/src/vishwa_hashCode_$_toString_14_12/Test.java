package vishwa_hashCode_$_toString_14_12;

class A {
}

class Student {
	int rollNumber;
	String name;

	Student(int rollNumber, String name) {
		this.rollNumber = rollNumber;
		this.name = name;
	}

	public int hashCode() {
		String str=(String)this.name;
		System.out.println(str);
		return this.rollNumber; //+this.rollNumber;
	}

//	@Override
//	public String toString() {
//		return "Student [name=" + name + "]";
//	}
	
}

public class Test {
	public static void main(String[] args) {
		A a = new A();
		A b = new A();
		// int x=a.hashCode();
		// int y=b.hashCode();
		A c = a;
		System.out.println(a.hashCode());// 359023572
		System.out.println(b.hashCode());// 305808283
		System.out.println(c.hashCode());// 359023572

		Student t = new Student(12, "vishwa");
		Student t2 = new Student(13, "rajput");

		System.out.println(t.hashCode());
		System.out.println(t2.hashCode());
	}

}