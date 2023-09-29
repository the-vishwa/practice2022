package lamdaExpresion_FunctionalInterface;
interface Squar {
	Integer squar(Integer a);
}
//class FindSq implements Squar{
//	@Override
//	public Integer squar(Integer a) {
//		int s = a*a;
//		return s;
//	}
//	
//}
public class GivenNumsquare {
	public static void main(String[] args) {
//		Squar s = new FindSq();
//		Integer i = s.squar(5);
//		System.out.println(i);
		
		Squar s1 = a -> a * a;
		System.out.println(s1.squar(6));
	}
}
