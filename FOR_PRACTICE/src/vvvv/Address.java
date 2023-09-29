package vvvv;

public class Address {
	private String line1;
	private String city;
	private int pin;
	public  Address() {}
	public Address(String line1, String city, int pin) {
		super();
		this.line1 = line1;
		this.city = city;
		this.pin = pin;
	}
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public static void main(String[] args) {
		
		
	}
}
