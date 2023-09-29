package doubleColln_or_method_ref_or_contruc_ref;
@FunctionalInterface
interface CalOverMths {
public void square(int d);
}
public class Main{
	public static void main(String[] args) {
		
		CalOverMths cal = (d)->System.out.println(d*d);
		cal.square(2);
		
		CalOverMths cal1 = new OprationOverMaths() :: instanceMethod; // instance method
		cal1.square(3);
		
		CalOverMths cal2 = OprationOverMaths::staticMethod; // static method
		cal2.square(4);
		
		CalOverMths cal3 = OprationOverMaths :: new;  // constructor
		cal3.square(5);
		
		
	}
}