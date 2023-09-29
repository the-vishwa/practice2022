package TressSet_26_1;

import java.util.TreeSet;

public class StudController {
public static void main(String[] args) {
	
	TreeSet<Student> st =new TreeSet<>();
	
	st.add(new Student(12, "ratanji", "tata"));
	st.add(new Student(15, "sachinji", "lagad"));
	st.add(new Student(1, "sudhanshuji", "trivedi"));
	st.add(new Student(12, "anandji", "mahindra"));
	st.add(new Student(1, "sudhanshuji", "trivedi"));
	st.add(new Student(31, "sureshji", "chauvhan"));// 6
	
	for (Student s : st) {
		System.out.println(s);
	}
	
}
}
