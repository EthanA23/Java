/*
Author: Ethan Aghai
Date: 1/18/18
Date: 1/25/18 
Enemy for TextAdventure
*/
public class Enemy {
	
	//object properties
	private int difficultyLevel;
	private int health;
	private boolean isAlive;
	
	//class constructor
	public Enemy() {
		this.health = 100;
		this.isAlive = true;
		this.difficultyLevel = 1; 
				
	}
	
	public Enemy(int health) {
		this.health = health;
		this.isAlive = true;
		
	}
	
	//getters and setters
	public void setDifficultyLevel(int difficultyLevel) {
		this.difficultyLevel = difficultyLevel;
	}
	
	public int getDifficultyLevel() {
		return this.difficultyLevel;
	
	}
	
	public void setHelth(int health) {
		this.health = health;
		
	}
	
	public int getHealth() {
		return this.health;
		
	}
	
	public void setIsAlive(boolean isAlive) {
		this.isAlive = isAlive;
		
	}
	
	public boolean getIsAlive() {
		return this.isAlive;
		
	}
	
	//toString function
	public String toString() {
		return " health " + this.health + " isAlive " + this.isAlive + " 1: " + this.difficultyLevel;
		
	}
	
}
