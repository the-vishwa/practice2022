package FreqUencyCount;

import java.util.ArrayList;
import java.util.List;

public class FreqCuntOfOutPutformate {

	public static boolean isExistInOutput(List<OutputFormat> out, Integer ele) {
//		for (OutputFormat o : out) {
//			if (o.getElement().equals(ele)) {
//				return true;
//			}
//
//		} // OR

		for (int i = 0; i < out.size(); i++) {
			OutputFormat o = out.get(i);
			if (o.getElement().equals(ele)) {
				return true;

			}
		}

		return false;
	}

	public static void count(List<OutputFormat> list, Integer e) {

		for (OutputFormat o : list) {
			if (o.getElement().equals(e)) {
				Integer i = o.getCount();
				i++;
				o.setCount(i);
				// break;
			}

		}

	}

	public static void main(String[] args) {

		int[] arr = { 100, 200, 300, 100, 500, 200, 100, 100, 200, 400, 600 };
		List<OutputFormat> outPut = new ArrayList<>();
		for (int ele : arr) {
			if (isExistInOutput(outPut, ele)) {
				count(outPut, ele);
			} else {
				outPut.add(new OutputFormat(ele, 1));
			}
		}
		for (OutputFormat o : outPut) {
			System.out.println(o);
		}

	}
}
