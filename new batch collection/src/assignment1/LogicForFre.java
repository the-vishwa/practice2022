package assignment1;

import java.util.ArrayList;
import java.util.List;

import FreqUencyCount.OutputFormat;

public class LogicForFre {
	public static boolean isExistInOutput(List<OutputFormat> out, Integer ele) {

		for (int i = 0; i < out.size(); i++) {
			OutputFormat o = out.get(i);
			if (o.getElement().equals(ele)) {
				System.out.println("true sathi");
				return true;

			}
		}

		return false;
	}

	public static void counter(List<OutputFormat> out, Integer ele) {
		for (int i = 0; i < out.size(); i++) {
			OutputFormat o = out.get(i);
			if (o.getElement().equals(ele)) {
				Integer value = o.getCount();
				value++;
				o.setCount(value);
			}
		}

	}

	public static void addList(List<Integer> list) {
		List<OutputFormat> empty = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (!isExistInOutput(empty, list.get(i))) {
				empty.add(new OutputFormat(list.get(i), 1));

			} else {
				counter(empty, list.get(i));

			}

		}
		//Collections.reverse(empty);
		for (OutputFormat print : empty) {
			System.out.println(print);
		}
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(100);
		list.add(100);
		list.add(100);
		list.add(300);
		list.add(300);
		list.add(300);
		list.add(200);
		list.add(200);
		list.add(500);
		addList(list);

//		List<OutputFormat> out = finalResult(list);
//		for (int i = 0; i < out.size(); i++) {
//			System.out.println(out.get(i));
//
//		} // this logic is for when finalResult Method Retuen type is List<OutputFormat>

	}

}
