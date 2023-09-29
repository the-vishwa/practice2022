package Treeset_comprator_comparable_diffrence;

import java.util.Comparator;

public class Rwl_Students implements Comparator<Rwl_Students> {
	private Integer rollNum;
	private String name;
	private String lastName;

	public Rwl_Students() {
	}

	public Rwl_Students(Integer rollNum, String name, String lastName) {
		super();
		this.rollNum = rollNum;
		this.name = name;
		this.lastName = lastName;
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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "[" + rollNum + "]-" + name + ", " + lastName + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Rwl_Students sss = (Rwl_Students) obj;
		if (this.getRollNum().equals(sss.rollNum) && this.getName().equals(sss.name)
				&& this.getLastName().equals(sss.lastName)) {
			return true;
		}

		return false;
	}

	@Override
	public int compare(Rwl_Students o1, Rwl_Students o2) {
		if (o1.name.length() > o2.name.length()) {
			return -1;
		} else if (o1.name.length() < o2.name.length()) {
			return 1;
		} else {
			if (o1.equals(o2)) {
				return 0;
			} else {
				return o1.name.compareTo(o2.name);
			}

		}
	}
}
