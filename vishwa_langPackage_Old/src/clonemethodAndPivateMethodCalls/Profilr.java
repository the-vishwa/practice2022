package clonemethodAndPivateMethodCalls;

public class Profilr implements Cloneable {

	int id;
	int AdharId;

	public Profilr() {

	}

//but object chi clone method fakt primitive cha clone karte refrernce cha nahi.
//jar refnce type asel tr share hoto clone nahi
//shallow cloning mhanje:- primitive type cha cloning	
//deep cloning mhanje :- refernce type  cha cloning	,Student ,employee,address
// refernce means custom cha karato, wrappr and string sodun,
// prototype design pattern deep cloning sathi	
	public Profilr(Integer id, Integer adharId) {
		super();
		this.id = id;
		AdharId = adharId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAdharId() {
		return AdharId;
	}

	public void setAdharId(int adharId) {
		AdharId = adharId;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		Profilr f = new Profilr();
		f.setAdharId(3223);
		f.setId(12);
		System.out.println(f.getAdharId());
		System.out.println(f.getId());

		System.out.println("---------------");
		Profilr p1 = (Profilr) f.clone();
		System.out.println(p1.getAdharId());
		p1.setId(14);
		System.out.println(p1.getId());

	}

}
