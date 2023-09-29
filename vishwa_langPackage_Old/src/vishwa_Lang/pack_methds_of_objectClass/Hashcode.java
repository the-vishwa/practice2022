package vishwa_Lang.pack_methds_of_objectClass;


class Para{
	int x;
	int y;
	
	@Override
	public int hashCode() {
		return x+y;
	}
	@Override
	public boolean equals(Object obj) {
    Para p =(Para)obj;
    if (this.x==p.x && this.y==p.y) {
		return true;
	} return false;

	}
	
}
public class Hashcode {
public static void main(String[] args) {
	Para p = new Para ();
	p.x=10;  p.y=20;
	Para p1 = new Para();
	//p1.x=10;  p1.y=20;
	p1.x=20;  p1.y=10;
	
	
	System.out.println(p.equals(p1)); // data aren't  same // false
	
	
	System.out.println(p.hashCode());
	System.out.println(p1.hashCode());
	
	System.out.println(p.hashCode()==p1.hashCode());
	
}
	
}
