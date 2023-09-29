package nwBatch;

public class Student {
private String name;
private Address[] adr;
private School sc;
private int[] marks;
public  Student() {}
public Student(String name, Address[] adr, School sc, int[] marks) {
	super();
	this.name = name;
	this.adr = adr;
	this.sc = sc;
	this.marks = marks;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Address[] getAdr() {
	return adr;
}
public void setAdr(Address[] adr) {
	this.adr = adr;
}
public School getSc() {
	return sc;
}
public void setSc(School sc) {
	this.sc = sc;
}
public int[] getMarks() {
	return marks;
}
public void setMarks(int[] marks) {
	this.marks = marks;
}


}
