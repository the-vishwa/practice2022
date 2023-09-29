package TreeSetExample;

public class Greatmen implements Comparable<Greatmen> {
	private Integer rollNum;
	private String firstName;
	private String lastName;

	public Greatmen() {
	}

	public Greatmen(Integer rollNum, String firstName, String lastName) {
		super();
		this.rollNum = rollNum;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Integer getRollNum() {
		return rollNum;
	}

	public void setRollNum(Integer rollNum) {
		this.rollNum = rollNum;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Greatmen [rollNum=" + rollNum + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	@Override
	public boolean equals(Object obj) {
		Greatmen s = (Greatmen) obj;
		if (this.getFirstName().equals(s.firstName) && this.getLastName().equals(s.lastName)
				&& this.getRollNum().equals(s.rollNum)) {
			return true;

		}
		return false;
	}

	@Override
	public int compareTo(Greatmen o) {
		Integer g1 = this.getRollNum();
		Integer g2 = o.getRollNum();
		if (g1 < g2) {
			return -1;
		} else {
			if (this.equals(o)) {
				return 0;
			}
			return 1;
		}
		}
	}

/* Don't allow duplicates object.  with sorting technique....
           if (g1 < g2) {
			return -1;
		   } else {
			if (this.equals(o)) {
				return 0;
			}
			return 1;
		   }
 */

//OR 

/*  without overriding equals();
          if (g1 <= g2) {
			return -1;
		 } else {
			if (this.equals(o)) {
			}
			return 1;
		 }
 */

//OR    
	
/*
        if (g1 <= g2) {
           return -1;
        }else(g1>g2){	       
	      return 1;			                                
       }																			
 */