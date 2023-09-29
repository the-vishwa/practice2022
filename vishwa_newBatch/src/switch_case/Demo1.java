package switch_case;

public class Demo1 {
public static void main(String[] args) {
	
	int a = 30;

final int  a1=20;
	
      switch(a) {
	
	case 20:{
		System.out.println("yes 1");
		break;
	}
	case 10+a1:{
		System.out.println("yes 2");
		break;
	}
	case 3:{
		System.out.println("yes 3");
		break;
	}
	default :{
		System.out.println("sorry");
	}
	
	}
}
	
}

