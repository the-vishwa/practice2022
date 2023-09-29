package vishwa_othres;

public class Controllr_Of_S_M {

	public static void main(String[] args) {
		Student_11 a = new Student_11();
		a.name = "vishwa";
		Student_11 b = new Student_11();
		b.name = "nirmal";
		Student_11 c = new Student_11();
		c.name = "kuldip";
		Student_11 d = new Student_11();
		d.name = "premjit";

		Marks l = new Marks();
		l.subName = "english";
		l.score = 90;
		Marks m = new Marks();
		m.subName = "marathi";
		m.score = 80;
		Marks n = new Marks();
		n.subName = "hindi";
		n.score = 70;
		Marks o = new Marks();
		o.subName = "sanskrit";
		o.score = 60;
		Marks[] Marray = { l, m, n, o };
		Student_11[] STarray = { a, b, c, d };

		for (int i = 0; i < STarray.length; i++) {
			System.out.println(STarray[i].name);
			System.out.println();
			for (int j = 0; j < Marray.length; j++) {

				System.out.print(Marray[j].subName);
				System.out.print("-");
				System.out.println(Marray[j].score);
			}
			System.out.println("__________");
		}

	}

}
