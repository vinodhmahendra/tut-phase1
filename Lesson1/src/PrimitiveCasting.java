import java.util.Scanner;

public class PrimitiveCasting {

	public static void main(String[] args) {
//		
//		char c = 'A'; // 16 -bit (unsigned) -- Range 0 to 65535
//		short s = c; // 16 -bit  error? (signed (-ve/+ve)
//		   
		System.out.println("Enter Product Price : ");
		Scanner scanner = new Scanner(System.in);
		String inputPrice = scanner.nextLine();
		
//		double productPrice = 19.99;
		double productPrice = Double.parseDouble(inputPrice);
		
		int totalCents = (int) (productPrice * 100);
		System.out.println("Total price in cents: " + totalCents);

	}

}
