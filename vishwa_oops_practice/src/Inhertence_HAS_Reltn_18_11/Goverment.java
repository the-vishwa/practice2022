package Inhertence_HAS_Reltn_18_11;

//strong association
//anadar kuch method h o jis ko method chahiye o c.method cll kardega 
//jis ko method chahiye o b.method cll kardega
//inheritance
//Composition
class BJP {
	MLA mla;
	MP mp;

	void party(MLA mla, MP mp) {
		MLA m = new MLA();
		m.mlaCounts(100, 100);
		MP m1 = new MP();
		m1.mpCounts(50, 50);
	}
}

class MLA {
	void mlaCounts(int a, int b) {
		System.out.println(a + b);
	}

}

class MP {
	void mpCounts(int a, int b) {
		System.out.println(a + b);
	}

}

class Maharashtra {
	int a;
	int b;

}

public class Goverment {
	public static void main(String[] args) {
		MLA m = new MLA();
		MP m1 = new MP();
		BJP b = new BJP();
		b.party(m, m1);

	}
}
