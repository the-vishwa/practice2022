package method_overloading;

public class Auto_boxing_auto_unboxing {
	
	void m1(int a, int b) {
		System.out.println("int");
		
	}
	void m1(Integer a,Integer b) {
		System.out.println("i am integer");
		
	}
	void m1(Float a,Float b) {
		System.out.println("i am integer");
		
	}
	
	public static void main(String[] args) {
		Auto_boxing_auto_unboxing at = new Auto_boxing_auto_unboxing();
		Integer i =10;
		Integer j= 20;
		at.m1(i, j); //  
		
//		int x = 10;
//		int y= 10;
//		at.m1(x, y);// 
		
	}
}
