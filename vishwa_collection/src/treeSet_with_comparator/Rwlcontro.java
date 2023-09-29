package treeSet_with_comparator;

import java.util.TreeSet;

public class Rwlcontro {
	public static void main(String[] args) {
		//Que:-  remove duplicate objects and sort by length and if same length, sort by alphabets.?
		TreeSet<Rwl_Students> trp = new TreeSet<>(new Rwl_Students());
		trp.add(new Rwl_Students(12, "Bcd","v"));
		trp.add(new Rwl_Students(1, "Abc","r"));
		trp.add(new Rwl_Students(0, "Vishwajitsinh","Rajput"));
		trp.add(new Rwl_Students(0, "Vishwajit","Rajput"));
		trp.add(new Rwl_Students(0, "Vishwajitsinh","Rajput"));
		trp.add(new Rwl_Students(7, "RightWayLearning","RWL"));
		trp.add(new Rwl_Students(9, "xhjgkhfdjgkfdhjdfkghhbjkgvh","RWL"));
		for (Rwl_Students rwl : trp) {
			System.out.println(rwl);
		}

	}

}
