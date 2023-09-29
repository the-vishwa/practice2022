package TreeSet_27_1;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class StudTreeSetAdded {
	public static void main(String[] args) {

		List<Studenttt> list = new ArrayList<>();
		list.add(new Studenttt(12, "ratanji", "tata"));
		list.add(new Studenttt(15, "sachinji", "lagad"));
		list.add(new Studenttt(1, "sudhanshuji", "trivedi"));
		list.add(new Studenttt(12, "anandji", "mahindra"));
		list.add(new Studenttt(1, "sudhanshuji", "trivedi"));
		list.add(new Studenttt(31, "sureshji", "chauvhan"));// 6

		TreeSet<Studenttt> tree = new TreeSet<>(list);
		List<Studenttt> list1 = new ArrayList<>(tree);

		for (Studenttt s : list1) {
			System.out.println(s);
		}

	}
}
