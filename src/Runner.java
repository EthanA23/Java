/*
Author: Ethan Aghai
Date: 9/14/17 
Added Person
Date: 9/28/17
Runner for TextAdventure
*/

public class Runner{
	
	public static void main (String[] args) {
		
		Splash splash = new Splash();
		
		splash.splashScreen();
		
		splash.splashScreen2();
		
	Person Ethan = new Person("Ethan", 15, "male");
	
	Ethan.setName("Ethan");
	
	System.out.println("Name of person: " + Ethan.getName());
	
	System.out.println("Age of person: " + Ethan.getAge());
	
	System.out.println("Gender of person: " + Ethan.getGender());
	
	}

}
