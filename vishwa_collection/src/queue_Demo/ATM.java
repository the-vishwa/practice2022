package queue_Demo;

import java.util.Iterator;
import java.util.LinkedList;

public class ATM {
	private String personName;
	private Integer cardNumber;

	public ATM() {
	}

	public ATM(String personName, Integer cardNumber) {
		super();
		this.personName = personName;
		this.cardNumber = cardNumber;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Integer getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(Integer cardNumber) {
		this.cardNumber = cardNumber;
	}

	@Override
	public String toString() {
		return "ATM [personName=" + personName + ", cardNumber=" + cardNumber + "]";
	}
	static void searchByplace(Integer CardNumber, LinkedList<ATM> list) {
		Iterator<ATM> itr = list.iterator();
		while (itr.hasNext()) {
			ATM i = itr.next();
			if (i.getCardNumber().equals(CardNumber)) {
				System.out.println(i);
			}
		}
	}
	
	static void operationMethod(LinkedList<ATM> list, ATM s) {
		list.add(s);
	}
	
}
