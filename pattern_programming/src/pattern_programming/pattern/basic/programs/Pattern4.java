package pattern_programming.pattern.basic.programs;

public class Pattern4 {

	public static void main(String[] args) {

		for (int r = 1; r <= 5; r++) {
			char ch = 'A';

			for (int c = 1; c <= r; c++) {
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();

		}
//<<<<<<< HEAD

//=======
		
		try {
		int m = 10/0;
		}
		catch(Exception e) {
			System.out.println(e);
		}
//>>>>>>> 02d904202502c777b00a7941a35fba0ed9016db9
	}
}

// A
// B B
// C C c
// A B C D
// A B c d E
