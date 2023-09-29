package assignment1;

import java.util.ArrayList;
import java.util.List;

import FreqUencyCount.OutputFormat;

public class FrequLOgicInShort {
	public static void counter(List<OutputFormat> out, Integer ele) {
		Boolean b = true;
		for (int i = 0; i < out.size(); i++) {
			OutputFormat o = out.get(i);
			if (o.getElement().equals(ele)) {
				System.out.println("oooooooooo");
				Integer value = o.getCount();
				value++;
				o.setCount(value);
				b = false;
				break;
			}
				
		}

		if (b) {
			System.out.println("iffff");
			out.add(new OutputFormat(ele, 1));
		}

	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		List<OutputFormat> out = new ArrayList<>();
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
		for (int i = 0; i < list.size(); i++) {
			counter(out, list.get(i));
		}
		for (int i = 0; i < out.size(); i++) {
			System.out.println(out.get(i));
		}

	}
}
