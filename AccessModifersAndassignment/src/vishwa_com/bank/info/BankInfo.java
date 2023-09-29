package vishwa_com.bank.info;

public class BankInfo {

	public Bank[] getBankInfo() {

		Bank[] bnk = new Bank[4];

		bnk[0] = new Bank("ICICI", "Vishwa", 111);
		bnk[1] = new Bank("HDFC", "nirmal", 222);
		bnk[2] = new Bank("SBI", "premjit", 333);
		bnk[3] = new Bank("UNION", "kuldip", 444);
		return bnk;

		
		
	}

}
