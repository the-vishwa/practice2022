package vvvv;

public class Ab {

	 Number m1(int a) {
		int sum = 0;
		for (int i = 1; i <= a; i=i+1) {
			sum = sum + a;
		}
		System.out.println(sum);
		return 0;
	}
	
	public static void main(String[] args) {
		Ab a = new Bb();
		a.m1(5);
		
		Bb b = new Bb();
		b.m1(3, 4);
		b.m1(10);
		
		}
}
class Bb extends Ab{
	
	void m1(int a,int c) {
		System.out.println(a*c);
	}
	
	 Integer m1(int a) {
		System.out.println(a*a);
		
		return 0;
	}
	
	
	
}