package TreeSetExample;

public class Studenttt implements Comparable<Studenttt> {

	private Integer rollNum;
	private String firstName;
	private String lastName;

	public Studenttt() {
	}

	public Studenttt(Integer rollNum, String firstName, String lastName) {
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
		return "Student [rollNum=" + rollNum + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	@Override
	public int hashCode() {
		return this.rollNum.hashCode() + this.firstName.hashCode() + this.lastName.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Studenttt s = (Studenttt) obj;
		if (this.getFirstName().equals(s.firstName) && this.getLastName().equals(s.lastName)
				&& this.getRollNum().equals(s.rollNum)) {
			return true;

		}
		return false;
	}
	@Override
//	public int compareTo(Students o) {
//		
//		 String s1 =this.getLastName();
//		 String s2 =o.getLastName();
//          int capture = s1.compareTo(s2);
//
//			if (capture == 0) {
//				return -1                //  this.compareUsingNumTo(o);    
//			} else {
//				return capture;
//			}
//	}

	public int compareTo(Studenttt o) {  //compareUsingNumTo
		/*
		 👇one line statement which is just used for without any duplicates ..
		 return this.getLastName().compareTo(o.getLastName()); 
		 return this.getRollNum().compareTo(o.getRollNum());
		 */
		
		Integer r1 = this.getRollNum();
		Integer r2 = o.getRollNum();
		 //return (r1 < r2) ? -1 : ((r1 == r2) ? 0 : 1);     // OR👇
		// return r1.compareTo(r2);
		
			if (r1 < r2) { // here in this duplicates are...
				return -1;
			} else if (r1 > r2) {
				return 1;
			}
			return rollNum;
		}
	}
/*		Studenttt(5, 
		Studenttt(2,
		Studenttt(3, 
		Studenttt(1,
		Studenttt(4, 
*/











// Error
//String s1 =this.getLastName();
//String s2 =o.getLastName();
//return (s1 < s2) ? -1 : ((s1==s2)? 0 : 1);
//The operator < is undefined for the argument type(s) java.lang.String, java.lang.String


