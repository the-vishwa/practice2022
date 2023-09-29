package intrv_que;

import java.util.Arrays;

public class Student {
Integer id;
String name;
int[] mks;
public Student(Integer id, String name, int[] mks) {
	super();
	this.id = id;
	this.name = name;
	this.mks = mks;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int[] getMks() {
	return mks;
}
public void setMks(int[] mks) {
	this.mks = mks;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", mks=" + Arrays.toString(mks) + "]";
}
}
