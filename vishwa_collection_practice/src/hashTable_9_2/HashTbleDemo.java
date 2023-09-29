package hashTable_9_2;

import java.util.Hashtable;

public class HashTbleDemo {
public static void main(String[] args) {
	
	Hashtable<Integer, String> hash =new Hashtable<>();
	
	String s1 = hash.put(1, "badal");
	System.out.println(s1);
	
	//hash.put(2, null);  null insertion not allow
	String s = hash.put(1, "megha");
	System.out.println(s);
	System.out.println(hash);
	
	
	
	
	
	
}
}
