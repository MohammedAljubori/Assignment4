package Assignment1;
import java.util.Scanner;
	/**
	 * @author mohammed aljubori
	 * Date: 9/06/14
	 * Algorithm:
	 * 1) Enter birthyear
	 * 2) Enter an age
	 * 3) Program computes year of nth birthday
	 */

public class BirthyearFinder {

	public static void main(String[] args) {
		System.out.println("What year were you born?");
		Scanner keyboard = new Scanner(System.in);
		int byr = keyboard.nextInt();
		System.out.println("What age do you want to know the year of.");
		int nxtb = keyboard.nextInt();
		System.out.println("You will turn " + nxtb + " in the year "
				+ (byr + nxtb) + ".");

	}

}
