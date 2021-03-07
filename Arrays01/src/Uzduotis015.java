//Exercise 15
//Duotas n=200 prekiø kainø (double) masyvas prekes[n].
//Prekës, kuriø kaina maþesnë uþ kainø vidurká, pabranginamos p procentø. 
//Paraðykite programà vidutinei prekiø kainai po pabrangimo apskaièiuoti. 

import java.util.Arrays;
import java.util.Scanner;

public class Uzduotis015 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		System.out.println("Iveskite intervalo pradzios skaiciu: ");
		double min = reader.nextDouble();
		System.out.println("Iveskite intervalo pabaigos skaiciu: ");
		double max = reader.nextDouble();
		System.out.println("Iveskite procentus: ");
		double procentai = reader.nextDouble();
		System.out.println("");

		reader.close();

		int n = 200;
		double vidurkis;
		double suma = 0;

		double[] masyvas = new double[n];
		for (int i = 0; i < n; i++) {
			masyvas[i] = randomSkaicius(min, max);
		}
		System.out.println("Kainos pries pabrangima");
		System.out.println(Arrays.toString(masyvas));

		for (int i = 0; i < n; i++) {
			suma = masyvas[i] + suma;
		}
		System.out.println("Suma: " + suma);
		vidurkis = suma / n;
		System.out.println("Vidurkis: " + vidurkis);
		
		for (int i = 0; i < n; i++) {
			if (masyvas[i] < vidurkis ) {
				masyvas[i] = ((masyvas[i] * procentai)/100) + masyvas[i];
			}
		}
		System.out.println("Kainos po pabrangimo");
		System.out.println(Arrays.toString(masyvas));
	}


	private static double randomSkaicius(double min, double max) {
		return (double) (Math.random() * (max - min + 1) * min);

	}

}