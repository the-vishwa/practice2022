package vishwa_18_10_default_value;

public class Default_value {

	byte b;
	int i;
	short s;
	long l;
	float f;
	double d;
	char c;
	boolean bb;

	String name;
	A a;
	int[] arr1;
	String[] arr3;
	//float[] arr4;

	
	// static variable and instance variable deafult value are saame
	
	public static void main(String[] args) {
		Default_value default_value = new Default_value();
		
		System.out.println(default_value.b);//0
		System.out.println(default_value.i);//0
		System.out.println(default_value.l);//0
		System.out.println(default_value.f);//0.0
		System.out.println(default_value.d);//0.0
		System.out.println(default_value.c); // single space
		System.out.println(default_value.bb);// false
		System.out.println(default_value.name);//null
		System.out.println(default_value.a);//null
		System.out.println(default_value.arr1);//null
		System.out.println(default_value.arr3);//null
		//System.out.println(default_value.arr4);//null
		
	}
}
class A{}