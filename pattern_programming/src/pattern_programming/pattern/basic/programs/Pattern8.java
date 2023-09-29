package pattern_programming.pattern.basic.programs;

public class Pattern8 {

	public static void main(String[] args) {
		int n = 5;
		         
		for(int i = 1 ; i<= n ; i++) {
			                  
			for(int s = 1 ; s <= n-i ; s++) {
				System.out.print("  ");
			}
			for(int j = 1 ;j <= i ;j++) {
				System.out.print(" *");
			}
			
			System.out.println();
		}
		
		int m=n-1;
		
		for(int i=1;i<=n;i++) {
			
			for(int s=1;s<=m;s++) {
				
				System.out.print("  ");
				
			}
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(" *");
				
			}
			
			System.out.println();
		}
	}
}
