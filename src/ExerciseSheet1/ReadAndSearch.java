package ExerciseSheet1;

import java.util.Scanner;

public class ReadAndSearch {
	private static Scanner reader = new Scanner(System.in);
	static boolean status = false;

	public static void main(String[] args) {

		ReadAndprintIntegerNumbers();
	}

	public static void ReadAndprintIntegerNumbers() {

		System.out.print("How many numbers you want to enter?");
		int numbers = reader.nextInt();
		int[] listOfNumers = new int[numbers];

		for (int i = 0; i < numbers; i++) {
			int next = i + 1;
			System.out.println("what's number " + next + " ?");
			listOfNumers[i] = reader.nextInt();

		}

		System.out.println("what is number you want to find?");
		int numbersfind = reader.nextInt();
		for (int i = 0; i < numbers; i++) {
			if (listOfNumers[i] == numbersfind) {

				System.out.print("The number you searchead exists and is in position " + i);
				status = true;
			}

		}

		if (status == false) {
			System.out.println("The number you searchead does not nexist ");

		}

	}
}
