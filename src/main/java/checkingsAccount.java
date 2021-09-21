
class checkingsAccount extends account {

	checkingsAccount(int accountNo, int balance, String dateCreated, customer C1) {
		super(accountNo, balance, dateCreated, C1);
		// TODO Auto-generated constructor stub
	}
	checkingsAccount()
	{
		super();
	}
	checkingsAccount(int accountNo,double transactionFee)
	{
		super(accountNo);
		this.transactionFee=transactionFee;
	}

	double transactionCount;
	
	
	private static double transactionFee=10;
	
	
	void makeWithdrawal(double amount)  //specific based upon the type of account, using method overriding
	{
		if(amount+transactionFee<=balance)
		{
			System.out.println("The amount you wish to withdraw is " +amount);
			balance=balance-amount;
			balance-=transactionFee;
			System.out.println("Your remaining balance is " +balance);
		}
		else
			System.out.println("Zero amount cannot be withdrawn \n");
		
	}
	
	String displayAllDeductions(int accountNo)
	{
		int tax=100;
		String s="The amount "+tax+" is deducted from accountNo "+accountNo ;
		return s;
	}
	
}
