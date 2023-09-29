package treeSet_with_comparator;

public class Student {
	private Integer rollNum;
	private String name;

	public Student(Integer rollNum, String name) {
		super();
		this.rollNum = rollNum;
		this.name = name;
	}

	public Integer getRollNum() {
		return rollNum;
	}

	public void setRollNum(Integer rollNum) {
		this.rollNum = rollNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "[" + this.rollNum + " , " + this.name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Student sss = (Student) obj;
		if (this.getRollNum().equals(sss.rollNum) && this.getName().equals(sss.name)) {
			return true;
		}

		return false;
	}
}
