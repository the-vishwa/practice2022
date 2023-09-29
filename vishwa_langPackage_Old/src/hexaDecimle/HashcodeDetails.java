package hexaDecimle;

public class HashcodeDetails {

	int id;
	String ab;

	public HashcodeDetails() {

	}

	public HashcodeDetails(int id, String ab) {
		this.id = id;
		this.ab = ab;
	}

//	@Override
//	public int hashCode() {
//		return this.id;
//	}

	public static void main(String[] args) {

		HashcodeDetails h = new HashcodeDetails(10, "abc");
		System.out.println("--hashcode--");
		System.out.println(h.hashCode());

		System.out.println("--hashcode in hexaformate--");
		System.out.println(Integer.toHexString(h.hashCode()));
		System.out.println("--fully qualified name with hexa with tostring-");
		System.out.println(h);
		System.out.println("--same as above --");
		System.out.println(h.toString());
		System.out.println("---self created hexformate qualified name-");
		System.out.println(h.getClass().getName() + "@" + Integer.toHexString(h.hashCode()));

//		Class c= h.getClass();
//		System.out.println(c.getConstructors());

	}

}
