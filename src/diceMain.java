/**
* Khiem Trinh
* Professor Durendal
* CS112 Section 88195
* Tuesday 7 PM
* Week 13 Exam 3
* Dice Game - One Dice
*/

import java.util.Scanner;

public class diceMain
{
    public static void main(String[] args)
    {
    String computer;
    String user;
    String play;
    Scanner keyboard = new Scanner(System.in);
    Scanner scan = new Scanner(System.in);

// Constructor Call from Main -----------------------------------------------------------------   
    // Instantiate a new object called welcomeInfo from constructor public Welcome
    // 	Pass values to the appropriate fields
    Welcome welcomeInfo = new Welcome( "::: Welcome", "Dices Guess Hi-Lo", "Good Luck and Have Fun!" ); 
    // Print out the complete message with passed values to the constructor
    System.out.println(welcomeInfo.introMessage + " to the " + welcomeInfo.gameName +
    		" Game! :::\n" + "       ::: " + welcomeInfo.messageInfo + " :::\n" );
// Constructor Call from Main -----------------------------------------------------------------   

    
    	// Play the game as long as there is a tie.
    	// Create a new object called winner
    	DetermineWinner winner = new DetermineWinner();
    	
    	do
    	{
    		do 
    		{
    			// Get the computer's choice.
    			// Call computerChoice method from RandomClass.java
    			computer = ComputerChoice.computerChoice();

    			// Get the user's choice.
    			// Call userChoice method from RandomClass.java
    			user = UserChoice.userChoice(keyboard);

    			// Determine the winner.
    			// Call determineWinner method from RandomClass.java
    			String output = winner.determineWinner(computer, user);
    			System.out.println(output);
    		} 
    		while (user.equalsIgnoreCase(computer));
    		// Exit inside Do-While Loop

			System.out.println("Do you want to play again? Yes or No\n");
            play = scan.next();
    	}
    	while(play.equalsIgnoreCase("YES"));
    	// Exit outside Do-While Loop
    	
		System.out.println( "Total Score: " +
							"\nWins = " + winner.winCount +
							"\nLoss = " + winner.loseCount +
							"\nDraws = " + winner.drawCount );
    	keyboard.close();
    	scan.close();
    
    } // end main
} // end class testMain