package atm;

import java.util.Scanner;

public class AtmClientApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Atm myAtm = new Atm(500, "1111"); // make Object (balance, pin)

		System.out.println("Please enter your PIN:");
		String enteredPin = input.nextLine(); // PIN is a String becasue it doesn't need to do or mess up any math


		if (myAtm.getPin().equals(enteredPin)) { // uses accessor method getPin
			System.out.println("Welcome to WCCI Bank!");
		}

		System.out.println("Choose and option: ");
		System.out.println("Press 1 to deposit funds.");
		System.out.println("Press 2 to withdraw funds.");	
		System.out.println("Press 3 to check your balance.");
		System.out.println("Press 4 to exit.");
		String menuOption = input.nextLine();
		
		//control flow of code into one of these options
		
		if(menuOption.contentEquals("1")) {
			System.out.println("Enter deposit amount: ");
			int amount = input.nextInt();
			myAtm.deposit(amount);
		}
		
		
		
		
		
		
		
		
		input.close();
	}
}

// create an instance of Atm. ...from Atm class?

/*
 * PIN
 * 
 * prompt the user for a PIN number via the console.
 *
 * display either a success or failure message based on the PIN the user
 * entered.
 */

/*
 * Allow Deposits display a menu, with only one option for now: Press 1 to
 * deposit funds. prompt the user to select an option. So long as she selects
 * anything other than 1, redisplay the menu. prompt the user for a deposit
 * amount. call the deposit method on Atm to deposit the amount specified.
 * display the current account balance.
 */
