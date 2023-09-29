package vishwa_array_3_10;

public class ShowUp {

	void PrintData(Player p) {

		System.out.println(p.name);
		System.out.println(p.jercyNo);

		for (int i = 0; i < p.mts.length; i++) {

			System.out.println(p.mts[i].played);
			System.out.println(p.mts[i].score);

		}

	}

}
