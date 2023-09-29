package treeSet_with_comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class SortStringbylength {
	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<>(new MyOwnSorting());
//		tree.add("abc");
//		tree.add("abcefghj");
//		tree.add("pbcefghjd");
//		tree.add("lmno");
//		tree.add("lmn");
//		tree.add("bcd");
		
		tree.add("abcefghj");
		tree.add("pbcefghjd");
		tree.add("lmn");
		tree.add("bmn");
		tree.add("bbhggfgggbmn");
		
		for (String v : tree) {
			System.out.println(v);
		}
}
}
class MyOwnSorting implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
//		int ii = o1.compareTo(o2);
//		return ii;
		if(o1.length() > o2.length()) {
			return -1;
		}else if (o1.length() < o2.length()){
			return 1;
		}else {
			return o1.compareTo(o2);
		}
		//return 1;  // keep as it is with insertion order
	}
	
}