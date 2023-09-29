package vishwa_array_3_10;

public class SMcontrollr {

	public static void main(String[] args) {
		Student[] Sarray = new Student[3]; // {"vishwa","nirmal","kuldip"};

		Student x = new Student();
		x.name = "vishwa";
		x.rollNumber = 1;

		Sarray[0] = x;

		Student y = new Student();
		y.name = "nirmal";
		y.rollNumber = 2;
		Sarray[1] = y;

		Student z = new Student();
		z.name = "kuldip";
		z.rollNumber = 3;
		Sarray[2] = z;

		Marks[] Marray = new Marks[2];

		Marks m1 = new Marks();
		m1.subName = "english";
		m1.score = 95;
		Marray[0] = m1;

		Marks m2 = new Marks();
		m2.subName = "history";
		m2.score = 95;
		Marray[1] = m2;

		x.mks = Marray;
		y.mks = Marray;
		z.mks = Marray;
		
//		for (int j = 0; j < Sarray.length; j++) {
//
//			System.out.println(Sarray[j].name);
//			System.out.println(Sarray[j].rollNumber);
//			for (int i = 0; i < Marray.length; i++) {
//				System.out.println(Marray[i].subName);
//				System.out.println(Marray[i].score);
//			}
//			System.out.println("____");
//		}
		
		

		for (int j = 0; j < Sarray.length; j++) {
			System.out.println(Sarray[j].name);
			System.out.println(Sarray[j].rollNumber);
			for (int i = 0; i < Sarray[j].mks.length; i++) {
				System.out.print(Sarray[j].mks[i].subName);
				System.out.print("-");
				System.out.println(Sarray[j].mks[i].score);

			}
			System.out.println("___________________");
		}

	}
}
