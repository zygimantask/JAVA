//Exercise 9
//Sukurkite funkcijà (metodà) random(a, b), kuri gauna dvi reikğmes: intervalo pradşià a ir pabaigà b ir gràşina sugeneruotà (random) skaièiø iğ duoto intervalo.
//Sukurkite masyvà a[n], kur n yra ávedamas iğ klaviatûros. Taip pat áveskite dvi reikğmes: intervalo pradşià ir pabaigà. Atspausdinkite masyvo sugeneruotas reikğmes.

import java.util.Arrays;
import java.util.Scanner;

public class Uzduotis009 {

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

		if ((min > max)) {
			System.out.println("Neteisingai ivestas intervalas");
		} else {
			int[] masyvas = new int[ilgis];
			for (int i = 0; i < ilgis; i++) {
				masyvas[i] = randomSkaicius(min, max);
			}
			System.out.println(Arrays.toString(masyvas));
		}

	}

	private static int randomSkaicius(int min, int max) {
		return (int) (Math.random() * (max - min + 1) + min);

	}

}
