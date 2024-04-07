package IciciBank;
//Question number 9
public class TestAccount {
		double balance;
		double balance2;
		double balance3;
		double balance4;
		
	
	public static void main(String args[]) {
		Account acc = new Account("2031373520", 25000);

		System.out.println("\n------Account-------");
		acc.printAcctDetails();
		System.out.println();

		System.out.println("-------Deposit Amount-------");
		acc.deposit(5000);

		System.out.println("-------Withdrawal Amount--------");
		acc.withdraw(15000);

		System.out.println("\n------Saving Account-------");
		SavingAccount sa = new SavingAccount("20313737520", 15000, 7.8);
		sa.Addinterest();
		sa.display();

		System.out.println("\n------Loan Account-------");
		LoanAccount la = new LoanAccount("20313737520", 25000);
		la.PayEMI(1200);
		
		System.out.println("\n------Housing Account-------");
		HousingLoan ha= new HousingLoan("12465452165", 125842, 12);
		ha.extendTenure(12);
		ha.display();

	}

}
