package intrv_que;

import java.util.ArrayList;
import java.util.HashMap;


public class Stud {
	ArrayList<Student> list;
	HashMap<Integer, ArrayList<Student>> map;
	public Stud() {
		int[] a=  {2,3,4};
		int[] a1= {4,5,6};
		int[] a2= {7,9,10};
		
		this.list=new ArrayList<>();
		this.map=new HashMap<>();
		list.add(new Student(1,"vishwa",a));
		list.add(new Student(2,"nirmal",a1));
		list.add(new Student(3,"sonali",a2));
		
	}
	
public static void main(String[] args) {
}
	
}
