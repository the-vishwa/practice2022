package else_if;

public class Student {
private String group;
private int lowerAge;
private int upperAge;
private double  fees;
public Student() {}
public Student(String group, int lowerAge, int upperAge, double fees) {
	super();
	this.group = group;
	this.lowerAge = lowerAge;
	this.upperAge = upperAge;
	this.fees = fees;
}
public String getGroup() {
	return group;
}
public void setGroup(String group) {
	this.group = group;
}
public int getLowerAge() {
	return lowerAge;
}
public void setLowerAge(int lowerAge) {
	this.lowerAge = lowerAge;
}
public int getUpperAge() {
	return upperAge;
}
public void setUpperAge(int upperAge) {
	this.upperAge = upperAge;
}
public double getFees() {
	return fees;
}
public void setFees(double fees) {
	this.fees = fees;
}

	
}
