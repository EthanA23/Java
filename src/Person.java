/*
Author: Ethan Aghai
Date: 9/28/17 
Person for TextAdventure
*/

public class Person {

	//declare attributes or object
	private String name;
	private String gender;
	
	//zero argument constructor
	public Person() {
		this.name = "";
		this.gender = "";
	}
	
	//loaded constructor
	public Person(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	
	//getters and setters for attributes
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
}
