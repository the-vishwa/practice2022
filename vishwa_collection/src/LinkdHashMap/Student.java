package LinkdHashMap;


public class Student {
	private Integer rollNum;
	private String firstName;
	
	public Student() {
	}

	public Student(Integer rollNum, String firstName) {
		super();
		this.rollNum = rollNum;
		this.firstName = firstName;
	}

	public Integer getRollNum() {
		return rollNum;
	}

	public void setRollNum(Integer rollNum) {
		this.rollNum = rollNum;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@Override
	public String toString() {
		return "Student [rollNum=" + rollNum + ", firstName=" + firstName + "]";
	}
	@Override
	public int hashCode() {
		return this.rollNum.hashCode() + this.firstName.hashCode(); 
	}

	@Override
	public boolean equals(Object obj) {
		Student s = (Student) obj;
		if (this.getFirstName().equals(s.firstName) && this.getRollNum().equals(s.rollNum)) {
			return true;

		}
		return false;
	}
	
	
}
