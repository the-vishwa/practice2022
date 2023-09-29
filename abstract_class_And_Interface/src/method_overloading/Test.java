package method_overloading;

public class Test {

	public void m1(int a, int b) {} // m1(int,int)
	
//	public int m1(int x, int y) {  // m1(int,int)
//		return 0;
//	}
	
	public void m1(int a, int b, int c) {}// m1(int,int,int)
	
	public void m1(float f, int a) {} // m1(float,int)
	
	public void m1(int a, float b) {} // m1(int,float)
	
	// method overloadding  >>  1] method name should same
	                          //2] parameter should be diff
	                          //  1] count, data type diff, sequence
	
	
	
}
