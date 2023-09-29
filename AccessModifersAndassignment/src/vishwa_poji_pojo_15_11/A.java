package vishwa_poji_pojo_15_11;
// poji poji is a one design pattrn
interface A {
void  m1(int a,int b); // poji // sum method here
}
class B implements A{
	public void m1(int a, int b) { // pojo
		int c =a+b;
		System.out.println(c);
	}
}
class C implements A{
	public void m1(int a, int b) {
		System.out.println(a-b);
	}
	
}
