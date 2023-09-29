package rwl_16_10_2022;

public class User {

	public static void main(String[] args) {
		
		BankServices b = new BankServices();
		
		if(b.isSufficientFund(1200.00)) {
			System.out.println("sufficient");
			// write your own logic for fund transper
		}
	}
}
