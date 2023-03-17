package exceptions;

public class BankAccount {
	
	private int balance;
	
	public BankAccount(int initBalance) {
		balance = initBalance;
	}

	public void deposit(int amount) {
		balance += amount;
	}
	
	public void withdraw(int amount) throws InsufficientFundsException {
		if ( amount > balance) {
		 throw new InsufficientFundsException("Not enough money in account");
		}
		balance -= amount;
	}
	
	
	public int getBalance() {
		return balance;
	}


}

