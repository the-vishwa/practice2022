package arryalistAndlist;

import java.util.ArrayList;
import java.util.List;

public class StudController {
	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();
		list.add(new Student(12, "vishwa", 60.50));
		list.add(new Student(13, "nirmal", 70.50));
		list.add(new Student(24, "piyush", 75.50));
		list.add(new Student(15, "aakash", 80.50));

		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);

			if (s.getPercentge() >= 75) {

				System.out.println(s);
			}
		}

	}
}
