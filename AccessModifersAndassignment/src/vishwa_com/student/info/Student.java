package vishwa_com.student.info;

public class Student {

	private String studentName;
	private int rollNumber;
	private String schoolName;

	Student() {
	}

	public Student(String studentName, int rollNumber, String schoolName) {
		this.studentName = studentName;
		this.rollNumber = rollNumber;
		this.schoolName = schoolName;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

}
