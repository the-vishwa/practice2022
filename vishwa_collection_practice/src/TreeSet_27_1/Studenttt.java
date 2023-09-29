package TreeSet_27_1;

public class Studenttt implements Comparable<Studenttt> {
	private Integer no;
	private String Fname;
	private String Lname;

	public Studenttt(Integer no, String fname, String lname) {
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
		return "Studenttt [no=" + no + ", Fname=" + Fname + ", Lname=" + Lname + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Studenttt s = (Studenttt) obj;
		if (this.getNo().equals(s.getNo()) && this.getFname().equals(s.getFname())
				&& this.getLname().equals(s.getLname())) {
			return true;

		}
		return false;
	}

	@Override
	public int compareTo(Studenttt o) {
//		 return this.compareTo(o);
		Integer i = this.getNo();
		Integer i1 = o.getNo();
		if (i > i1) {
			return +1;
		} else {
			if (this.equals(o)) {
				return 0;
			}
			return -1;
		}

	}
}
