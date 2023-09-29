package com.company.info;

public class CompanyInfo {

	 public Company[] getcompanyinfo() {

		Company[] arr = new Company[4];

		arr[0] = new Company("infosys", "mr murthy", "sc kulkarni", 5000);
		arr[1] = new Company("tcs", "jrd tata", "mr ambani", 7000);
		arr[2] = new Company("wipro", "azim premji", "rk gupta", 10000);
		arr[3] = new Company("infosys", "mr sharma", "sc kulkarni", 5000);

		return arr;

	}

}
