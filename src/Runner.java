/*
Author: Ethan Aghai
Date: 9/14/17 
Added Person
Date: 9/28/17
Added Soldier
Date: 10/19/17
Menu for TextAdventure
Date: 5/3/18
Mission for TextAdventure
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
		System.out.println("It's March 20, 2022 and Kim Jung Un has just lainched a nuclear missle headed for the United States.");
		
		System.out.println("Our President has just launched Operation Frontline and you are a new recruit apart of an elite group of military men chosen to go into battle.");

		System.out.println("However, you need to earn your way up through a series of missions to obtin the highest status as General of the Army!");
		
		System.out.println("You will go through weeks of rigerous training so you can have the knowledge to fight in the frontlines against the North Korean army ultimatley roving to our country that you are worthy of such a high status.");
		
		System.out.println("Once you are chosen as Genral of the Army, it will be your job to protect the United States of America and win the war.");
		
		System.out.println("But, if you lose the war, it's GAME OVER!");
		
		System.out.println("ARE");
		
		System.out.println("YOU");
		
		System.out.println("READY!");
		
		System.out.println("Welcome!");
		
		System.out.println("What's your name?");
		
		String name = scanner.next();
		
		System.out.println("What's your gender?");
		
		String gender = scanner.next();
		
		System.out.println("Create a username.");
		
		System.out.println("Your username must be at least 4 characters long.");
		
		String userName = "";
		
		while(true){
		userName = scanner.next();
		
		if(userName.length() > 3){
			System.out.println("Your username passes validation. " + "Hi, " + userName);
			break;
			
		}
			//userName is not at least 4 characters
			//tell the user that there is an error with the given userName
		else{ 
			System.out.println("Username must be at least 4 characters long.");
		}
	}
		
		System.out.println("Hi " + userName + ", you have started as the lowest class, Private,"
				+ " and will go through a series of missions to be able to move up in rank" + "!");
			
		
		Soldier p1 = new Soldier();
		
		p1.setName(name);
		
		p1.setGender(gender);
		
		System.out.println("Name of Private: " + p1.getName());
		
		System.out.println("Gender of Private: " + p1.getGender());
		
		System.out.println("Your info: " + p1);
		
		Mission mission1 = new Mission(1,4);
		
		mission1.setObjectives("Eliminate all of the enemies!");
		
		System.out.println("Mission 1");
		System.out.println("Objective: The enemy has launched an attack on the United States. "
				+ "Eliminate all who stand in your way of protecting the country!");
		
		int NumberOfEnemies;
		String health;
		
		NumberOfEnemies = (int)(Math.random()*100);
		
		if (NumberOfEnemies <7) {
			health = "100";
		} else {
			health = "0";
		}
		
		if (NumberOfEnemies <80) {
			System.out.println("You completed the mission! Congrats! You are now: " + p1.setStatus());
		} else {
			System.out.println("You DIED!! :(");
			
		}
		if (NumberOfEnemies <80) {
			Status("Private Second Class");
		}
	}
	
}
