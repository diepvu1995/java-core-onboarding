package onboarding.java;

import java.util.Scanner;

public class TutSwitch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your command: ");
		String text = input.nextLine();
		switch (text) {
		case "start":
			System.out.println("MU start");
			break;
		case "stop":
			System.out.println("MC stop");
			break;
		default:
			System.out.println("command not recognized!");
		}

	}
}
