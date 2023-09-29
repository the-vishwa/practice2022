package logic_building;

public class Whileloop2 {
	void print(int[] arr) {
		int i =0;
		while(i<arr.length) {
		System.out.println(arr[i]);
			i++;
	}
	}
		
public static void main(String[] args) {
	int[] arr = new int[5];
	int i = 0;
	int value=100;
	while(i<arr.length) {
		arr[i]=value;
		value = value+100;
		i++;
	}
		Whileloop2 w=new Whileloop2();
		  w.print(arr);
		
	}
}
