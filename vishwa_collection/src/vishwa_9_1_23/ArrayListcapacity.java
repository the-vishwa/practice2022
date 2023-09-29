package vishwa_9_1_23;
import java.util.ArrayList;
public class ArrayListcapacity {
public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<>();
	for(int i =1; i<=10; i++) {
		al.add(i);
	}
	System.out.println(al.size());
	al.add(11);
	System.out.println(al);
}
	
}
