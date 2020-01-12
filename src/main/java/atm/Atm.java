package atm;

public class Atm {

	private double balance;
	private String requiredPin = "1234";
//Stretch Task: use java.math.BigDecimal to store balance instead of double.
		
	public Atm(double balance, String requiredPin) {
		this.balance = balance;
		this.requiredPin = requiredPin;
	}

	public double getBalance() {
		return balance;
	}

	public String getPin() {
		return requiredPin; //accessor method - keeps our requiredPin private
	}
	
	
	public void withdraw(double amount) {
		if (balance > amount) {
			balance -= amount;
		} else {
			balance -= balance;
		}
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public boolean allowAccess(String enteredPin) {
		if (requiredPin.equals(enteredPin)) {
			return true;
		}

		return false;

	}

} // class