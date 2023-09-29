package innerOuterClasses;

class Bank {
	Integer balance = 10;

	class Account {
		Integer balance = 20;

		void balance() {
			Integer balance = 30;
			System.out.println(Bank.this.balance);
			System.out.println(this.balance);
			System.out.println(balance);
			System.out.println("---");
			System.out.println(balance);
			System.out.println(this.balance);
			System.out.println(Bank.this.balance);

		}
	}
}

public class InnerclassProperties {
	public static void main(String[] args) {
		Bank bank = new Bank();
		Bank.Account acnt = bank.new Account();
		acnt.balance();
	}

}
