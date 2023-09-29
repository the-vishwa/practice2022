package TreeSetExample;

import java.util.TreeSet;

public class StudController {
	public static void main(String[] args) {
		TreeSet<Studenttt> trees = new TreeSet<>();
//		trees.add(new Students(9, "Vishwa", "Rajput"));
//		trees.add(new Students(6, "Premjit", "Sisodiya"));
//		trees.add(new Students(3, "Nirmal", "Rajput"));
//		trees.add(new Students(5, "Kuldip", "Sisodiya"));
//		trees.add(new Students(1, "Darpan", "Girase"));
//		trees.add(new Students(2, "Indradit", "Jadhav"));
//		trees.add(new Students(7, "prashant", "Patil"));
//		trees.add(new Students(4, "vishwa", "Sisodiya"));
//		trees.add(new Students(8, "prashant", "Patil"));
//		trees.add(new Students(10, "vishwa", "Girase"));
//		trees.add(new Students(10, "vishwa", "Girase"));
//		
		
		
		
		trees.add(new Studenttt(5, "Vishwa", "Rajput"));
		trees.add(new Studenttt(2, "Premjit", "Sisodiya"));
		trees.add(new Studenttt(3, "Nirmal", "Jadhav"));
		trees.add(new Studenttt(1, "Kuldip", "Girase"));
		trees.add(new Studenttt(4, "darpan", "Girase"));
		
		
		
		
		
//		trees.add(new Students(4, "Nirmal", "Rajput"));
//		trees.add(new Students(2, "Premjit", "Sisodiya"));
//		trees.add(new Students(3, "Vishwa", "Rajput"));
//		trees.add(new Students(2, "Kuldip", "Girase"));
		
		for (Studenttt ss : trees) {
			System.out.println(ss);
			}
		
	}

}