package vishwa_array_3_10;

public class ShowE {

	void printData(Employee[] e) {

//		System.out.println(e[0].name);
//		System.out.println(e[0].empid);
//		System.out.println(e[1].name);
//		System.out.println(e[1].empid);                // third way
//		System.out.println(e[2].name);
//		System.out.println(e[2].empid);

		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i].name);             // fourth way  
			System.out.println(e[i].empid);
		}

	}
}
