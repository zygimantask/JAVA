//Exercise 5
//Sukurkite sveikøjø skaièiø masyvà pavadinimu array, kuris gali iðsaugoti 15 reikðmiø, t.y. n  = 15. Reikðmes masyvui suteikite ið karto – inicijuokite: array = [1, 2, 3…]. Prie kiekvienos masyvo elemento reikðmës pridëkite dydá x. Dydis x yra ávedamas vartotojo. 
//Jeigu dydis x = 5 ir masyvo elementø reikðmës: 1, 2, 3, ..., 1, tai programa atspausdina:  6, 7, 8, ..., 6. 


import java.util.Arrays;
import java.util.Scanner;

public class Uzduotis005 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };

		System.out.println("Iveskite dydi x:");
		int dydis = reader.nextInt();
		reader.close();

		for (int i = 0; i < array.length; i++) {
			array[i] = array[i] + dydis;
		}
		System.out.println(Arrays.toString(array));

	}

}
