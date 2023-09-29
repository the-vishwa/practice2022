package pattern_programming.pattern.basic.programs;

public class BreakDemo {

	public static void main(String[] args) {
		for (int j = 1; j <= 10; j++) {
			
			for (int i = 1; i <= 10; i++) {
				if(j==5) {
					break;
				}
				System.out.println(i*j);
			}
			System.out.println(">>>>>>>>>>>>>>>>");
			
		}
		
	}
}

