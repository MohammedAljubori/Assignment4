package assignment4;

public class RoomDriver {

	public static void main(String[] args) {
		/**
		 * @author Mohammed Aljubori 8/22/2014 Resource class that runs from
		 *         Assignment4.java Constructs 3 Rooms and outputs them
		 */

		/**
		 * Creates Room1 with yellow walls, wood floor, 1 window, and then
		 * prints the output
		 */

		Room Room1 = new Room("yellow", "wood", 1);
		System.out.println(Room1.toString());

		/**
		 * Creates Room2 with purple walls, tile floor, 0 windows, and then
		 * prints the output
		 */

		Room Room2 = new Room("purple", "tile", 0);
		System.out.println(Room2.toString());

		/**
		 * Creates Room3 with white walls, carpet floor, 3 windows, and then
		 * prints the output
		 */

		Room Room3 = new Room("white", "carpet", 3);
		System.out.println(Room3.toString());
	}
}



