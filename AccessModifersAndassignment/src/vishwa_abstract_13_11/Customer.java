package vishwa_abstract_13_11;

public class Customer {

	public void order() {
		HotelMenuCard  h = new HotelMenuCardimpls();
		h.coldCofee();
		h.tea();
		h.mangoJuice();
	}

}
