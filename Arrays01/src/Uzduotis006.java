//Exercise 6
//Sukurkite sveik�j� skai�i� masyv� pavadinimu array, kuris gali i�saugoti 6 reik�mes, t.y. n  = 6. Masyvo element� reik�mes priskirkite cikle (�vedama vartotojo). 

import java.util.Arrays;
import java.util.Scanner;

public class Uzduotis006 {

	public static void main(String[] args) {

		int[] arrays = new int[6];

		Scanner reader = new Scanner(System.in);
		System.out.println("Iveskite masyvo elementus");

		for (int i = 0; i < arrays.length; i++) {
			arrays[i] = reader.nextInt();
		}

		reader.close();
		System.out.println(Arrays.toString(arrays));
	}

}
