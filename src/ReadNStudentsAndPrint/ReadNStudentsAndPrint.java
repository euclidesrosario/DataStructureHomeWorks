package ReadNStudentsAndPrint;

import java.util.Arrays;
import java.util.Scanner;

public class ReadNStudentsAndPrint {

	private static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		saveStudants();
	}

	public static void saveStudants() {
		System.out.println("how many studants you want save?");
		int number = reader.nextInt();
		Studant[] studants = new Studant[number];


		for (int i = 0; i < number; i++) {
			 studants[i] = new Studant() ;

			System.out.println("enter code of student number "+i);
			studants[i].setCodigo(reader.nextInt());
			
			
			System.out.println("enter name of student number "+i);
			studants[i].setNome(reader.next());

			
			System.out.println("enter age of student number "+i);
			studants[i].setIdade(reader.nextInt());

		}
		System.out.print(Arrays.toString(studants));
		
	}
}
