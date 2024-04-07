package IciciBank;

public class HousingLoan extends LoanAccount {

	int tenure1, tenure;

	public HousingLoan(String accNo, double bal, int tenure) {
		super(accNo, bal);
		this.tenure = tenure;
	}

	public void extendTenure(int month) {
		tenure1 = tenure + month;
		System.out.println(tenure + " + " +   month  + " = " + tenure1 );
	}

	public void display() {
		System.out.println("Tenure extended succesfully by " + tenure1 + " Months");
System.out.println(balance);
	}
}
