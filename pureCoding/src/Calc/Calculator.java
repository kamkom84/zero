package Calc;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {


		Scanner keyboard = new Scanner(System.in);

		String answer;
		do {
			System.out.println("Enter the price: ");
			double price = keyboard.nextDouble();

			System.out.println("Enter the quatity: ");
			int qty = keyboard.nextInt();

			double total = price * qty;

			System.out.println("The total is " + total);

			System.out.println("Another calculation? y/n");
			answer = keyboard.next();
		}
		while(answer.equalsIgnoreCase("y"));


	}

}
