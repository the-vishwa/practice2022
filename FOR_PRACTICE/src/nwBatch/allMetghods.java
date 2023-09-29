package nwBatch;
public class allMetghods {
	public int[] mak() {
		int[] marks= {20,40,60,70};
		return marks;
	}
	public Address[] add(){
	Address[] ad = new Address[2];
	ad[0]=new Address("V", "dhule", 425408);
	ad[1]=new Address("R", "pune", 575757);
	return ad;
	}
	public School schoolInfo() {
		School v = new School();
		v.setSname("DR");
		v.setAdr1(new Address("b", "dondaicha", 425408));
		return v;
	}
	
public  void printdata(Student s1) {
	System.out.println(s1.getName());
	System.out.println("--student marks--");
	int[] aa =s1.getMarks();
	for (int i = 0; i < aa.length; i++) {
	System.out.println(aa[i]);
	}
	System.out.println("first address");
	Address[] a1 =s1.getAdr();
    for (int i = 0; i < a1.length; i++) {
	System.out.println(a1[i].getLine1());
	System.out.println(a1[i].getCity());
	System.out.println(a1[i].getPin());
}
    
	School sch =s1.getSc();
	System.out.println("school details");
	System.out.println(sch.getSname());
	Address ad2= sch.getAdr1();
	System.out.println(ad2.getLine1());
	System.out.println(ad2.getCity());
	System.out.println(ad2.getPin());
	
	
	
	
	
	
	
	
	
	
	
	}

}
