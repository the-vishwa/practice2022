package equalmetghodDemo;

public class Test {

	
	Integer empId;
	Integer rr;

	public Test(Integer empId,Integer rr) {
		super();
		this.empId = empId;
		this.rr=rr;
	}
	
	@Override
	public int hashCode() {
		
		return this.empId.hashCode() + this.rr.hashCode();
	}
	
	
	
	

	@Override
	public String toString() {
		return "Test [empId=" + empId + ", rr=" + rr + "]";
	}

	public static void main(String[] args) {
		Test t  = new Test(12,2);
		
		System.out.println(t);
		System.out.println(t.hashCode());
		
	}
	
//	For each program, a Main thread is created by JVM(Java Virtual Machine).
//	The “Main” thread first verifies the existence of the main() method,
//	and then it initializes the class. Note that from JDK 6,
//	main() method is mandatory in a standalone java application.
	
	
	
	
}
