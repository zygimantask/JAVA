//Exercise 6
//Sukurkite sveikøjø skaièiø masyvà pavadinimu array, kuris gali iðsaugoti 6 reikðmes, t.y. n  = 6. Masyvo elementø reikðmes priskirkite cikle (ávedama vartotojo). 

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
