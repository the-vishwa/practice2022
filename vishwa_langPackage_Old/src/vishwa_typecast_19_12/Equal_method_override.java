package vishwa_typecast_19_12;

class Man {
	int x;
	int y;

	@Override
	public int hashCode() {
		return this.x + this.y+898;
	}

	@Override
	public boolean equals(Object obj) {
		Man m = (Man) obj;
		if (this.x == m.x && this.y == m.y) {
			return true;
		}
		return false;
	}

}

public class Equal_method_override {

	public static void main(String[] args) {
		Man m2 = new Man();
		m2.x = 10;
		m2.y = 20;

		Man m3 = new Man();
		m3.x = 10;
		m3.y = 20;
		System.out.println(m2.equals(m3)); // true
		System.out.println(m2.hashCode()); // 
		System.out.println(m3.hashCode()); // 

		System.out.println("__________ 4 CASSES___________");
		System.out.println("----------- case 1--------------------------");
		// case 1
		Man m1 = m2; // 2 ref point to one obj thats y true
		System.out.println(m1 == m2); // true
		System.out.println(m1.equals(m2)); // true

		System.out.println("-----------case 2----------------------------");
		// case 2
		System.out.println(m2 == m3); // false
		System.out.println(m2.equals(m3)); // true if data are same otherwise false

		System.out.println("-----------case 3-------------------------------");
		// case 3
		System.out.println(m2.equals(m3)); // true // mhanje object same asel kiwa jar veg vegla obj asel
		// tr data same asel ani euqal method override karun tase bz logic put kel asel
		// method made
		System.out.println(m2 == m3); // false or may b true if i want to print it true then i have to
		// take obj and thse 2 ref var point to that obj

		System.out.println("-----------case 4-------------------------------");
		// case 4

		System.out.println(m2.equals(m3)); // false -- data are diffrnt and this ref var ponting to 2 diff obj
		System.out.println(m2 == m3); // false

	}

}
