import java.util.Arrays;

//Exercise 22
//Duotas sveik�j� skai�i� masyvas arrN[n] (n=20). Para�ykite program�, kuri patikrint� ar �iame  masyve yra neigiam� element�. 
//Jei yra � tai suskai�iuokite kiek j� yra. 
//Jei yra neigiam� element� programos rezultatas: 
//Pirmoje eilut�je � �odis TAIP; 
//Antroje eilut�je � atspausdinti visi neigiami elementai; 
//Tre�ioje eilut�je � neigiam� element� kiekis 
//Jei n�ra neigiam� element� programos rezultatas �odis NE. 

public class Uzduotis022 {
	public static void main(String[] args) {
		int[] arrN = Metodai.randomArray(20, -10, 10);
		int neigiami = 0;
		int counter = 0;
		int[] arrM = new int[arrN.length];
		System.out.println(Arrays.toString(arrN));

		for (int i = 0; i < arrN.length; i++) {
			if (arrN[i] < 0) {
				neigiami++;
				arrM[counter++] = arrN[i];
			}

		}

		if (neigiami >= 1) {
			System.out.println("1. TAIP");
			System.out.print("2. ");
			for (int i = 0; i < counter; i++) {
				System.out.print(arrM[i] + " ");
			}
			System.out.println("");
			System.out.println("3. " + neigiami + " neigiam(i/u) element(ai/u)");
		} else
			System.out.println("NE");
	}
}
