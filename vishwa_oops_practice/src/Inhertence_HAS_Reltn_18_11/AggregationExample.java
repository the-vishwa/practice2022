package Inhertence_HAS_Reltn_18_11;

import java.util.ArrayList;
import java.util.List;

class MLASs {
	private String malsName;
	private int malId;

	public MLASs(String malsName, int malId) {
		this.malsName = malsName;
		this.malId = malId;
	}

}

class BhartiyaJAnataP {
	private String partyName;
	private List<MLASs> list; // Aggregation - BhartiyaJAnataP has mals

	public BhartiyaJAnataP(String partyName) {
		this.partyName = partyName;
		this.list = new ArrayList<>();
	}

	public void addMLASs(MLASs mls) {
		list.add(mls);
	}

}

public class AggregationExample {
	public static void main(String[] args) {
		BhartiyaJAnataP party = new BhartiyaJAnataP("BJP party");

		MLASs m1 = new MLASs("vishwa", 101);
		MLASs m2 = new MLASs("vinayak", 102);

		party.addMLASs(m1);
		party.addMLASs(m2);

	}

}
