import java.util.Arrays;

//Exercise 21
//Duotas student� skai�ius n (n=30) ir j� egzamino pa�ymiai, kurie sura�yti � masyv� pazymiai[n]. 
//Apskai�iuokite kiek student� nei�laik� egzamino ir koks yra pa�angi� student� pa�ymi� vidurkis. 
//Jei  studentas u� egzamin� gavo pa�ym� 4 ar didesn� � jis pa�angus. 

public class Uzduotis021 {
	public static void main(String[] args) {
		int[] pazymiai = Metodai.randomArray(30, 1, 10);

		double kiekis = 0;
		int pazangus = 0;
		int nepazangus = 0;
		double vidurkis = 0;

		System.out.println(Arrays.toString(pazymiai));

		for (int i = 0; i < pazymiai.length; i++) {
			if (pazymiai[i] < 4) {
				nepazangus++;
			}
		}

		System.out.println(nepazangus + " - neislaike egzamino");

		for (int i = 0; i < pazymiai.length; i++) {
			if (pazymiai[i] >= 4) {
				kiekis += pazymiai[i];
				pazangus++;
			}
		}
		
		System.out.println(pazangus + " - pazangus");
		vidurkis = kiekis / pazangus;
		System.out.printf("Pa�angi� student� pa�ymi� vidurkis: " + "%.2f", vidurkis);

	}
}
