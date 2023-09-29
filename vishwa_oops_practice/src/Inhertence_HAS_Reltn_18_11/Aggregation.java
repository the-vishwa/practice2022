package Inhertence_HAS_Reltn_18_11;

// weak association with reusability //  may b this problem is wrong
class Shivsena {
	Shinde s;
	Kesarkar k;

	public Shivsena(Shinde s, Kesarkar k) {
		this.s = s;
		this.k = k;
	}

	void party(int s, int k) {
		System.out.println(s - k);
	}
}

class Shinde {
	void party(int s, int k) {
		System.out.println(s + k);
	}
}

class Kesarkar {
	void party(int s, int k) {
		System.out.println(s + k);
	}
}

public class Aggregation {
	public static void main(String[] args) {
		Shinde sh = new Shinde();
		sh.party(15, 12);

		Kesarkar kk = new Kesarkar();
		kk.party(50, 50);

		Shivsena ss = new Shivsena(sh, kk);
		ss.party(100, 200);

	}

}
