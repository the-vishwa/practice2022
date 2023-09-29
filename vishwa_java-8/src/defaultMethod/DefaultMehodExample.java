package defaultMethod;
interface Abc{
	Integer doSum(Integer a);
	default Integer m1(Integer a) {
		
		Integer s= a+a;
		return s;
	}
	
}


class BB implements Abc{

	@Override
	public Integer doSum(Integer a) {
		return m1(a);
	}
	
	
}
class CC implements Abc{
	
	@Override
	public Integer doSum(Integer a) {
		return a+a;
	}
	
	
}
public class DefaultMehodExample {

	public static void main(String[] args) {
		
		Abc a = new BB();
		System.out.println(a.doSum(12));
		Abc a1= new CC();
		System.out.println(a1.doSum(12));
	}
	
}
