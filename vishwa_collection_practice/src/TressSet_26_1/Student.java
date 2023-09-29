package TressSet_26_1;

public class Student implements Comparable<Student> {
	private Integer no;
	private String Fname;
	private String Lname;

	public Student(Integer no, String fname, String lname) {
		super();
		this.no = no;
		Fname = fname;
		Lname = lname;
	}

	public Integer getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	@Override
	public String toString() {
		return "Student [no=" + no + ", Fname=" + Fname + ", Lname=" + Lname + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Student s = (Student) obj;
		if (this.getNo().equals(s.getNo()) && this.getFname().equals(s.getFname())
				&& this.getLname().equals(s.getLname())) {
			return true;

		}
		return false;
	}

	@Override
	public int compareTo(Student o) {
		Integer i = this.getNo();
		Integer i1 = o.getNo();
// ----------logic for  duplicate object  remove not for only id-------------
// for  decnndng   do -1 plus and +1 munus

//		if (i < i1) {
//			return -
//					1;
//		} else {
//			if (this.equals(o)) {
//				return 0;
//			}
//			return 1;
//		}

//----this logic is for duplicate id  remove--------------------------------------------------		

//if(i<i1){
//	return-1;
//}else if(i>i1){
//	return 1;
//	}else{
//		return i.compareTo(i1);
//	}
//}

return 0;

	}
}
