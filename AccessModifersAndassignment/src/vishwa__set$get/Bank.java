package vishwa__set$get;

public class Bank {

	private String bankName;
	private String branchName;
	private int toplist;

	Bank() {
	} // if u take param constructr then u must have to take zero arg constructor

	public Bank(String bankName, String branchName, int toplist) { // param constructor

		this.bankName = bankName;
		this.branchName = branchName;
		this.toplist = toplist;
	}

	public Bank[] getBankinfo() {

		Bank[] bankk = new Bank[4];
		bankk[0] = new Bank("ICICI", "pune", 1);
		bankk[1] = new Bank("SBI", "mumbai", 2);
		bankk[2] = new Bank("HDFC", "delhi", 3);
		bankk[3] = new Bank("UNION", "dondaicha", 4);
		return bankk;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public int getToplist() {
		return toplist;
	}

	public void setToplist(int toplist) {
		this.toplist = toplist;
	}

}
