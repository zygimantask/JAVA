//Exercise 13
//Duotas sveik�j� skai�i� masyvas arrD[n] (n=20).
//Para�ykite program�, kuri �io masyvo teigiamus  elementus sura�yt� �
//masyv� arrE[m] ir atspausdint� �� masyv�. 



import java.util.Scanner;

public class Uzduotis013 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.print("Iveskite intervalo pradzios skaiciu: ");
		int min = reader.nextInt();
		System.out.print("Iveskite intervalo pabaigos skaiciu: ");
		int max = reader.nextInt();
		System.out.println("");
		reader.close();

		int n = 20;

		int[] arrD = new int[n];
		int[] arrE = new int[n];
		for (int i = 0; i < n; i++) {
			arrD[i] = randomSkaicius(min, max);
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arrD[i] + " ");
		}
		System.out.println();
		int counter = 0;
		for (int i = 0; i < arrD.length; i++) {

			if (arrD[i] > 0) {
				arrE[counter++] = arrD[i];
			}
		}

		for (int i = 0; i < counter; i++) {
			System.out.print(arrE[i] + " ");
		}
		System.out.println();
	}

	private static int randomSkaicius(int min, int max) {
		return (int) (Math.random() * (max - min + 1) + min);

	}

}
