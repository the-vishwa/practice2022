package method_overloading;

public class AutomaticPramotion {

	void m1(float f1) {
		System.out.println("float");
	}
//	
//	void m1(short a) {
//		System.out.println("short");
//	}
	
//	void m1(double a) {
//	System.out.println("double");
	
	
//	void m1(int a, float f) {
//		System.out.println("int , float");
//	}
//	
//	void m1(float f, int a) {
//		System.out.println("float , int");
//	}
//	
	
	public void m1(int a, float f) {
		System.out.println("int float");
	}
	
	public void m1(float f, double d) {
		System.out.println("float , double");
	}
	
	
	
}
	
	

