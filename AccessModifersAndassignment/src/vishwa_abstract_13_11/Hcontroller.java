package vishwa_abstract_13_11;

public class Hcontroller {

	public static void main(String[] args) {

		HotelMenuCard HM = new HotelMenuCardimpls();

		 HM.coldCofee();
            order(HM);
//		Customer c = new Customer();
//		c.order();

	}
	static void order(HotelMenuCard H) { // clear static ..modifr and see it will show error
		H.coldCofee();
        H.tea();
        H.mangoJuice();
	}

}
