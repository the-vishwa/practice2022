package else_if;

public class PrintLogic {
void printDetails(Student s) {
	System.out.println(s.getGroup());
	System.out.println("age="+s.getLowerAge()+">=or >=" + s.getUpperAge());
	System.out.println(s.getFees());
}
}
