package pattern_programming.pattern.basic.programs;

public class Revision {

	public static void main(String[] args) {
		int n = 5;
		
		for(int r =1; r <=n; r++) {
			
			for(int c = 1; c<=r ; c++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		
	}
}

