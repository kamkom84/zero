package Home;

import java.util.Scanner;

public class Console {
	
	Scanner scan = new Scanner(System.in);
	
	public void Smoking(Scanner scan2) {
		System.out.println(">>>");
		scan.hasNextLine();
		String consoleInput = scan.nextLine();
		 
		
		String yes = "y";
		String no  = "n";
			if(consoleInput.equalsIgnoreCase(yes)) {
				System.out.println("yes".toUpperCase());
				System.out.println();
				
			}
			if(consoleInput.equalsIgnoreCase(no)) {
				System.out.println("no".toUpperCase());
				System.out.println();
			}
		
		
		
		String joint = "joint";
		String tabaco = "tabaco";
			if(consoleInput.equalsIgnoreCase(joint)) {
				System.out.println("joint");
				System.out.println();
			}
			if(consoleInput.equalsIgnoreCase(tabaco)) {
				System.out.println("tabaco".toUpperCase());
				System.out.println();
			}
			
	}
	
	

}
