package pattern_programming.pattern.basic.programs;

public class Pattern6 {

	public static void main(String[] args) {
		int r =5;
		
		for(int i =r; i <= r;i++) {
			
			for(int j =5 ; j >= i; j-- ) {
				System.out.print("* ");
			}
			
			System.out.println();
			
		}
		
	}
}
// * * * * *
// * * * *
// * * *
// * *
// *