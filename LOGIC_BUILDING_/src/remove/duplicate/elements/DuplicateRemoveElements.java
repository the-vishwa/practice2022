package remove.duplicate.elements;

import java.util.LinkedHashSet;

public class DuplicateRemoveElements {
public static void main(String[] args) {
	// with readymade class
	int[] arr = {7,8,5,4,7,8,1,6,7,4,2,1,9,3};
	
	LinkedHashSet<Integer> set = new LinkedHashSet<>();
	for (int i : arr) {
		set.add(i);
	}
	System.out.println(set);
	}
}
