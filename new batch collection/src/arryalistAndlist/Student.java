package arryalistAndlist;

public class Student {

	private Integer rollNumber;
	private String studentName;
	private Double percentge;

	public Student() {
		super();
	}

	public Student(Integer rollNumber, String studentName, Double percentge) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.percentge = percentge;
	}

	public Integer getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Double getPercentge() {
		return percentge;
	}

	public void setPercentge(Double percentge) {
		this.percentge = percentge;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", studentName=" + studentName + ", percentge=" + percentge + "]";
	}

}
