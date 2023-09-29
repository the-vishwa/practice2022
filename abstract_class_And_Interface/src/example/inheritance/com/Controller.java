package example.inheritance.com;

class A {

}

class B extends A {

}

class C extends B {

}

class M {
}

class N {
}

class D extends M,N{

}

public class Controller {
public static void main(String[] args) {
	C c= new C();
}
}
