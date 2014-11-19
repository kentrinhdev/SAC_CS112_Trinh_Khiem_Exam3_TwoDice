public class Translation
{
	// 3 Move objects: Rock, Paper, Scissors
	// Initialize variables;
	
	// Constructor with (variables/fields) to pass values
	public Translation() 
	{
		// Code placeholder
	} // end constructor Welcome

	// Method to get and return choice
	// 1 translates to "rock", 2 translates to "paper", 3 translates to "scissors"
	public static String getChoice (int number) 
	{
		String choice;
    
		switch (number) 
		{
        	case 1:
        		choice = "LO";
        		break;
        	case 2:
        		choice = "LO";
        		break;
        	case 3:
        		choice = "LO";
        		break;
        	case 4:
        		choice = "HI";
        		break;
        	case 5:
        		choice = "HI";
        		break;
        	case 6:
        		choice = "HI";
        		break;
        	default:
        		choice = null;
		}
    
    return choice;
	}
	
} // end class Translation
