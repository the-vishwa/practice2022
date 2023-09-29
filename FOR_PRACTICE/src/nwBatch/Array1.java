package nwBatch;

public class Array1 {
	 int copy(int[] arr1) {
		int even = 0;

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] % 2 == 0) {
				even++;
			}

		}

		return even;

	}

	 int[] xyz(int[] first, int[] second) {

		int ii = 0;
		for (int i = 0; i < first.length; i++) {
           if(first[i]%2==0) {
        	   second[ii] = first[i];
   			ii++;
        	   
           }
			

		}

		return second;
	}

	 void print(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i]);

		}

	}

	public  static void main(String[] args) {
		 Array1 a=new Array1();
		int[] first = { 1, 2, 3, 4, 5, 6 };

		int sizeOFeven = a.copy(first);

		int[] second = new int[sizeOFeven];

		 a.xyz(first, second);
		
		a.print(first);
		System.out.println();
		a.print(second);

	}
}
