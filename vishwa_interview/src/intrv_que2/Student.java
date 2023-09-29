package intrv_que2;



public class Student implements Comparable<Student>{
	private Integer rollnu;
	private String name;
	private double percent;
 public Student() {}
	public Student(Integer rollnu, String name, double percent) {
		super();
		this.rollnu = rollnu;
		this.name = name;
		this.percent = percent;
	}

	public Integer getRollnu() {
		return rollnu;
	}

	public void setRollnu(Integer rollnu) {
		this.rollnu = rollnu;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPercent() {
		return percent;
	}

	public void setPercent(double percent) {
		this.percent = percent;
	}

	@Override
	public String toString() {
		return "Student [rollnu=" + rollnu + ", name=" + name + ", percent=" + percent + "]";
	}
	
	@Override
	public int hashCode() {
		return (int)this.percent;
	}
	
	
	public boolean equals(Object obj) {
		Student s = (Student) obj;
		if (this.getRollnu().equals(s.rollnu) && this.getName().equals(s.name)
				&&this.getPercent()==(s.percent)) {
			return true;

		}
		return false;
	}
	@Override
	public int compareTo(Student o) {
	Integer i= this.getRollnu();
	Integer i1= o.getRollnu();
	if (i < i1) {
	return -1;
	}else {
	return -1;
	}
}
		
	}


