package nirmal_set_get;

public class Student2 {
	private String StudentFName;
	private String StudentlName;
	private int StudentRollNumber;
	
	
	public Student2(String studentFName, String studentlName, int studentRollNumber) {
		
		StudentFName = studentFName;
		StudentlName = studentlName;
		StudentRollNumber = studentRollNumber;
	}


	public String getStudentFName() {
		return StudentFName;
	}


	public void setStudentFName(String studentFName) {
		StudentFName = studentFName;
	}


	public String getStudentlName() {
		return StudentlName;
	}


	public void setStudentlName(String studentlName) {
		StudentlName = studentlName;
	}


	public int getStudentRollNumber() {
		return StudentRollNumber;
	}


	public void setStudentRollNumber(int studentRollNumber) {
		StudentRollNumber = studentRollNumber;
	}

}
