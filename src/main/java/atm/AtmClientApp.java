package atm;

import java.util.Scanner;

public class AtmClientApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Atm myAtm = new Atm(500, "1111"); // make Object (balance, pin)

		// ask user for PIN
		System.out.println("Please enter your PIN:");
		String enteredPin = input.nextLine(); // PIN is a String becasue it doesn't need to do or mess up any math

		if(!myAtm.getPin().equals(enteredPin)) {
			System.out.println("Sorry, that is not the correct PIN");
		}
		 //want to loop this so user can re-enter PIN --> make into a giant do/while loop? 
		
		
		if (myAtm.getPin().equals(enteredPin)) { // uses accessor method getPin
			System.out.println("Welcome to WCCI Bank!");

			//make into an array?
			
			System.out.println("Choose an option: ");
			System.out.println("Press 1 to deposit funds.");
			System.out.println("Press 2 to withdraw funds.");
			System.out.println("Press 3 to check your balance.");
			System.out.println("Press 4 to exit.");
			String menuOption = input.nextLine();

			// control flow of code into one of these options

			while (!menuOption.contentEquals("4")) { // loop while menuOption does not equal 4

				if (menuOption.contentEquals("1")) {
					System.out.println("Enter deposit amount: ");
					int amountToDeposit = input.nextInt();
					myAtm.deposit(amountToDeposit);
					input.nextLine(); // gives us input separation

				} else if (menuOption.equals("2")) {
					System.out.println("Enter withdraw amount:");
					int amountToWithdraw = input.nextInt();
					myAtm.withdraw(amountToWithdraw);
					input.nextLine(); // gives us input separation

				} else if (menuOption.contentEquals("3")) {
					System.out.println("Your current balance is " + myAtm.getBalance());
				} else {
					System.out.println("You have exited. Thank you for banking with us today! Goodbye.");
					System.exit(0);  //need to figure out how to loop this so it prints after "another" option
				}

				System.out.println("Choose another option: ");
				System.out.println("Press 1 to deposit funds.");
				System.out.println("Press 2 to withdraw funds.");
				System.out.println("Press 3 to check your balance.");
				System.out.println("Press 4 to exit.");
				menuOption = input.nextLine();
			}

		}

		input.close();
	}
}
