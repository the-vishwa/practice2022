package pattern_programming.pattern.basic.programs;

public class WaterImageOfAssignmaneProgram {

	public static void main(String[] args) {
		int n = 10;
		
		for(int r = 1; r<=n; r++) {
			
			for(int j = 1 ;j <=r ;j++) {
				System.out.print("* ");
			}
			
			for(int s = 1; s <= (n*2-r*2) ;s++) {
				System.out.print("  ");
			}
			
			for(int j = 1 ;j <=r ;j++) {
				System.out.print("* ");
			}
			
			System.out.println();
			if(r == n-1) {
				break;
			}
		}
		// ------------------------ new program
    
		for(int r = n; r>=1; r--) {
			
			for(int j = 1 ;j <=r ;j++) {
				System.out.print("* ");
			}
			
			for(int s = 1; s <= (n*2-r*2) ;s++) {
				System.out.print("  ");
			}
			
			for(int j = 1 ;j <=r ;j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		
	}
}
