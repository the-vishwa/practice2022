package treeMap_8_2;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreemapDemo {
public static void main(String[] args) {
	
	TreeMap<Integer, String> tree = new TreeMap<>();
	
	tree.put(11, "nana");
	tree.put(1, "master");
	tree.put(21, "guruji");
	tree.put(15, "teacher");
	
	
	//System.out.println(tree);
	
	
	
	Collection<String> coll=tree.values();
	System.out.println(coll);//values
	
	Set<Integer>set= tree.keySet();
	System.out.println(set); // keys
	
	Iterator<Integer> itr = set.iterator();
	while (itr.hasNext()) {
		Integer key = itr.next();
		String value=tree.get(key);
		System.out.println(key+"="+value);

	}
	
	System.out.println("--------------------");
	
	Set<Entry<Integer,String>> entry = tree.entrySet();
	
	for (Entry<Integer, String> ent : entry) {
		System.out.println(ent.getKey()+"="+ent.getValue());
		
	}
}
}

