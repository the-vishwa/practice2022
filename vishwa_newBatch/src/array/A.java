package array;

public class A {
public static void main(String[] args) {
	int[] a={3,5,6,7,8};
	
	int i=0;
	while(i<a.length) {
		a[i]=a[i]+10;
		i++;
	}
	Print.print(a);
	
	
}
}
