package incream_decream;

public class Voting {
	Boolean b2(int year) {
		return year >=2000;
	}
	
public static void main(String[] args) {
	
	Voting v =new Voting();
	if(v.b2(2001)) {
		System.out.println("u can");
	}else {
		System.out.println("u cant");
	}
	
}
}
