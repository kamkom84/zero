package UsernamePassword;

import java.util.Scanner;

public class UsernamePassword {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
			System.out.print("Username: ");
			String usernameInput = scan.nextLine();
			
			System.out.print("PassWord: ");
		    String passwordInput = scan.nextLine();		
		
				if(usernameInput.equals("Kamen") && passwordInput.equals("kamkom")) {
					System.out.println("Login successful.");
				}
				else {
					System.out.println("Login FAILED.");
				}
	}
	

}
