package vishwa_array_3_10;

public class IntArray {

	public static void main(String[] args) {
		
		int[] x = {10,20,30,40,50,60,70,80,90,100};//new int[10];
		// here x is a refrnce of int array
		// int a; > here a is a primitive type variable
		
//		x[0]=10;
//		x[1]=20;
//		x[2]=30;
//		x[3]=40;
//		x[4]=50;
//		x[5]=60;
//		x[6]=70;
//		x[7]=80;
//		x[8]=90;
//		x[9]=100;
		// here if i want to print arry values or anything in it then
		// here we used the for loop
		
		for(int i =0;i<x.length;i++){
			System.out.println(x[i]);
			
		}
		
	System.out.println("____");	
	System.out.println(x.length);// here we can chek th length
		// u can do any of arethmatic oprtion by using opertors
		// here sum of array
	int sum =x[0]+x[6]; 
	System.out.println(sum);
		
		//if i want to find num of them with the help of indx
  System.out.println(x[5]);// it will print  60 cuz it s is in x of 5
		
		
  
  
  
	}
	
	
}
