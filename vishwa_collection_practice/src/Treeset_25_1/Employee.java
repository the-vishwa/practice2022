package Treeset_25_1;

public class Employee implements Comparable<Employee> {
	private Integer id;
	private String name;

	public Employee() {
	}

	public Employee(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

//@Override
//	public int hashCode() {
//		return this.id.hashCode()+this.name.hashCode();
//	}

//@Override
//	public boolean equals(Object obj) {
//		Employee e=(Employee)obj;
//	if(this.getId().equals(e.id)&&this.getName().equals(e.name)) {
//		return true;
//	}
//		return false;
//	}

	@Override
	public int compareTo(Employee o) {
//===============Integer logic=============================		
		
//	return - i.compareTo(i1);// for this equal n hashcode isnt important to override
//		 or > return this.getId().compareTo(o.getId());

//----------------Custom logic natural sorting order--------------------------------------------------------	
//	Integer i=this.getId();
//	Integer i1=o.getId();
//	if(i<i1) {
//		return -1; // no need to swap
//	}else if (i>i1) {
//		return 1; // swap
//	}else {
//		return 1; // zero dilyavar duplicate remove kartoy pan no need to hashcode and equal
//	}

//===============string logic=============================
//		String s = this.getName();
//		String s1 = o.getName();
//		if (s == s1) {
//		return 0;
//		} else {
//		return this.getName().compareTo(o.getName());
//		}
//--------------------------2nd logic-----------------------------------------
// length sarkhi asel tr alfa sort,length mothi asel tr khali,choti asel tr var,dupli asel tr remo.?		
		
		String s = this.getName();
		String s1 = o.getName();
		if(s.length() > s1.length()) {
			return 1; // swap
		}else if (s.length() < s1.length()) {
			return -1; // no need to swap
		}else if (s.length() == s1.length()) {
			return this.getName().compareTo(o.getName()); // duplicat remo internal in this mehthod
		}else {
			return 0; // zero dilyavar duplicate remove kartoy pan no need to hashcode and equal
		}
//----------------------------natural sorting--------------------------------------------		
//		return this.getName().compareTo(o.getName());
		
//----------------Custom logic natural sorting order--------------------------------------------------------	
//		int i = this.getName().compareTo(o.getName());
//		if (i == 0) {
//			return 0;
//		} else {
//			return this.getName().compareTo(o.getName());
//		}
		
	}
}
