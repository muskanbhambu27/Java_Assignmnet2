package IciciBank;

public class Account {

	protected String accNo;
	protected double balance, balance2,balance3,amt1;

	public Account(String accNo, double balance) {
		this.accNo = accNo;
		this.balance = balance;
	}

	public void printAcctDetails() {
		System.out.println("account Number : " + accNo + "\nCurrent Balance : " + balance);
	}

	public void deposit(double amt) {
		balance2 = balance + amt;
		System.out.println(balance + " + " + amt + " = " + balance2);
		System.out.println("Deposited balance : " + balance2);
	}

	public void withdraw(double amt1) {
		if (balance > amt1) {
			balance3 = balance2 - amt1;
			System.out.println(balance2 + " - " + amt1 + " = " +balance3);
			System.out.println("Withdrawal balance : " + balance3);
		} else
			System.out.println("Insufficient Balance.");
	}

}