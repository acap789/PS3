package Base;

import java.util.Date;
import org.junit.Test;
import juni.framework.TestCasw;

public class Test {
	
	int id = 1122;
	double balance = 20000;
	double annualInterestRate = 4.5;
	
	
	public void WithdrawTest(){
		Account Account = new Account (id,balance);
		balance -= 2500;
		Account.Deposit(2500);
		assertEquals(balance,Account.getbalance(),0);
	}
	
	public void DepositTest(){
		Account Account = new Account(id,balance);
		balance += 3000;
		Account.Deposit(3000);
		assertEquals(balance,Account.getbalance(),.1);
	}
	
	(expected = InsufficientFundsException.class)
	public void TestOverDraft() throws InsufficientFundsException{
		Account Account = new Account(id,balance);
		Account.Withdraw(1000000000);
	}
	
	public void Print(){
		Account act = new Account(id,annualInterestRate);
		double balance = act.getbalance();
		Date datecreated = act.getDateCreated();
		System.out.print("Your balance is $" + balance + "monthly interest is " + annualInterestRate + "%" + "and date is " + datecreated);
	}

}
