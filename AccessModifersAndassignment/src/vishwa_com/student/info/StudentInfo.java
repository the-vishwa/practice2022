package vishwa_com.student.info;

public class StudentInfo {

	public Student[] getStudentInfo() {

		Student[] st = new Student[4];

		st[0] = new Student("vishwa", 1, "DRBOD");
		st[1] = new Student("nirmal", 2, "DRBOD");
		st[2] = new Student("kuldip", 3, "DRBOD");
		st[3] = new Student("premjit", 4, "DRBOD");

		return st;

	}

}
