/*
 	Test string manipulation and user input validation
 */

import java.util.Scanner; //import for user input
public class testinput{
	
	 //main method
	public static void main(String [] args) {
		
		//initiate Scanner object to get user input
		Scanner input = new Scanner(System.in);
		String userName = "";
		int letterCount = 0;
		int numberCount = 0;
		
		//prompt the user for userName
		System.out.println("Create a username.");
		System.out.println("Your username must be at least 4 characters long \n" 
							+ "with at least 3 letters and at least 1 number...");
		
		while(true){
			//get the user response
			userName = input.next();
			
			//give feedback on what user gave as input
			System.out.println("You chose your username: " + userName);
			
			//check your input is at least 4 characters
			if(userName.length() >= 4) {
				System.out.println("Hi, " + userName);
				
			}
			else {//userName is not at least 4 characters
				//tell the user that there is an error with the given userName
				System.out.println("Username needs to be at least 4 characters long.");
			}
			
			//check each character in userName for a number
			for(int i = 0; i < userName.length(); i++){
				//check is the current character is a digit
				if(Character.isDigit(userName.charAt(i))){
					numberCount++; //nuberCount = numberCount + 1
				}
				
				//check if the current character is a letter
				if(Character.isDigit(userName.charAt(i))){
					letterCount++;
				}
			}
			
			//check of there is at least 1 number and 3 letters in userName
			if(numberCount > 0 && letterCount > 2){
				System.out.println("Your username passes validation.");
				break;

			}
			else {
				System.out.println("UserName needs at least 3 letters and at least 1 number.");
			}
			
		}//end of while-loop
		
	}//end of main
	
}//end of class
		
	

