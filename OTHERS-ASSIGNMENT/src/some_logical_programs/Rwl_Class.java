package some_logical_programs;
import java.util.Scanner;
public class Rwl_Class {
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int userInput = 0;
	        String choice = "";
	        do {
	            System.out.println("WELL COME TO RIGHT WAY LEARNING");
	            System.out.println("**COURSES**");
	            System.out.println("1:-  JAVA FULL STACK");
	            System.out.println("2:-  JAVSCRIPT");
	            System.out.println("3:-  JAVA DEV");
	            System.out.println("4:-  SQL");
	            System.out.println("Please choose above the list");
	             //userInput = sc.nextInt();
	            switch (sc.nextInt()) {
	                case 1-> System.out.println("Your selection for  JAVA FULL STACK Dev course has been noted successfully");
	                case 2->System.out.println("Your selection for  JAVSCRIPT course has been noted successfully");
	                case 3->System.out.println("Your selection for  JAVA Dev course has been noted successfully");
	                case 4->System.out.println("Your selection for  SQL course has been noted successfully");
	            }
	            System.out.println("Do you want more  information about us (YES/NO)");
	            choice = sc.next();
	        }
	        
	        while(choice.equalsIgnoreCase("YES"));
	        System.out.println("Thank you! visit again");;
	}
}
