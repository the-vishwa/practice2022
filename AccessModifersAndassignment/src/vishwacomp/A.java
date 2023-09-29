package vishwacomp;

 class C {
	
}
class B{
	
	B(){
		C c = new C();
	}
	
}
public class A{
public static void main(String[] args) {
	//C c = new C();
	B b = new B();
}	

}