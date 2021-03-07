//Exercise 11
//Duotas sveik�j� skai�i� masyvas arrB[n] (n=20). 
//Para�ykite program�, kuri suskai�iuot� kiek masyve  yra skai�i�, kurie dalinasi i� trij� 
//bei apskai�iuot� masyvo element�, kurie dalijasi i� 3 sum�. 

import java.util.Arrays;
import java.util.Scanner;

public class Uzduotis011 {

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
		int suma = 0;

		if ((min > max)) {
			System.out.println("Neteisingai ivestas intervalas");
		} else {
			int[] masyvas = new int[ilgis];
			for (int i = 0; i < ilgis; i++) {
				masyvas[i] = randomSkaicius(min, max);
				if (masyvas[i] % 3 == 0) {
					counter++;
					suma += masyvas[i];
				}
			}
			System.out.println(Arrays.toString(masyvas));
			System.out.println("Masyve yra skaiciu, kurie dalijasi is triju: " + counter);
			System.out.println("Masyve esanciu skaiciu, kurie dalijasi is triju, suma: " + suma);
		}
	}

	private static int randomSkaicius(int min, int max) {
		return (int) (Math.random() * (max - min + 1) + min);

	}

}
