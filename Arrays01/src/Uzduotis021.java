import java.util.Arrays;

//Exercise 21
//Duotas studentø skaièius n (n=30) ir jø egzamino paþymiai, kurie suraðyti á masyvà pazymiai[n]. 
//Apskaièiuokite kiek studentø neiðlaikë egzamino ir koks yra paþangiø studentø paþymiø vidurkis. 
//Jei  studentas uþ egzaminà gavo paþymá 4 ar didesná – jis paþangus. 

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
		System.out.printf("Paþangiø studentø paþymiø vidurkis: " + "%.2f", vidurkis);

	}
}
