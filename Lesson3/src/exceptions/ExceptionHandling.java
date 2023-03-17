package exceptions;

public class ExceptionHandling {
	
	
	public static void main(String[] args) {
		
		try {
			int result = divide ( 10 , 0);
			System.out.println(result);
		}catch(ArithmeticException e) {
			System.out.println("Error : " + e.getMessage());
		}finally {
			System.out.println("Done");
		}
	}

	private static int divide(int i, int j) {
		return i/j;
	}

}
