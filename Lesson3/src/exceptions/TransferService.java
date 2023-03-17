package exceptions;

public class TransferService {

	public void transfer(BankAccount from, BankAccount to, int amount) throws InsufficientFundsException {
		from.withdraw(amount);
		to.deposit(amount);
	}

}
