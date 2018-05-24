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
import java.util.concurrent.TimeUnit;
public class Runner{
	
	public static void main (String[] args) {
		
		Splash splash = new Splash();
		splash.splashScreen();
		
		//declare to start getting user input
		Scanner scanner = new Scanner(System.in);
		
		//prompt the user with a question to provide input
		pause(4000);
		
		System.out.println("It's March 20, 2022 and Kim Jung Un has just launched a nuclear missle headed for the United States.");
		pause(6000);
		
		System.out.println("Our President has just initiated Operation Frontline and you are a new recruit apart of an elite group of military men chosen "
				+ "to go into battle.");
		pause(8000);
		
		System.out.println("However, you need to earn your way up through a series of missions to obtain the highest status as General of the Army!");
		pause(10000);
		
		System.out.println("You will go through weeks of rigerous training so you can have the knowledge to fight in the frontlines against the North Korean "
				+ "army ultimatley proving to our country that you are worthy of such a high status.");
		pause(16000);
		
		System.out.println("Once you are chosen as Genral of the Army, it will be your job to protect the United States of America and win the war.");
		pause(6000);
		
		System.out.println("But, if you lose the war, it's GAME OVER!");
		pause(3000);
		
		System.out.println("ARE");
		pause(1000);
		
		System.out.println("YOU");
		pause(1000);
		
		System.out.println("READY!!!");
		pause(3000);
		
		System.out.println("Welcome!");
		pause(2000);
		
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
		pause(10000);
		
		Soldier p1 = new Soldier();
		
		p1.setName(name);
		
		p1.setGender(gender);
		
		System.out.println("Name of Private: " + p1.getName());
		
		System.out.println("Gender of Private: " + p1.getGender());
		
		System.out.println("Your info: " + p1);
		
		Mission mission1 = new Mission(1,4);
		
		mission1.setObjectives("Eliminate all of the enemies!");
		pause(8000);
		
		System.out.println("Mission 1");
		pause(1000);
		System.out.println("Objective: The enemy has launched an attack on the United States. "
				+ "Eliminate all who stand in your way of protecting the country!");
		
		int NumberOfEnemies;
		String health;
		
		NumberOfEnemies = (int)(Math.random()*100);
		
		if (NumberOfEnemies <80) {
			health = "100";
		} else {
			health = "0";
		}
		
		if (NumberOfEnemies <80) {
			pause(6000);
			p1.setStatus(Status.PrivateSecondClass);
			System.out.println("You completed the mission! Congrats! You are now: " + p1.getStatus());
			pause(6000);
			System.out.println("Mission 2");
			pause(1000);
			System.out.println("Objective: Congratulations on eliminating the enemies, however they have just sent "
					+ "in reinforcements. Eliminate all who stand in your way of protecting the country!");


			
			if (NumberOfEnemies <70) {
				pause(8000);
				p1.setStatus(Status.PrivateFirstClass);
				System.out.println("You completed the mission! Congrats! You are now: " + p1.getStatus());
				pause(10000);
				System.out.println("Congratulations on eliminating the reinfordements. You can now go hit "
						+ "the showers and take a breather.");

						pause(6000);
						System.out.println(" ________  ________  ________   ________  ___  ___  ___       \n" + 
								"|\\   __  \\|\\   __  \\|\\   ___  \\|\\   ____\\|\\  \\|\\  \\|\\  \\      \n" + 
								"\\ \\  \\|\\ /\\ \\  \\|\\  \\ \\  \\\\ \\  \\ \\  \\___|\\ \\  \\ \\  \\ \\  \\     \n" + 
								" \\ \\   __  \\ \\   __  \\ \\  \\\\ \\  \\ \\  \\  __\\ \\  \\ \\  \\ \\  \\    \n" + 
								"  \\ \\  \\|\\  \\ \\  \\ \\  \\ \\  \\\\ \\  \\ \\  \\|\\  \\ \\__\\ \\__\\ \\__\\   \n" + 
								"   \\ \\_______\\ \\__\\ \\__\\ \\__\\\\ \\__\\ \\_______\\|__|\\|__|\\|__|   \n" + 
								"    \\|_______|\\|__|\\|__|\\|__| \\|__|\\|_______|   ___  ___  ___ \n" + 
								"                                               |\\__\\|\\__\\|\\__\\\n" + 
								"                                               \\|__|\\|__|\\|__|\n" + 
								"                                                              ");
						pause(1000);
						System.out.println(" ________  ________  ________   ________  ___  ___  ___       \n" + 
								"|\\   __  \\|\\   __  \\|\\   ___  \\|\\   ____\\|\\  \\|\\  \\|\\  \\      \n" + 
								"\\ \\  \\|\\ /\\ \\  \\|\\  \\ \\  \\\\ \\  \\ \\  \\___|\\ \\  \\ \\  \\ \\  \\     \n" + 
								" \\ \\   __  \\ \\   __  \\ \\  \\\\ \\  \\ \\  \\  __\\ \\  \\ \\  \\ \\  \\    \n" + 
								"  \\ \\  \\|\\  \\ \\  \\ \\  \\ \\  \\\\ \\  \\ \\  \\|\\  \\ \\__\\ \\__\\ \\__\\   \n" + 
								"   \\ \\_______\\ \\__\\ \\__\\ \\__\\\\ \\__\\ \\_______\\|__|\\|__|\\|__|   \n" + 
								"    \\|_______|\\|__|\\|__|\\|__| \\|__|\\|_______|   ___  ___  ___ \n" + 
								"                                               |\\__\\|\\__\\|\\__\\\n" + 
								"                                               \\|__|\\|__|\\|__|\n" + 
								"                                                              ");
						
						pause(2000);
						System.out.println("Okay soldier get up we are under attack you must go and defend the perimeter "
								+ "of the base.");
						pause(5000);
						System.out.println("MOVE");
						pause(1000);
						System.out.println("MOVE");
						pause(1000);
						System.out.println("MOVE!!!");
						pause(2000);
						System.out.println("Mission 3");
						pause(1000);
						System.out.println("Objective: Defend the perimeter of the base and don't let any enemy in under "
								+ "any circumstances");
						if (NumberOfEnemies <60) {
							pause(6000);
							p1.setStatus(Status.ArmySpecialist);
							System.out.println("You completed the mission! Congrats! You are now: " + p1.getStatus());
						
						} else {
							pause(6000);
							System.out.println("You DIED!! :(");
					
						}

						
				} else {
					pause(8000);
					System.out.println("You DIED!! :(");
			
				}
			
		} else {
			pause(6000);
			System.out.println("You DIED!! :(");
			
	
			}
		}
		
	public static void pause(int length) {
		
		try {
			Thread.sleep(length);
			}
		
		catch (Exception e) {
			System.out.println(e);
		}
	}

}

	

