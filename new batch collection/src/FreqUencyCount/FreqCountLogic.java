package FreqUencyCount;

import java.util.ArrayList;
import java.util.List;

public class FreqCountLogic {

	public static Boolean isExist(List<OutputFormat> li, Integer element) {

		for (int i = 0; i < li.size(); i++) {
			OutputFormat o = li.get(i);
			if (o.getElement().equals(element)) {
				Integer count = o.getCount();
				count++;
				o.setCount(count);
				return true;
			}

		}

		return false;
	}

	public static List<OutputFormat> countEle(List<Integer> list) {
		List<OutputFormat> output = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (isExist(output, list.get(i))) {

			} else {
				OutputFormat o = new OutputFormat();
				o.setElement(list.get(i));
				o.setCount(1);
				output.add(o);
			}
		}

		return output;
	}

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(100);
		list.add(200);
		list.add(100);
		list.add(500);
		list.add(300);
		list.add(300);

		List<OutputFormat> result = countEle(list);

		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}

	}

}
