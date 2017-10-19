/*
Author: Ethan Aghai
Date: 9/14/17 
Added Person
Date: 9/28/17
Added Soldier
Date: 10/19/17
Menu for TextAdventure
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Runner{
	
	public static void main (String[] args) {
		
		Splash splash = new Splash();
		splash.splashScreen();
		
		//declare to start getting user input
		Scanner scanner = new Scanner(System.in);
		
		//prompt the user with a question to provide input
		System.out.println("Welcome!");
		
		System.out.println("What's your name?");
		
		String name = scanner.next();
		
		System.out.println("What's your gender?");
		
		String gender = scanner.next();
		
		System.out.println("Hi " + name + ", you have started as the lowest class, Private,"
				+ " and will go through a series of missions to be able to move up in rank" + "!");
			
		
		Soldier p1 = new Soldier();
		
		p1.setName(name);
		
		p1.setGender(gender);
		
		System.out.println("Name of Private: " + p1.getName());
		
		System.out.println("Gender of Private: " + p1.getGender());
		
		System.out.println("Your info: " + p1);
	
	
	
	}

}
