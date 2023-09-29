package vishwa_typecast_19_12;

class AB {
	int x;
	int y;

	@Override
	public boolean equals(Object obj) {
		AB a1=(AB)obj;
          
      if (this.x ==a1.x &&  this.y==a1.y) {
	      return true;
    }
     return false;
	}
	
}
public class Equalmethod {
	public static void main(String[] args) {
		AB a = new AB();
		a.x = 10;
		a.y = 20;

		AB a1 = new AB();
		a1.x = 10;
		a1.y = 20;
		System.out.println(a == a1); // false 
//		boolean r = a.equals(a1);                                  // internally a==a1;
//		System.out.println(r); //
		
		System.out.println(a.equals(a1)); // true
	}
}
