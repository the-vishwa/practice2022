package vishwa_abstract_14_11;

public class Customer extends Shop {

//	void fomalShoes() {
//System.out.println("this is good for official use and for anywhere u can use ..");
//	}

	void order() {
		ShoesShop shop = new Customer();
		shop.fomalShoes();

	}
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.order();
		
// here completely hide that which type of shoes i bought 
	}
}
