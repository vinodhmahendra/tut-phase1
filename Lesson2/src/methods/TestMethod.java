package methods;

public class TestMethod {
	
	
//	public double calculateInterest(double principalAmount ,double interestRate,int duration) {
//		double interestEarned = (principalAmount * interestRate * duration)/100;
//		return interestEarned;
//	}
	
	public static double calculateInterest(double principalAmount ,double interestRate,int duration) {
		double interestEarned = (principalAmount * interestRate * duration)/100;
		return interestEarned;
	}
	
	public static void main(String[] args) {
		//create an object of current class
		TestMethod object = new TestMethod();
		double principalAmount = 5000;
		double interestRate = 7.5;
		int duration = 2;
//		double interestEarned = object.calculateInterest(principalAmount, interestRate, duration);
		double interestEarned = TestMethod.calculateInterest(principalAmount, interestRate, duration);
		System.out.println("Interest earned: " + interestEarned);
	}

}
