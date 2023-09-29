package FreqUencyCount;

import java.util.ArrayList;
import java.util.List;

public class IsPresent {
	public static Boolean isExist(List<Integer> li, Integer element) {

		for (Integer o : li) {
			if(element.equals(o)) {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 100, 200, 300, 100, 500, 200, 100, 100, 200, 400, 600 };
		List<Integer> outPut = new ArrayList<>();
		for (Integer i : arr) {
			outPut.add(i);
		}
		
		System.out.println(isExist(outPut, 23));
		
	}
}
