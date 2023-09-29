package lambda_express_9_1;

interface Count {
	int m1(String str);
}

public class RetunCharCountOfString {
	public static void main(String[] args) {
//  if u have👇single param the no need to take  param
		// Count c = (str)->{int ii =str.length();return ii;};
		Count c = (str) -> str.length();
		// if single with return then no need to 👆 write return
		System.out.println(c.m1("rwl"));

	}
}
//the target type of this expression must be a functional interface