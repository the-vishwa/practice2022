package lambda_express_9_1;


interface Lamb{
	
	void m1(int a,int b);
}

public class LambdaEx {
	public static void main(String[] args) {
		Lamb l = (a,b)->System.out.println((a+b));
		//{} here curly braces are optional if there is single line
		l.m1(2, 20);
	}
}
