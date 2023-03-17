package assignment;

import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first number:");
		double num1 = input.nextDouble();

		System.out.println("Enter the second number:");
		double num2 = input.nextDouble();

		System.out.println("Select an operation (+,-,*,/):");
		char operator = input.next().charAt(0);

		double result;

		switch (operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 + num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			if (num2 == 0) {
				System.out.println("Error: division by zero");
				return;
			}
			result = num1 / num2;
			break;

		default:
			System.out.println("Invalid Operator");
			return;
		}
		System.out.println("Result: " + result);

	}

}
