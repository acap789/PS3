package Base;

public class InsufficientFundsException {
	
	private double amount;
	
	public InsufficientFundsException(double amount){
		this.amount = amount;
	}
	public double getOverDrawn() {
		return amount;
	}
}
