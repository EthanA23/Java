/*
Author: Ethan Aghai
Date: 10/5/17 
Soldier for TextAdventure
*/

public class Soldier extends Person{

	// attributes
	private int health;
	private boolean isAlive;
	private Status rank;

	
	//constructors
	public Soldier() {
		this.health = 100;
		this.isAlive = true;
		this.rank = Status.Private;
	}
	
	public Soldier(int health) {
		this.health = health;
		this.isAlive = true;
		
	}
	
	//mutators
	public void setHealth(int health) {
		this.health = health;
	}
	
	public int getHealth() {
		return this.health;
	}
	
	public void setStatus(Status status) {
		this.rank = status;
	}
	
	public Status getStatus() {
		return this.rank;
	}
	
	public boolean getisAlive() {
		return this.isAlive;
	}
	public void setisAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	
	//toString
	public String toString() {
		return " health: " + this.health + " isAlive: " + this.isAlive + " status: " + this.rank;
		
	}
}
