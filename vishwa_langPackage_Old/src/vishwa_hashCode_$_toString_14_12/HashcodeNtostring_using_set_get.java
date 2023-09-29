package vishwa_hashCode_$_toString_14_12;

class Z {

	private Integer x;
	private Integer y;

	Z() {
	}

	public Z(Integer x, Integer y) {
		this.x = x;
		this.y = y;
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Z [x=" + x + ", y=" + y + "]";
		// or  // return  "x=" +this.x  + ",y=" +this.y;
	}
	public int hashCode() {
		return this.x + this.y;
	}
	}
public class HashcodeNtostring_using_set_get {
	public static void main(String[] args) {
		Z z = new Z(2,2);
//		z.setX(3);
//		z.setY(3);
		
		System.out.println(z);
		System.out.println(z.hashCode());
}
}


