package nirmal_practice_of_import;

public class Student1 {
 
	private String StudentFName;
	private String StudentLName;
	private int StudentRollNum;
	
	public Student1(String studentFName, String studentLName, int studentRollNum) {
		
		this.StudentFName = studentFName;
		this.StudentLName = studentLName;
		this.StudentRollNum = studentRollNum;
	}
	public String getStudentFName() {
		return StudentFName;
	}
	public void setStudentFName(String studentFName) {
		StudentFName = studentFName;
	}
	public String getStudentLName() {
		return StudentLName;
	}
	public void setStudentLName(String studentLName) {
		StudentLName = studentLName;
	}
	public int getStudentRollNum() {
		return StudentRollNum;
	}
	public void setStudentRollNum(int studentRollNum) {
		StudentRollNum = studentRollNum;
	}
	 
	
}
