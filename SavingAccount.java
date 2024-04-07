package IciciBank;

public class SavingAccount extends Account {
	double interestRate, balance4, interest;

	public SavingAccount(String accNo, double balance, double interestRate) {
		super(accNo, balance);
		this.interestRate = interestRate;
	}

	public void Addinterest() {
		interest = balance / 12 * interestRate;
		balance4 = balance + interest;
	}

	public void display() {
		System.out.println(balance + " / " + 12 + " * "+interestRate+ " = " + interest);
		System.out.println("AddInterest balance : " +interest );
		System.out.println("Now current balance: "+balance4);

	}
}
