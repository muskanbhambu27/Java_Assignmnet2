package IciciBank;

public class LoanAccount extends Account {
	double Loanamount,Loanamount1;

	public LoanAccount(String accNo, double bal) {
		super(accNo, bal);
		Loanamount = 125000;
	}

	public void PayEMI(double emi) {
		Loanamount1 = Loanamount - emi;
		System.out.println("EMI Pay successfully");
		System.out.println("Emi amount : "+Loanamount1);

	}
	public void display() {
		System.out.println("Emi Paid Successfully.."+Loanamount);
	}

}
