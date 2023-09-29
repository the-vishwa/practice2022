package nirmal_set_get;

public class ShowInfo {

	
	public CompayInfo[] getcompanyinfo() {
		CompayInfo[] arr = new CompayInfo[4];

		arr[0] = new CompayInfo("infosys", "multiple", 'a');
		arr[1] = new CompayInfo("tcs", "limited", 'a');
		arr[2] = new CompayInfo("wipro", "limited", 'a');
		arr[3] = new CompayInfo("cisco", "multiple", 'a');

		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getCompanName());
			System.out.println(arr[i].getCompanyEmployee());
			System.out.println(arr[i].getCompanyGrade());
			System.out.println("-------------------------------------");

		}


		return arr;

	}

}
