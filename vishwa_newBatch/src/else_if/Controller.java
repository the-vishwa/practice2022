package else_if;

public class Controller {
public static void main(String[] args) {
	PrintLogic p = new PrintLogic();
	LogicOfAll al=new LogicOfAll();
	Student r =al.logic(14);
	p.printDetails(r);
	
}
}
