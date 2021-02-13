package Scanner;

import java.util.*;
import static java.lang.System.*; 

public class scanner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String   name   = "Kamen";
		String gender   = "male";
		String marriage = "single";
		int    weight   = 95;   
		int       age   = 36;
		
		
		
		
		
//Name:
		System.out.println("What is Your name?");
		scan.hasNextLine();
		String name1 = scan.nextLine();
			if(name1.equalsIgnoreCase(name)) {
				System.out.println("*** You have entered correct name ***");
				System.out.println();
			}
			else if(name != name1){
			System.out.println(">>> WRONG <<<");
			System.out.println("");
			}
		
	
//Age:
		System.out.println("What is your age?");
		scan.hasNextInt();
		int age1 = scan.nextInt();
			if(age1 == age) {
				System.out.println("*** You have entered correct age ***");
				System.out.println();
			}
			else if(age1 != age) {
				System.out.println(">>> WRONG <<<");
				System.out.println();
			}
			
//Gender:
		System.out.println("What is your gender?");
		scan.hasNextLine();
		String genderInput = scan.nextLine();
			if(genderInput.equalsIgnoreCase(gender)) {
				System.out.println("*** You have entered correct gender ***");
				System.out.println();
			}
			
			
	
	
	
	
	
	
	
	
	
	}

}
