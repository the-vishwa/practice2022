package treeSet_with_comparator;

import java.util.TreeSet;

public class RwlEmpController {
public static void main(String[] args) {
	//Que:-  remove duplicate objects and sort by length and if same length, sort by alphabets.?
				TreeSet<Rwl_Employee> tr = new TreeSet<>();
				tr.add(new Rwl_Employee(12, "xyz"));
				tr.add(new Rwl_Employee(1, "abc"));
				tr.add(new Rwl_Employee(0, "vishwajitsinh"));
				tr.add(new Rwl_Employee(0, "vishwajit"));
				tr.add(new Rwl_Employee(0, "vishwajitsinh"));
				tr.add(new Rwl_Employee(7, "vishwajitsinhRajput"));
				tr.add(new Rwl_Employee(7, "cishwajitsinhRajputtt"));
				for (Rwl_Employee rwl : tr) {
					System.out.println(rwl);
				}
}
}
