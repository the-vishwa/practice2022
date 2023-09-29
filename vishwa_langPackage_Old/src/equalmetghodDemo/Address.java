package equalmetghodDemo;

public class Address {

	Integer pin;
	String city;

	public Address() {
		super();
	}

	public Address(Integer pin, String city) {
		super();
		this.pin = pin;
		this.city = city;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Address) {
			Address ad = (Address) obj;

			if (this.pin.equals(ad.pin) && this.city.equals(ad.city)) {
				return true;

			}

		}
		return false;

	}

}
