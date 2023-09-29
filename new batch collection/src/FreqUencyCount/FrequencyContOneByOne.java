package FreqUencyCount;

import java.util.ArrayList;
import java.util.List;

public class FrequencyContOneByOne {

	public static int count(List<Integer> list, Integer num) {
		int ct=0;
		for (int i = 0; i < list.size(); i++) {
			Integer v =  list.get(i);
			if(v.equals(num)) {
				ct++;
			}

		}

		return ct;
	}

	public static void main(String[] args) {

		List<Integer> list = new ArrayList();
		list.add(100);
		list.add(100);
		list.add(200);
		list.add(100);
		list.add(500);
		list.add(300);
		list.add(300);

		System.out.println(count(list, 300));
	}
}
