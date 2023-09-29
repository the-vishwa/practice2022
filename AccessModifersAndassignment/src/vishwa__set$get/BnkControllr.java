package vishwa__set$get;

public class BnkControllr {

	public static void main(String[] args) {
//		Bank[] bank = new Bank[4];
//		bank[0] = new Bank("ICICI", "pune", 1);
//		bank[1] = new Bank("SBI", "mumbai", 2);
//		bank[2] = new Bank("HDFC", "delhi", 3);
//		bank[3] = new Bank("UNION", "dondaicha", 4);
		
		// OR with method see line no 19 in Bank class

		Bank banks = new Bank();
		                                                                //String a=banks.getBankName();
		                                                                //System.out.println(banks.getBankName());
	   Bank[] bkbk = banks.getBankinfo();
		
		for (int i = 0; i < bkbk.length; i++) {
			System.out.println(bkbk[i].getBankName());
			System.out.println(bkbk[i].getBranchName());
			System.out.println(bkbk[i].getToplist());
			System.out.println("_______________________");
		}
		// iiif somone says that there is an another bank on 2no.?

	}

}
