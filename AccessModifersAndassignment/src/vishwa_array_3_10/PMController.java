package vishwa_array_3_10;

public class PMController {

	public static void main(String[] args) {

		Player p = new Player();
		p.name = "sachin";
		p.jercyNo = 10;

		matches[] play = new matches[2];

		matches ma1 = new matches();
		ma1.played = "Odi";
		ma1.score = 100;
		play[0] = ma1;

		matches ma2 = new matches();
		ma2.played = "T20";
		ma2.score = 50;
		play[1] = ma2;

		p.mts = play;

		// System.out.println(p.name);
		// System.out.println(p.jercyNo);
		// System.out.println(play[0].played);
		// System.out.println(play[0].score);

		// System.out.println(play[1].played);
		// System.out.println(play[1].score);

		// for(int i = 0; i< p.mts.length; i++) {

		// System.out.println(p.mts[i].played);
		// System.out.println(p.mts[i].score);

		ShowUp show = new ShowUp();
		show.PrintData(p);
		//

		// }

	}
}
