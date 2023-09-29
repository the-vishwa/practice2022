package weakhashmap_7_2;

import java.util.HashMap;
import java.util.WeakHashMap;

class Temp {
	Integer id;
	String name;

	public Temp() {
	}

	public Temp(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Temp [id=" + id + ", name=" + name + "]";
	}

}

public class WeakhashMapDemo {

	public static void main(String[] args) throws Exception{
//		 Object as a key and obj as value
//		means single obje we can give as a key and value
		HashMap<Integer, String> ma = new HashMap<>();
		Temp tm = new Temp(3, "vishwa");
		ma.put(tm.getId(), tm.getName());
		System.out.println(ma);

		
		
		HashMap<Temp, Integer> map = new HashMap<>();
//		WeakHashMap<Temp, Integer> map = new WeakHashMap<>();
		Temp t = new Temp(3, "vishwa");
		map.put(t, 13);

		Temp t1 = new Temp(4, "mani");
		map.put(t1, 14);

		t =null;
		System.gc();
		Thread.sleep(10000);
		
		System.out.println(map);
		
		
/*
here hashmap dominate to gc means gc wont work
but weakhashmap cant dominate bcoz of it is weak means  gc will work

*/		
		
	}
}
