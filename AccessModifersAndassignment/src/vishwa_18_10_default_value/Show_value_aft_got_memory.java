package vishwa_18_10_default_value;

public class Show_value_aft_got_memory {

	int[] arr1;
	String[] arr2;
	double[] arr3;

	static char[] arr4;
	static student[] arr5;

	void m1() {
//		int[] arr1 = new int[2];
//		String[] arr2 = new String[2];
//		
//		System.out.println(arr1[1]);
//		System.out.println(arr2[1]);

	}

	public static void main(String[] args) {

		Show_value_aft_got_memory sh = new Show_value_aft_got_memory();

		sh.arr1 = new int[2];
		sh.arr2 = new String[2];
		sh.arr3 = new double[2];
		Show_value_aft_got_memory.arr4 = new char[2];
		Show_value_aft_got_memory.arr5 = new student[2];
		sh.m1();

// aft getting memory primtype int,short,long,byte will get 0 as a default value

		System.out.println(sh.arr1[1]);
		System.out.println(sh.arr2[1]);
		System.out.println(sh.arr3[1]);
		System.out.println(Show_value_aft_got_memory.arr4[1]);
		System.out.println(Show_value_aft_got_memory.arr5[1]);

	}
}

class student {
}