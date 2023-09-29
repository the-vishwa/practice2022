package vishwa_com.bank.show.info;

import vishwa_com.bank.info.Bank;
import vishwa_com.bank.info.BankInfo;

public class ShowBankInfo {

	public static void main(String[] args) {
		BankInfo bnkinfo = new BankInfo();
		Bank[] Barray = bnkinfo.getBankInfo();

		//// here want to access method and that property

		for (int i = 0; i < Barray.length; i++) {

			System.out.println(Barray[i].getBankName());
			System.out.println(Barray[i].getEmployeeName());
			System.out.println(Barray[i].getEmpId());
			System.out.println("______________");

		}

	}
}
