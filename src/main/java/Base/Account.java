package Base;

import java.util.Date;

public class Account {

	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date datecreated;

	public Account(int id, double balance, double annualInterestRate){
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}
	
	public int getid() {
		return id;
		
	}
	
	public void setid(int id) {
		this.id = id;
	}
	
	public double getbalance() {
		return balance;
	}
	
	public void setbalance(double balance) {
		this.balance = balance;

	}
	
	public double getannualInterestRate() {
		return annualInterestRate(); 
	}
	
	public void setannualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public void setDateCreated(Date dateCreated) {
		this.datecreated = dateCreated;
	}
	
	public double getMonthlyInterestRate() {
		return MonthlyInterestRate();
	}
	
	public void setMonthlyInterestRate(){
		
	}
	
	public void Withdraw (double amount)throws InsufficientFundsException{
		if(amount<=balance) {
			balance -= amount;
		}
		else{
			System.out.println("Insufficent funds");
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
		}
	}
	public void Deposit(double amount){
		balance += amount;
	}
	
}
