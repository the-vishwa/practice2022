package practice;

class Student {

	int no;
	String nam;

	void printInfo() {
		System.out.println(no);
		System.out.println(nam);

	}

}

class teacher {

	Student callmethode(int no, String nam) {

		Student s = new Student();
		s.no = no;
		s.nam = nam;

		return s;
	}

}

public class Controller {
	public static void main(String[] args) {

		teacher t = new teacher();
		Student st = t.callmethode(2, "rwl");
		st.printInfo();
	}

}
