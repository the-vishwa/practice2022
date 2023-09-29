package abstarct_13_11;

public class BeerController {
	public static void main(String[] args) {
		BeerShop bs = new BeerShopImple();
//		bs.kingfisher();
//		bs.budWiser();
		Customer c = new Customer();
		c.yourChoice(bs);

	}
}
