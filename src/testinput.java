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
		int numberCount = 0;
		
		//prompt the user for userName
		System.out.println("Create a username.");
		System.out.println("Your username must be at least 4 characters long.");
		
		while(true){
			//get the user response
			userName = input.next();
			
			//give feedback on what user gave as input
			System.out.println("You chose your username: " + userName);
			
			//check if there is at least 1 number and 3 letters in userName
			if(userName.length() > 3){
				System.out.println("Your username passes validation. " + "Hi, " + userName);
				break;
				
			}
				//userName is not at least 4 characters
				//tell the user that there is an error with the given userName
			else{ 
				System.out.println("Username must be at least 4 characters long.");
			}
					
		}//end of while-loop
		
	}//end of main
	
}//end of class
		
	

