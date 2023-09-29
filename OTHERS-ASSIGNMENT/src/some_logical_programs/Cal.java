package some_logical_programs;

import java.util.*;
public class Cal {

	public static void main(String[] args)
	    {
	     Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the values to calculate");
	     float a = sc.nextFloat();
	     float b = sc.nextFloat();
//String literal is not properly closed by a double-quote
	        System.out.println("
	                Enter
	                 1 for Addition
	                 2 for subtraction
	                 3 for division
	                 4 for multiply );
	     int op = sc.nextInt();
	                		 
	     switch(op)
	     {
	         case 1 -> System.out.println(a+b);

	         case 2 -> System.out.println(a-b);

	         case 3 -> System.out.println(a/b);

	         case 4 -> System.out.println(a*b);

	         default -> System.out.println("Invalid Operator");
	     }

	    }
}
