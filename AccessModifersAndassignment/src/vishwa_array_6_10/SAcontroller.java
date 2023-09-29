package vishwa_array_6_10;

public class SAcontroller {

	public static void main(String[] args) {

		// here we can cut this strng array
		// String_array[] array = new String_array[3];

		String_array x = new String_array();
		x.name = "vishwa";
		x.contact = 1234567890l;
		x.M_id = "abc@gmail.com";
		// array[0]=x;

		String_array y = new String_array();
		y.name = "nirmal";
		y.contact = 1234567890l;
		y.M_id = "xyz@gmail.com";
		// array[1]=y;

		String_array z = new String_array();
		z.name = "kuldip";
		z.contact = 1234567890l;
		z.M_id = "lmn@gmail.com";
		// array[2]=z;

		// and paste here then cut the object and put the variable in object
		String_array[] array = { x, y, z };

//	     System.out.println(array[0].name);
//	     System.out.println(array[0].contact);
//	     System.out.println(array[0].M_id);
//	     
//i cant take efforts to create alot of sysout then simple way i use loop

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i].name);
			System.out.println(array[i].contact);
			System.out.println(array[i].M_id);
			System.out.println("____________");
		}
//** i want in another way like vishwa,1234567890abc@,gmail.com

//or 	     

	}

}
