package encapsulation;

public class BankAccountTester {

	public static void main(String[] args) {
		BankAccount account = new BankAccount("123456789", 1000, "vinodh", "225 5th Main");
		
		
		account.setBalance(2000);
		
		System.out.println("Account Number: " + account.getAccountNumber());
		System.out.println("Balance: $ " + account.getBalance());
		System.out.println("Owner Name: " + account.getOwnerName());
		System.out.println("Address: " + account.getAddress());
		
		
		account.setBalance(-1); //negative value
		
		System.out.println("Account Number: " + account.getAccountNumber());
		System.out.println("Balance: $ " + account.getBalance());
		System.out.println("Owner Name: " + account.getOwnerName());
		System.out.println("Address: " + account.getAddress());

	}

}
