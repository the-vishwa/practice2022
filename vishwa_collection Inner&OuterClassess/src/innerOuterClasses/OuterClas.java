package innerOuterClasses;

public class OuterClas {
	class Inner {
		void m3() {
		}
	}

	void outClassMethod() {
		Inner inner = new Inner();
		inner.m3();
	}

	public static void main(String[] args) {
		OuterClas o = new OuterClas();
		OuterClas.Inner inner = o.new Inner();
		inner.m3();
	}
}

// inside outer class static area or inside other class if we want to access inner class then we have to create an object of 
// outer class  like 👇
//OuterClas o = new OuterClas();
//OuterClas.Inner  inner = o.new Inner();

// and inside instance properties of  its self outer class we can access inner class properties see 👉 line num 9 to 12;
