package abstraction.example;

public class Controller {

	public static void main(String[] args) {
		
		MenuCard m= new MenuCardImpl();
		
		Customer c= new Customer();
		c.order(m);
		
	}
}
