package encapsulation;

public class BankAccount {

	private String accountNumber;
	private double balance;
	private String ownerName;
	private String address;

	public BankAccount(String accountNumber, double balance, String ownerName, String address) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.ownerName = ownerName;
		this.address = address;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if (balance < 0) {
			System.err.println("\nError; Balance cannot be set to negative value");
		} else {
			this.balance = balance;
		}
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
