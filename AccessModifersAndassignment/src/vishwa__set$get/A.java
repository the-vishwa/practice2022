package vishwa__set$get;


// here i accessd private properties in same class and 
// along with SG method

public class A {
	
	private String fname;
	private String lname;
	
	A(String fname, String lname){
		
		this.fname=fname;
		this.lname=lname;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
	
}
	

//		public static void main(String[] args) {
//			A a = new A();
//			a.name="vishwa";
//			System.out.println(a);
//		}
//		
	

