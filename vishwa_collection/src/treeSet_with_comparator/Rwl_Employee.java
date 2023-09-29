package treeSet_with_comparator;

public class Rwl_Employee implements Comparable<Rwl_Employee> {
	private Integer rollNum;
	private String name;

	public Rwl_Employee() {
	}

	public Rwl_Employee(Integer rollNum, String name) {
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
		return "[" + rollNum + ", name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Rwl_Employee sss = (Rwl_Employee) obj;
		if (this.getRollNum().equals(sss.rollNum) && this.getName().equals(sss.name)) {
			return true;
		}

		return false;
	}

	@Override
	public int compareTo(Rwl_Employee o) {
		if (this.name.length() > o.name.length()) {
			return -1;
		} else if (this.name.length() < o.name.length()) {
			return 1;
		} else {
			if (this.equals(o)) {
				return 0;
			} else {
				return  this.name.compareTo(o.name);
			}
		}
	}
}