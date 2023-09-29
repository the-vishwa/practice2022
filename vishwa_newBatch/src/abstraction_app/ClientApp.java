package abstraction_app;

import java.util.Scanner;

public class ClientApp {

	public static void main(String[] args) {

		System.out.println("---------Loan Service --------");
		System.out.println("1 .  Home Loan");
		System.out.println("2 .  Car Loan ");
		System.out.println("3 .  Education Loan");
		System.out.println("please enter loan number");

		Scanner sc = new Scanner(System.in);
//		int serviceloan = sc.nextInt();
//
//		// Loan loan = null;
//
//		if (serviceloan == 1) {
//			Loan a = new HomeLoan();
//			a.myLoan();
//			a.kycDetails();
//		} else if (serviceloan == 2) {
//			Loan a = new CarLoan();
//			a.myLoan();
//			a.kycDetails();
//		} else if (serviceloan == 3) {
//			Loan a = new EducationLoan();
//			a.myLoan();
//			a.kycDetails();
//		} else {
//			System.out.println("no loan service");
//		}
//	}
//}
//

		Integer loanNumber = sc.nextInt();
		Loan loan = null;

		if (loanNumber != null && loanNumber <= 4) {

			if (loanNumber == 1) {
				loan = new HomeLoan();
				loan.kycDetails();
				loan.myLoan();
			} else if (loanNumber == 2) {
				loan = new CarLoan();
				loan.kycDetails();
				loan.myLoan();

			} else if (loanNumber == 3) {
				loan = new EducationLoan();
				loan.kycDetails();
				loan.myLoan();
			}
			else {
				System.out.println("sorry....");
			}
		}

	}
}