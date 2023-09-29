package vishwa_array_3_10;

public class EController {

	public static void main(String[] args) {

		Employee[] e = new Employee[3];

		Employee x = new Employee();
		x.name = "vishwa";
		x.empid = 20001;
		// here we declared the valve like 001,002
		// then it will print only last num like 1,2
		e[0] = x;

		Employee y = new Employee();
		y.name = "nirmal";
		y.empid = 20002;
		e[1] = y;

		Employee z = new Employee();
		z.name = "kuldip";
		z.empid = 20003;
		e[2] = z;

		// Employee[] e = {x,y,z};

//	        System.out.println(e[0].name);
//	        System.out.println(e[0].empid);
//	        System.out.println(e[1].name);
//	        System.out.println(e[1].empid);        // first way
//	        System.out.println(e[2].name);
//	        System.out.println(e[2].empid);

		// above one OR using loop
//	
//	    for(int i = 0;i<e.length;i++) {
//		System.out.println(e[i].name);              // second way
//		System.out.println(e[i].empid);
//	    }

		ShowE sh = new ShowE();

		sh.printData(e);

	}
}
