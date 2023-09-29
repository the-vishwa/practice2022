package vishwa_generic;


public class Student <T extends Number>{
	T n;
	
	T getData(T t) {
		this.n=t;
		return t;
	}

	public static void main(String[] args) {
		Student<Integer> t = new Student<>();
		System.out.println(t.getData(10));
		Student<Float> t1 = new Student<>();
		System.out.println(t1.getData(10.20f));
		
	}

}
