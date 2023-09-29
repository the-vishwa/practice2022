package predicates2;

public class Student {

	String num;
	Double pertg;

	public Student() {
		super();
	}

	public Student(String num, Double pertg) {
		super();
		this.num = num;
		this.pertg = pertg;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public Double getPertg() {
		return pertg;
	}

	public void setPertg(Double pertg) {
		this.pertg = pertg;
	}

	@Override
	public String toString() {
		return "Student [num=" + num + ", pertg=" + pertg + "]";
	}

}
