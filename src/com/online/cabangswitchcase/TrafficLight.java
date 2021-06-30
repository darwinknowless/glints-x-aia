package com.online.cabangswitchcase;

//import
import java.util.Scanner;

//block class
public class TrafficLight {
	// method
	public static void main(String[] args) {
		// create var & scanner
		String lamp;
		Scanner scan = new Scanner(System.in);

		// input
		System.out.print("Input color name: ");
		lamp = scan.nextLine();

		// block switch-case
		switch (lamp) {
		case "red":
			System.out.println("Red lights, STOP!");
			break;
		case "yellow":
			System.out.println("Yellow lights, CAREFULLY!");
			break;
		case "green":
			System.out.println("Green lights, MOVE!");
			break;
		default:
			System.out.println("Lamps color incorrect!");
		}
	}
}
