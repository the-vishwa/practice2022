package vishwa_21_12_methods_retutype;

public class Object_creation_Of_string {

	public static void main(String[] args) {
		String str = "vishwa";
		String str1 = String.valueOf("vishwa");
		String str2= new String("vishwa");
		String str3= new String();
		
		
		System.out.println("___________________________________________");

		
		
		
		// just for an example 
		
		// String strr = String.valueOf(false);
		//String strr="false";  // in string formate boolean
		String strrr = "vishwa";
		String strr = String.valueOf(false);
		
		System.out.println(strr);
		
		System.out.println(strr instanceof String );
		// both are same line no 22 and line no 24
		 boolean b =strr instanceof String;
		System.out.println(b);
		
	}
	
	
	
}
