package exceptions;

public class TestBank {

	public static void main(String[] args) {
		BankAccount account1 = new BankAccount(1000);
		BankAccount account2 = new BankAccount(500);
		
		System.out.println("Before Transfer:");
		System.out.println("Account1 balance is : " + account1.getBalance());
		System.out.println("Account2 balance is : " + account2.getBalance());
		
		TransferService transferService = new TransferService();
		
		try {
			transferService.transfer(account1, account2, 700);
			System.out.println("Transfer successful");
		}catch (InsufficientFundsException e) {
			System.out.println("Transfer failed: " + e.getMessage());
		}
		
		System.out.println("After Transfer:");
		System.out.println("Account1 balance is : " + account1.getBalance());
		System.out.println("Account2 balance is : " + account2.getBalance());
		

		try {
			transferService.transfer(account1, account2, 700);
			System.out.println("Transfer successful");
		}catch (InsufficientFundsException e) {
			System.out.println("Transfer failed: " + e.getMessage());
		}
		
		System.out.println("After Transfer:");
		System.out.println("Account1 balance is : " + account1.getBalance());
		System.out.println("Account2 balance is : " + account2.getBalance());
		

	}

}
