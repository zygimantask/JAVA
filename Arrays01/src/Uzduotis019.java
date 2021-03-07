//Exercise 19
//Duotas sveikøjø skaièiø masyvas arrZ[n] (n=70). Raskite didþiausià ir maþiausià jo elementus bei jø eilës (indeksà) numerius. 

import java.util.Arrays;

public class Uzduotis019 {
	public static void main(String[] args) {

		int[] arrT = Metodai.randomArray(70, 1, 200);
		Metodai.maxArray(arrT);
		Metodai.minArray(arrT);

		System.out.println(Arrays.toString(arrT));

		for (int i = 0; i < arrT.length; i++) {
			if (arrT[i] == Metodai.maxArray(arrT)) {
				System.out.println(("Didziausia reiksme: " + (i + 1) + " indeksas - " + Metodai.maxArray(arrT)));
			}
		}

		for (int i = 0; i < arrT.length; i++) {
			if (arrT[i] == Metodai.minArray(arrT)) {
				System.out.println(("Maziausia reiksme: " + (i + 1) + " indeksas - " + Metodai.minArray(arrT)));
			}
		}
	}
}