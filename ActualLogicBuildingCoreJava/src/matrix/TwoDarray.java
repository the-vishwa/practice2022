package matrix;

public class TwoDarray {

	public static void main(String[] args) {
											//i & j
		int[][] arr = new int[3][4];
			// 2	D array	   >      [3]_1Darray & every 1D array contains--4 elemnt
		System.out.println(arr.length);
		
		arr[0][0]= 10;
		arr[0][1]= 8;
		arr[0][2]= 8;
		arr[0][3]= 2;
				
		arr[1][0]= 10;
		arr[1][1]= 8;
		arr[1][2]= 8;
		arr[1][3]= 2;
	
		arr[2][0]= 10;
		arr[2][1]= 8;
		arr[2][2]= 8;
		arr[2][3]= 2;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("   "+arr[i][j]);	//0<3
				//System.out.println(j);
			}
			System.out.println();
		}
	
	}
	
	
	
	
	
	
	
}
