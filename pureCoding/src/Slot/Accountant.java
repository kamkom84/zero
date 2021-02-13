package Slot;

import java.util.Scanner;

public class Accountant {
	
	Scanner scan = new Scanner(System.in);


	public void Result (double bet, double win) {
		System.out.println("Bet      : " + bet);
		System.out.println("Win      : " + win);

		if(bet < win) {
			System.out.println();
			System.out.println("You Won  : " + (win - bet));
		}
		else if(bet > win) {
			System.out.println();
			System.out.println("You Lost : " + (bet - win));
		}
	}

	public void ResultScanner() {
		System.out.print("Enter Your bet: ");
		double bet = scan.nextDouble();
		
		System.out.print("Enter Your win: ");
		double win = scan.nextDouble();
		
		if(bet < win) {
			System.out.println("You Won       : " + (win - bet));
			System.out.println();
		}
		else if(bet > win) {
			System.out.println("You Lost      : " + (bet - win));
			System.out.println();
		}
	}
	
	public void Freebet() {

		double freebetIN = 0;
		double realWin   = 0;

		System.out.print("Freebet IN: ");
		double freebetIN1 = scan.nextDouble();

		System.out.print("Win       : ");
		double win = scan.nextDouble();  

		if(win > freebetIN) { 
			realWin = win - freebetIN1;
			System.out.println("Result    : " + realWin);  
		}
	}
}

























