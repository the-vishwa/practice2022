 package rwl_16_10_2022;

public class BankServices {
	
	
	double getBalance() {
		
		return 3456.00;
	}

	// account status
	
	boolean isActiveAccount(long accountNumber) {
		//  logic
		return true;
	}
	
	boolean amountTrasnperLimit(double amt) {
		// logic
		return true;
	}
	
	boolean isSufficientFund(double fundAmtTrsn) {
		
		boolean r = fundAmtTrsn <= getBalance();
		return r;
		
	}
}
