package SET_Impl_classess;

public class Address {
	private String line1;
	private String line2;
	private Integer line3;

	public Address() {
	}

	public Address(String line1, String line2, Integer line3) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.line3 = line3;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public Integer getLine3() {
		return line3;
	}

	public void setLine3(Integer line3) {
		this.line3 = line3;
	}

	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", line2=" + line2 + ", line3=" + line3 + "]";
	}

	@Override
	public int hashCode() {
		return this.line1.hashCode() + this.line2.hashCode() + this.line3.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Address adr = (Address) obj;
		if (this.getLine1().equals(adr.line1) && this.getLine2().equals(adr.line2)
				&& this.getLine3().equals(adr.line3)) {
			return true;
		}
		return false;
	}

}

