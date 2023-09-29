package hashmap_1_2;

import java.util.HashMap;

public class HashmapDemo {
	public static void main(String[] args) {
// new value add keli tr map made ti store hoil, pan return kartana old karel
// tya sathi key same asel tar, mhanje ekach key la parat value assign keli tar
		HashMap<Integer, String> map = new HashMap<>();
		map.put(45, "nana");
		String ss = map.put(45, "ZARA");
		System.out.println(ss); //nana
		
		map.put(3, "vinayak");
		
		String s = map.put(2, "nirmal"); // return value
		System.out.println(s); // null
		
		String s1 = map.put(2, "vishwa");
		System.out.println(s1);// nirmal

		map.put(22, "mani");

		System.out.println(map);

		String s5 = map.get(3);//mala  key dya ,value return karel
		System.out.println(s5);

		String s6 = map.get(2);
		System.out.println(s6);

		String s7 = map.get(9); // key nahi mhanun null
		System.out.println(s7);

		String sss = map.get(45);
		System.out.println(sss);

	}
}
