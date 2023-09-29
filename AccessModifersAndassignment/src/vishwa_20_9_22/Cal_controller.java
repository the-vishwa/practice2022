package vishwa_20_9_22;

public class Cal_controller {

	public static void main(String[] args) {
	Sum s = new Sum();
//		s.a=10;
//		s.b=20;
		int p =s.sum();
		
		
		
	minus mi = new minus();
		mi.a=30;
		mi.b=40;
		int q = mi.minus();
		
	mult mu = new mult();
		mu.a=50;
		mu.b=60;
		int u = mu.mult();
		
		
		System.out.println(p);
		System.out.println(q);
		System.out.println(u);
		
		
		
	}
		
}
