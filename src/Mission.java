/*
Author: Ethan Aghai
Date: 10/16/17 
Created mission
*/

import java.util.ArrayList;

public class Mission {
	
	private String objective;
	private int difficulty;
	private ArrayList<Enemy> list;

	//loaded constructor
	public Mission(int difficulty, int numOfenemies) {
		this.difficulty = difficulty;
		this.list = new ArrayList<Enemy>();
	}
						
	//getters and setters
	public String getObjective() {
		return this.objective;
	}
	
	public void setObjectives(String objective) {
		this.objective = objective;
	}
	public int getDifficulty() {
		return this.difficulty;
	}
	
	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}
	
	private ArrayList<Enemy> getList() {
		return this.list;
	}
	
	private void setList(ArrayList<Enemy> list) {
		this.list = list;
	}
	
	
}
