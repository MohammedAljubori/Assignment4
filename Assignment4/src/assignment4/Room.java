
	 package assignment4;
/**
 * @author Mohammed Aljubori
 * 8/20/2014
 * Class containing setters, getters, constructors, and toString
 */
public class Room {
		
		
		/**
		 * Variables
		 */
		private String wall;
		private String floor;
		private int window;
		
		
		/**
		 * Constructs a new room that has colored walls and contains 
		 * a material for flooring and a certain number of windows.
		 */
		
		public Room() {
			this.wall = "color";
			this.floor = "wood";
			this.window = 0;
		}

	   /**
		* Constructs a new room that has walls, a material for flooring, and a number of windows based on the arguments.
	    *@param wall set wall
	    *@param floor set floor
	    *@param window set window
		*/
		
		public Room(String wall, String floor, int window){
			this.wall = wall;
			this.floor = floor;
			this.window = window;
		}
		
		/**
		 * Gets wall
		 * @return wall Gets wall
		 */
		
		public String getWall(){
			return wall;
		}
		
		/**
		 * Sets wall
		 * @param wall Set wall
		 */
		
		public void setWall (String wall){
			this.wall = wall;
		}
		
		/**
		 * Gets floor
		 * @return floor get floor
		 */
		
		public String getFloor(){
			return floor;
		}
		
		/**
		 * Sets floor
		 * @param floor Set floor
		 */
		
		public void setFloor (String floor){
			this.floor = floor;
		}
		
		/**
		 * Gets window
		 * @return window get window
		 */
		
		public int getWindow(){
			return window;
		}
		
		/**
		 * Sets window
		 * @param window Set windows
		 */
		
		public void setWindow (int window){
			this.window = window;
		}
		/**
		 * toString returns parameters of object Room
		 */
		public String toString() {
			return "The floor material is "+floor+", the color is "+wall+", and there are "+window+" windows.";
		}
}            