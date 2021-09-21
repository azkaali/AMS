import java.util.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    

import java.io.*;

class account {
	protected int accountNo;
	protected double balance;
	protected double transactionAmount;
	protected String dateCreated;
    protected customer C1;

    account(int accountNo,int balance,String dateCreated,customer C1)
    {
    	this.accountNo=accountNo;
    	this.balance=balance;
    	this.dateCreated=dateCreated;
    	this.C1=C1;
    }
    account(int accountNo)
    {
    	
    }
    account()
    {
    	
    }
    int getAccountno()
    {
    	return accountNo;
    }
    void setAccountno(int accountNo)
    {
    	 this.accountNo=accountNo;
    }
    double getBalance()
    {
    	return balance;
    }
    void setBalance(double balance)
    {
    	this.balance=balance;
    }
    double getTransactionAmount()
    {
    	return transactionAmount;
    }
    void setTransactionAmount(double transactionAmount)
    {
    	this.transactionAmount=transactionAmount;
    }
    String getDateCreated()
    {
    	return dateCreated;
    }
    void setDateCreated(String dateCreated)
    {
    	this.dateCreated=dateCreated;
    }
    
    void checkBalance()
	{
			System.out.println("Your remaining balance is " + getBalance());
	}
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
	LocalDateTime now = LocalDateTime.now(); 
	void printStatement()
	{
		System.out.println("Your account number is "+ getAccountno());
		System.out.println("Remaining balance is "+ getBalance() );
		System.out.println("Amount of transaction "+ getTransactionAmount());
		System.out.println("Dated "+ dtf.format(now));
		
	}
	void transferAmount(double amount,int accountNo2)
	{
	 try {
		 System.out.println("The amount "+amount+" is transferred to accountNo "+accountNo2 );
	     }
	 catch (Exception e) 
	 	{
	     System.out.println("Something went wrong.");
		}
	 finally 
	 	{
	      System.out.println("The 'try catch' is finished.");
	    }
		
	}
	
	void makeDeposit(double amount)
	{
		if(amount>0)
		{
			System.out.println("You wish to deposit "+amount);
			balance=balance+amount;
			System.out.println("Your new balance is " +getBalance());
		}
		else
			System.out.println("Amount is negative, can't be deposited \n");
	}
	
	  
	//abstract void makeDeposit(double amount);
	//abstract void makeWithdrawal(double amount);

    @Override
    public String toString() {
        return "account{" + "accountNo=" + accountNo + ", balance=" + balance + ", dateCreated=" + dateCreated + ", transactionAmount=" + transactionAmount + "name"+C1.getName() + "Address"+C1.getAddress()+"phone no"+C1.getPhoneNo();
    }


}
