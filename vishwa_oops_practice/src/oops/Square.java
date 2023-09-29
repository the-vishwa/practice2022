package oops;
//abstract class AAAAA{
//	abstract void m6();
//	void m7() {}
//}

// que ==calculatge the area and perimetr of square.?
public class Square {
	static int side;
	static int perimeter;

	static int areaaa() {
		int area = side * side;
		return area;            // Cannot make a static reference to the non-static field area
	}

	static int perimeterrr() {
		return 4 * side; 
	}

	public static void main(String[] args) {
		Square.side = 4;
		System.out.println(areaaa());
		System.out.println(perimeterrr());

	}
}
