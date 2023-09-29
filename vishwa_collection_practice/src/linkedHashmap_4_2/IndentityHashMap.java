package linkedHashmap_4_2;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IndentityHashMap {
	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();
// here value will be update
//		map.put("vishwa", 547575);
//		map.put("vishwa", 464646);
		
// here value will be update
//		String s1 = new String("vishwa");	
//		String s2 = new String("vishwa");	
		
// here value will be update
//		String s1= "vishwa"; 
//		String s2= "vishwa"; 

//		map.put(s1, 4546);
//		map.put(s2, 67676);

		System.out.println(map.size());
		System.out.println(map);

System.out.println("_______________________________________");

IdentityHashMap<String, Integer> idmap = new IdentityHashMap<>();

// here value will be update
//		idmap.put("arjuna", 2334);
//		idmap.put("arjuna", 6060);

// here value will not be update
//		String s= new String("arjuna");
//		String ss=new String("arjuna");

// here value will be update
		String s = "arjuna";
		String ss = "arjuna";

		idmap.put(s, 7878);
		idmap.put(ss, 565656);

		System.out.println(idmap.size());
		System.out.println(idmap);

	}
}
