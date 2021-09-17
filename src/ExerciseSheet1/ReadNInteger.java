package ExerciseSheet1;

import java.util.Scanner;


public class ReadNInteger {

	private static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {

		ReadAndprintIntegerNumbers();
	}

	public static void ReadAndprintIntegerNumbers() {
		
		System.out.print("How many numbers you want to print?");
		int numbers = reader.nextInt();
		int[] listOfNumers = new int[numbers];
		
		for (int i =0 ; i < numbers; i++) {
			
			System.out.println("what's number "+i+1+ " ?");
			int interetedNumber = reader.nextInt();
			listOfNumers[i] = interetedNumber;
			
			
		}
		for (int i =0 ; i < numbers; i++) {
			System.out.print(" "+ listOfNumers[i]);
		
	}}
}
