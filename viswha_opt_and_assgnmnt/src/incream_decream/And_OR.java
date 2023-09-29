package incream_decream;

public class And_OR {

	Boolean ageAbove(Integer b) {
		return b >= 18;

	}

	Boolean validCountry(Integer c) {
		return c == 91;

	}

	public static void main(String[] args) {
		And_OR ao = new And_OR();
		
		if(ao.ageAbove(18)&& ao.validCountry(92)) {
			System.out.println("ok");
			
		}else {
			System.out.println("not ok");
			
		}
	}
}