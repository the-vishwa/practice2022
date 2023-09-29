package vishwa_Lang.pack_methds_of_objectClass;
class PP{}
class MM{}
class NN{}
class QQ extends PP{}
class W{}
class V{
	int x;
	int y;
	V(int x,int y){
		this.x=x;
		this.y=y;
	}
	}
class MMM{
	
}

public class EqualsMethod {
	public static void main(String[] args) {
		V vv =new V(10,20);
		W w = new W();
		PP p=new PP();
		QQ q= new QQ();
		Object obj =vv; //  here vv made object ref
		System.out.println(obj==w); //false
		//System.out.println(vv==w); // C.E coz no relation betwn V & W   e.g = diff datetype or diff ref var
		System.out.println(vv.equals(w)); // no C.E coz relation built coz of equal method but ans is false 
		System.out.println(vv==obj); // here anyone can compare with obj no C.E _// true
		// see one ref variablbe pointing to same  abject ans willbe true
		System.out.println(p==q); //class PP and QQ has a relation thats y its not showin C.E  but false
System.out.println("__________________________________________");
		 PP pp=p;
        System.out.println(pp.equals(p));// true  or (pp == p); 
        
        MM mm = new MM();
        NN nn = new NN();
        //System.out.println(mm==nn); // it will show error but if we want to build reltn btwn thses 2 objcts
        System.out.println(mm.equals(nn)); //then use equal method  // false
        MM m1 = new MM();
        System.out.println(mm==m1);
        System.out.println(mm.equals(m1));
 
	
		System.out.println("------------------------------------------------------");
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1.equals(s2)); //true
		
		Integer i = new  Integer (10);
		Integer i2 = new  Integer(10); 
		System.out.println(i.equals(i2)); //true
		
		Character c =new Character('v');
		Character c1 =new Character('v');
		System.out.println(c.equals(c1)); //true
		
		Object O = new Object();
		Object O2 = new Object();
		System.out.println(O==O2); //false
		
		V v =new V(10,20);
		V v1 =new V(10,20);
		System.out.println(v.equals(v1)); //false
	}
}

