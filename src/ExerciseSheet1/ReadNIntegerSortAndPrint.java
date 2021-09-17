package ExerciseSheet1;

import java.util.Arrays;
import java.util.Scanner;

public class ReadNIntegerSortAndPrint {
	

	private static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {

		ReadAndprintIntegerNumbers();
	}

	public static void ReadAndprintIntegerNumbers() {
		
		System.out.print("How many numbers you want to print?");
		int numbers = reader.nextInt();
		int[] listOfNumers = new int[numbers];
		
		for (int i =0 ; i < numbers; i++) {
			int next = i+1;
			System.out.println("what's number " +next + " ?");
			listOfNumers[i] =  reader.nextInt();
			Arrays.sort(listOfNumers);
			
		}
		
			System.out.print(" "+ Arrays.toString(listOfNumers));
		
	}


}
