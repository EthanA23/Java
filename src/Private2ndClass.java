/*
Author: Ethan Aghai
Date: 9/14/17 
Date: 10/5/17
Private2ndClass for TextAdventure
*/

public class Private2ndClass extends Soldier {

		//attributes
		private String status;
		
		//constructors
		public Private2ndClass() {
			this.status = "soldier";
		}
		
		//mutators
		public String getStatus() {
			return this.status;
		}
		
		public void setStatus(String status) {
			this.status = status;
		}
		
		//toString method
		public String toString() {
			return super.toString() + " ---- I am a Private 2nd Class Soldier!";
		}
	}