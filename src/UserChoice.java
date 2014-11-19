import java.util.Scanner;

public class UserChoice
{
	// 3 Move objects: Rock, Paper, Scissors
	// Initialize variables;
	Scanner keyboard = new Scanner(System.in);
	
	// Constructor with (variables/fields) to pass values
	public UserChoice() 
	{
		// Code placeholder
	} // end constructor Welcome

	// Hi:  More than half of dice(s) value  (1 dice this means 4,5,6  .... 2 dices means 7 to 12....)
	// Lo:  Less than or equal to half of dice(s) value (1 dice this means 1,2,3  .... 2 dices means 1 to 6....)
	
	// Method should return the user's choice.
	public static String userChoice(Scanner keyboard) 
	{
		// Ask the user for input
		System.out.print( "Guess: 6 = HI or 1 = LO " );

		// Assign the user's input 1, 2, or 3 as integer value to userChoice variable
		int userChoice = keyboard.nextInt();
		
		// Takes userChoice integer value, translates through getChoice method
		// 1 to "rock", 2 to "paper", 3 to "scissors"
		// Once translated, assign new string value to play variable
		String play = Translation.getChoice (userChoice);

		// Validate the choice using While Loop
		while (play == null) 
		{
			if ( userChoice < 1 || userChoice > 2 )
			{
				System.out.println("\nOops! Not a Valid Move! Try Again!");
				System.out.println( "Enter 1 - Hi or 2 - Low: " );
			}
			userChoice = keyboard.nextInt();
			play = Translation.getChoice (userChoice);
		} // end While Loop
		
		// Return the user's choice as a string value, assign to play variable
		return play;
	}
	
} // end class UserChoice