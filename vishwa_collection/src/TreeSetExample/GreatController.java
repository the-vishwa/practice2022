package TreeSetExample;

import java.util.HashSet;
import java.util.TreeSet;

public class GreatController {
public static void main(String[] args) {
	TreeSet<Greatmen> tree = new TreeSet<>();
	tree.add(new Greatmen(12, "ratanji", "tata"));
	tree.add(new Greatmen(15, "sachinji", "lagad"));
	tree.add(new Greatmen(1, "sudhanshuji", "trivedi"));
	tree.add(new Greatmen(12, "anandji", "mahindra"));
	tree.add(new Greatmen(1, "sudhanshuji", "trivedi"));
	tree.add(new Greatmen(31, "sureshji", "chauvhan"));//6
	
	System.out.println(tree.size());
	for (Greatmen g : tree) {
		System.out.println(g);
	}
}
}
