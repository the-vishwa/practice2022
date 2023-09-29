package poji_pojo_factory_15_11_22;

class Pune {
	private String name1 = "vishwa";
	private String name = "kiran";
	private String name2 = "vinayak";

	public Pune() {
	}

	public Pune( String name1, String name2,String name) {
		super();
		this.name1 = name1;
		this.name2 = name2;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}
}

public class Hotel {
	public static void main(String[] args) {
		Pune p = new Pune();
		p.setName("Rwl");
		p.setName("RWL1");
		
		String v1=p.getName();
		System.out.println(v1);
		
		String v=p.getName2();
		System.out.println(v);

	}
}
