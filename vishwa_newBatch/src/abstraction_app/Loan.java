package abstraction_app;

abstract public class Loan {

	public void kycDetails() {
		System.out.println("KYC: Pan, Adhar, photo soft copy");
	}
	
	abstract void myLoan();
}
