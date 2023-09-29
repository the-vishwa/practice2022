package LinkdHashMap;

import java.util.HashMap;

public class EmpConttro {
	public static void main(String[] args) {

		HashMap<Employee, Double> map = new HashMap<>();

		map.put(new Employee(2, "vishwa"), 5000.20);
		map.put(new Employee(3, "nirmal"), 6000.20);
		map.put(new Employee(2, "vishwa"), 7000.20);
		
		System.out.println(map.size());
		System.out.println(map.get(new Employee(2, "vishwa")));
		
		
//		Set<Employee> e = map.keySet();
//		Iterator<Employee> itr = e.iterator();
//		while (itr.hasNext()) {
//			Employee ee = itr.next();
//			Double in = map.get(ee);
//			System.out.println(ee + "=" + in);
//		}
	}
}
