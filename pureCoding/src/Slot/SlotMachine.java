package Slot;

import java.util.Scanner;

public class SlotMachine {

	public static void main(String[] args) {

		//Scanner input = new Scanner(System.in);
		Accountant acc = new Accountant();

		
//2.		
//		acc.Result(200.00, 10000.00);





//2.
//		int build = 0;
//		while(build <= 100) {
//			acc.ResultScanner();
//			build++;
//		}
		


		
////3.		
//		int x = 0;
//		do {
//			
//			System.out.print("Bet : ");
//			double bet = input.nextDouble();
//
//			System.out.print("Win : ");
//			double win = input.nextDouble();
//
//			if(bet < win) {
//				System.out.println("Won : " + (win - bet));
//				System.out.println();
//			}
//			else if(bet > win) {
//				System.out.println("Lost  : " + (bet - win));
//				System.out.println();
//			}
//		}while(x == 1000);



		
////4. Free bet calculation:
		
		
		
		System.out.println();
		
		int calc = 1;
		
			do {
				acc.Freebet();
			
					System.out.println();
		
			}while(calc == 1);
			
		
		
		

	}

}
