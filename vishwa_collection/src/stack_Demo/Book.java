package stack_Demo;



public class Book {
private String name;
private String auther;
private Integer pages;
public Book() {}
public Book(String name, String auther, Integer pages) {
	super();
	this.name = name;
	this.auther = auther;
	this.pages = pages;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAuther() {
	return auther;
}
public void setAuther(String auther) {
	this.auther = auther;
}
public Integer getPages() {
	return pages;
}
public void setPages(Integer pages) {
	this.pages = pages;
}
@Override
public String toString() {
	return "StackDemo [name=" + name + ", auther=" + auther + ", pages=" + pages + "]";
}
}

