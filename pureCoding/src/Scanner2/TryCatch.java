package Scanner2;

//Scanner input, doWhile and tryCatch combo

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = 1;
		
		do {
			try {
				System.out.print("Enter 1st number : ");
				int n1 = input.nextInt();
				System.out.print("Enter 2nd number : ");
				int n2 = input.nextInt();
				int sum = n1 / n2;
//				int sum = n1 * n2;
//				int sum = n1 - n2;
//				int sum = n1 + n2;
				System.out.println("Equals           : " + sum);
//				x = 2;
			}
			catch(Exception e) {
				System.out.println("Can not devide by zero (/0)");
				System.out.println();
			}
		}while(x == 1);
	}

}














































