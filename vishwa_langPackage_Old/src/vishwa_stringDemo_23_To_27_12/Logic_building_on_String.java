package vishwa_stringDemo_23_To_27_12;

class Example {

	public Integer countStringlength(String str) {
		int count = 0;
		char[] arr = str.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			count++;
		}
		return count;

	}

}

public class Logic_building_on_String {
	public static void main(String[] args) {
		Example e = new Example();
		e.countStringlength("vishwajeetsing rajput");
		System.out.println(e.countStringlength("vishwajeetsing rajput"));
	}
}
