package Inhertence_HAS_Reltn_18_11;

class BJPs {

	void party(int a) {
		System.out.println(a);
	}

}

class MLAs {
	int mlaCounts(int a, int b) {
		int i = a - b;
		return i;
	}

}

class MPs {
	int mpCounts(int a, int b) {
		int i1 = a + b;
		return i1;
	}

}

public class India {
	public static void main(String[] args) {
		MLAs ml = new MLAs();
		int r = ml.mlaCounts(400, 100);

		MPs m = new MPs();
		int r1 = m.mpCounts(50, 50);

		BJPs bj = new BJPs();
		bj.party(r);
		bj.party(r1);

	}
}
