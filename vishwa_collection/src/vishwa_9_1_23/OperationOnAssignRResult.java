package vishwa_9_1_23;

import java.util.ArrayList;

public class OperationOnAssignRResult {

	public void dealWithObject(ArrayList<Student> al) {
		al.add(new Student("sachin sir", 22, "pune"));
		al.add(new Student("vishwa", 10, "Arale"));
		al.add(new Student("nirmal", 15, "suray"));
		al.add(new Student("kuldip", 20, "pimpri"));
		al.add(new Student("premjit", 25, "shirpur"));
		al.add(new Student("darpan", 14, "shirpur"));
		al.add(new Student("yogesh", 9, "dhule"));
		al.add(new Student("Prashant", 9, "dhule"));
	}

	public void finalResult(RResult RR) {
		System.out.println("Voters list :-");
		System.out.println(RR.TheyCanVote);

		System.out.println("Non Voters list :-");
		System.out.println(RR.TheyCantVote);

		System.out.println("Kids list :-");
		System.out.println(RR.Kid);
	}

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();
		OperationOnAssignRResult opt = new OperationOnAssignRResult();
		opt.dealWithObject(al);
		RResult rr = new RResult(); 
		for (Student student : al) {
			if (student.getAge() >= 18) {
				rr.TheyCanVote.add(student.getName());
			} else if (student.getAge() < 18 && student.getAge() >= 10) {
				rr.TheyCantVote.add(student.getName());
			} else if (student.getAge() < 10) {
				rr.Kid.add(student.getName());
			}
		}
		opt.finalResult(rr);
	}

}
