package nwBatch;
public class Controller {
	public static void main(String[] args) {
		allMetghods al = new allMetghods();
		Student s = new Student();
		s.setName("vishwa");
		//s.setAdr(al.add());
		s.setAdr(al.add());
		s.setMarks(al.mak());
		s.setSc(al.schoolInfo());
		al.printdata(s);
	}
}
