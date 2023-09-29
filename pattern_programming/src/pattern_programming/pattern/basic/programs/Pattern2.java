package pattern_programming.pattern.basic.programs;

public class Pattern2 {

	public static void main(String[] args) {

		for (int r = 10; r >= 1; r--) {

			for (int c = 1; c <= r; c++) {
				System.out.print("* ");
			}

			System.out.println();

		}

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
        char ch ='A';
		for (int r = 10; r >= 1; r--) {

			for (int c = 1; c <= r; c++) {
				System.out.print(ch+" ");
			}

			System.out.println();
			ch++;

		}

	}
}
