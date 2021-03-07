//Exercise 12
//Paraðykite programà, kuri masyvo arrC[n] (n=30), k-tàjá (ávedama vartotojo) elementà pakeistø reikðme 100. Atspausdinkite ðá pakeistà masyvà. 

import java.util.Arrays;
import java.util.Scanner;

public class Uzduotis012 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.print("Iveskite masyvo ilgi: ");
		int ilgis = reader.nextInt();
		System.out.print("Iveskite intervalo pradzios skaiciu: ");
		int min = reader.nextInt();
		System.out.print("Iveskite intervalo pabaigos skaiciu: ");
		int max = reader.nextInt();
		System.out.print("Iveskite masyvo elemento numeri, kuri norite pakeisti: ");
		int keitimas = reader.nextInt();
		System.out.println("");
		reader.close();

		int[] arrC = new int[ilgis];

		if ((min > max)) {
			System.out.println("Neteisingai ivestas intervalas");
		} else {
			for (int i = 0; i < ilgis; i++) {
				arrC[i] = randomSkaicius(min, max);
				if (arrC[i] == arrC[keitimas - 1]) {
					arrC[i] = 100;
				}
			}
			System.out.println(Arrays.toString(arrC));
		}
	}

	private static int randomSkaicius(int min, int max) {
		return (int) (Math.random() * (max - min + 1) + min);

	}

}
