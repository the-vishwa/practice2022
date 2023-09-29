package TreeSetExample;

public class Fresher implements Comparable<Fresher> {

	private Integer rollNum;
	private String firstName;
	private String lastName;

	public Fresher() {
	}

	public Fresher(Integer rollNum, String firstName, String lastName) {
		super();
		this.rollNum = rollNum;
		this.firstName = firstName;
		this.lastName = lastName;
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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Fresher [rollNum=" + rollNum + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

//	@Override
//	public int hashCode() {
//		return this.rollNum.hashCode() + this.firstName.hashCode() + this.lastName.hashCode();
//	}

//	@Override
//	public boolean equals(Object obj) {
//		Fresher s = (Fresher) obj;
//		if (this.getFirstName().equals(s.firstName) && this.getLastName().equals(s.lastName)
//				&& this.getRollNum().equals(s.rollNum)) {
//			return true;
//
//		}
//		return false;
//	}
	@Override
	public int compareTo(Fresher o) {
//		Integer f1 = this.getRollNum();
//		Integer f2 = o.getRollNum();
//		if (f1<f2) {
//			return -1;
//		}else if (f1>f2){
//			return 1;
//		}else {
//			return 0;
//		}

		
		
		String ss1 = this.getFirstName();
		String ss2 = o.getFirstName();
		return -ss1.compareTo(ss2);

//		if (i == 0) {
//			return -1;
//		} else {
//			return i;
//		}

	}

}