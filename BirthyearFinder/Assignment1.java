import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		System.out.println("What year were you born?");
		Scanner keyboard = new Scanner(System.in);
		int byr = keyboard.nextInt();
		System.out.println("What age do you want to know the year of.");
		int nxtb = keyboard.nextInt();
		System.out.println("You will turn "+nxtb+" in the year "+(byr+nxtb)+".");

	}

}
