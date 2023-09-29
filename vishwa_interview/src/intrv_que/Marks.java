package intrv_que;

public class Marks {
	Integer score;
	String sub;
	public Marks(Integer score, String sub) {
		super();
		this.score = score;
		this.sub = sub;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	@Override
	public String toString() {
		return "Marks [score=" + score + ", sub=" + sub + "]";
	}
	
	
	
}
