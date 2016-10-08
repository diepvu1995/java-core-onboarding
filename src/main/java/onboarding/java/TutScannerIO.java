package onboarding.java;

import java.util.Scanner;

public class TutScannerIO {
	public static void main(String[] args) {
		// create scanner object
		Scanner input = new Scanner(System.in);

		// output the prompt
		System.out.println("Enter a line of next: ");

		// wait the user to enter a line of next
		String line = input.nextLine();
		// int value = input.nextInt();

		// tell them what they entered
		System.out.println("Your entered: " + line);
	}
}
