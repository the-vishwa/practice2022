package vishwa_hashCode_$_toString_14_12;

class K {
	int x;
	int y;
	public int hashCode() {
		return this.x + this.y;
	}
	public String toString() {
		return "rwl";
	}
}
public class HashCodeWithToString {
	
	public static void main(String[] args) {
		K a = new K();
		System.out.println(a.hashCode());
		System.out.println(a); // internal will be like = a.toString( );
		// sysout(a); =  
		//a.toString( ); =   return getClass().getName() + "@" + Integer.toHexString(hashCode());
		// but if there will be to string method override with some  strings  then this will print only that name or value
		//if there is not override to string method then it will print  fullyqualified name.
		
       // System.out.println(a.hashCode()); 
        // if there is a override hashcode method n sysout it with ref variabl then it will print  only init value.
	}

}
