package TreeSetExample;

import java.util.TreeSet;

public class FreshController {

	public static void main(String[] args) {
		TreeSet<Fresher> trees = new TreeSet<>();
		trees.add(new Fresher(5, "vishwa", "rajput"));
		trees.add(new Fresher(5, "vishwa", "rajput"));
		trees.add(new Fresher(2, "premjit", "sisodiya"));
		trees.add(new Fresher(2, "nirmal", "Jadhav"));
		trees.add(new Fresher(7, "kuldip", "girase"));
		trees.add(new Fresher(1, "kuldip", "patil")); 
		trees.add(new Fresher(4, "darpan", "girase"));
		trees.add(new Fresher(4, "darpan", "jadeja")); 
		
		for (Fresher fs : trees) {
			System.out.println(fs);
			}
	}
}