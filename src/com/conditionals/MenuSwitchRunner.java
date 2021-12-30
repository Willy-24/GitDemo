package com.conditionals;

import java.util.Scanner;

/*Problem Statement-
*
* #Ask user for input- Enter number 1 and Enter number 2
* # Choose an operation-add, multiply,divide, subtract
* # Publish result
* */
public class MenuSwitchRunner {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);// we are passing arguement whatever user is inputing.

		System.out.print("Enter number 1");
		int number1 = scanner.nextInt();

		System.out.println("You Entered number 1: " + number1);

		System.out.print("Enter number 2");
		int number2 = scanner.nextInt();

		System.out.println("You Entered number 2: " + number2);

		System.out.println("Menu- Your choices are-");
		System.out.println("1- Add");
		System.out.println("2- Multiply");
		System.out.println("3- Divide");
		System.out.println("4- Subtract");

		System.out.println("Enter your Choice");
		int choice = scanner.nextInt();

		System.out.println("You Entered choice " + choice);

		// Always put a break after every case. If u dont put, then all cases will print
		// after the case that meets the condition.
		// we can have default case anywhere in the cases, it can be in the top also,
		// still the result will be same
// We can use switch only on char, int, short, byte, others like long, float, enum, boolean etc it will give compilation error
		switch (choice) {
		case 1:
			System.out.println("Result of Addition=" + number1 + number2);
			break;
		case 2:
			System.out.println("Result of Multiply=" + number1 * number2);
			break;
		case 3:
			System.out.println("Result of Divide=" + number1 / number2);
			break;
		case 4:
			System.out.println("Result of Subtract=" + (number1 - number2));
			break;
		default:
			System.out.println("Invalid operation");
			break;
		}

	}


}
