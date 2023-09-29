package intrv_que2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Oprtion {
	List<Student> list;
	HashMap<Integer,Student> map;
	
	public  Oprtion() {
	this.list=new ArrayList<>();
	this.map = new HashMap<>();
	}

	Double percentt(){
		int total =0;
		int[] marks = {20,30,35,65,48,40};
		for (int i : marks) {
			total=total+i;
		}
		double percent;
		return percent= (total/ (double)6);
		
	}
	Double percentt1(){
		int total =0;
		int[] marks = {67,45,77,33,48,46};
		for (int i : marks) {
			total=total+i;
		}
		double percent;
		return percent= (total/ (double)6);
	}
	public static void main(String[] args) {
		Oprtion o = new Oprtion();
		HashMap<Integer,Student> map = new HashMap<>();
		map.put(8,new Student(4, "vishwa", o.percentt()));
		map.put(9,new Student(5, "sonali", o.percentt1()));
		System.out.println(map);
		
		
	}
}
//List<Student> list = new ArrayList<>();
//list.add(new Student(2, "vishwa", o.percentt()));
//list.add(new Student(3,"sonali",o.percentt1()));