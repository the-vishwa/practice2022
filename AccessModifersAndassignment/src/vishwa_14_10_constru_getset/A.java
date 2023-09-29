package vishwa_14_10_constru_getset;

public class A {

	int a;
	int b;
	
	A(){}
	
	A(int x,int y){
		 a=x;
  	     b=y;
		System.out.println(x);
		System.out.println(y);
	}
	
	void m1(int x,int y) {

		a=x;
		b=y;
	}
}
