package vvvv;

public class School {
	private String sname;
	private Address adr1;
	
	public  School(){}

	public School(String sname, Address adr1) {
		super();
		this.sname = sname;
		this.adr1 = adr1;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Address getAdr1() {
		return adr1;
	}

	public void setAdr1(Address adr1) {
		this.adr1 = adr1;
	}
}
