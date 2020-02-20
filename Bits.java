import java.util.Scanner; //imports scanner 

public class Bits {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); //declare a new scanner object
		System.out.print("Enter an integer: "); //prompt user for input
		int integer = in.nextInt(); //set user input equal to 'integer'
		System.out.print("Would you like to set, unset, or flip a bit? (s, u, or f): "); //prompt user for input
		String operation = in.next(); //set user input equal to 'operation'
		System.out.print("Which bit would you like to change? (0-31): "); //prompt user for input
		int bit = in.nextInt(); //set user input equal to 'bit'
		int result; //initialize 'result'
		String operationString; //initialize 'operationString'
		int singleBit = 1; /*set 'singleBit' equal to one, this is the bit that I 
							will shift to get to the bit the user wants to change*/
		

		singleBit = singleBit<<bit; //shifts the singleBit over to the correct location
		
		if(operation.equals("s")) //runs if user wants to set
		{
			result = (integer | singleBit); //does the setting
			operationString = "setting"; //sets the string 'operationString" equal to the action happening
			
		}
		else if(operation.equals("u")) //runs if user wants to unset
		{
			singleBit = ~singleBit; //flips all the bits in the singleBit
			result = (integer & singleBit); //does the unsetting
			operationString = ("unsetting"); //sets the string 'operationString" equal to the action happening
		}
		else //runs if user wants to flip (or if user enters something other than s, u, or f)
		{
			result = (integer ^ singleBit); //does the flipping
			operationString = "flipping"; //sets the string 'operationString" equal to the action happening
		}
		
		System.out.println("The result of " + operationString + 
				" bit " + bit + " in " + integer + " is " + result); //outputs the result for the user
			
			
		
		

	}

}
