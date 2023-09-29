package vvvv;

public class AScontroller {
public static void main(String[] args) {
	School ppp=new School();
	ppp.setSname("rwl");
	System.out.println(ppp.getSname());
	ppp.setAdr1(new Address("k","nasik",373737));
	Address hh =ppp.getAdr1();
	System.out.println(hh.getLine1());
	System.out.println(hh.getCity());
	System.out.println(hh.getPin());
	
	
	
	
}
}
