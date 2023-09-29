package rwl_29_10_2022_aritthmatic;

public class Operations {

	
	public static void main(String[] args) {
		
		int a = 19;
		float b = 2;
		float r = a/b;        // max(int,int,float)  // 9
		System.out.println(r); // 9
		
		double d = 80.90;
		float f =80.91F;
		double r1 = d + f;  // max(int,double,float)
		
		char c = 'A';
		float f2 = 2;  // upcasting
		float r4 = c/f2; // 
		System.out.println(r4);
		
		 double c4= 10 + 20.0;
		 
		 
		 //==============================
		 char ch = 'A';
		 ch = (char)(ch + 1);  // MAX(int, char,int)
		 System.out.println(ch);
		 
		 
		 byte b2 = 10;
		 b2++; // b2 = b2 + 1; // no boss both are diff
		 System.out.println(b2); // 11
		 
		 
		 
		 //-------------------------------
		  int x = 10;
		  int y = x++;
		  System.out.println(x); // 11
		  System.out.println(y);// 10
		 
		  
		  
		  
		  
		  
		  
		  
		  
		  
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}
