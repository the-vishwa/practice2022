package logic_building;

public class Loopwhile {
public static void main(String[] args) {
//	int i=5;
//	while(i<=50) {
//		System.out.println(i);
//		i=i+5;
//	}
	int i= 0;
	while(logic(i)) {
		System.out.println(i);
		i++;
	}
}

public static  boolean logic(int i) {
	boolean r = i<10;
	return r;
}



}
