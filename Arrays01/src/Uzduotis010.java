//Exercise 10
//Patikrinkite ar sveikøjø skaièiø masyve arrA[n] (n=12) yra nors vienas elementas lygus 0. Jei yra tai  suskaièiuokite kiek jø yra. 

import java.util.Arrays;
import java.util.Scanner;

public class Uzduotis010 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.print("Iveskite masyvo ilgi: ");
		int ilgis = reader.nextInt();
		System.out.print("Iveskite intervalo pradzios skaiciu: ");
		int min = reader.nextInt();
		System.out.print("Iveskite intervalo pabaigos skaiciu: ");
		int max = reader.nextInt();
		System.out.println("");
		reader.close();
		
		int counter = 0;

		if ((min > max)) {
			System.out.println("Neteisingai ivestas intervalas");
		} else {
			int[] masyvas = new int[ilgis];
			for (int i = 0; i < ilgis; i++) {
				masyvas[i] = randomSkaicius(min, max);
				if (masyvas[i] == 0) {
					counter++;
				}
			}
			System.out.println(Arrays.toString(masyvas));
			System.out.println("Masyve yra nuliu: " + counter);
		}
	}

	private static int randomSkaicius(int min, int max) {
		return (int) (Math.random() * (max - min + 1) + min);

	}

}
