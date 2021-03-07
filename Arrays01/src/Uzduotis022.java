import java.util.Arrays;

//Exercise 22
//Duotas sveikøjø skaièiø masyvas arrN[n] (n=20). Paraðykite programà, kuri patikrintø ar ðiame  masyve yra neigiamø elementø. 
//Jei yra – tai suskaièiuokite kiek jø yra. 
//Jei yra neigiamø elementø programos rezultatas: 
//Pirmoje eilutëje – þodis TAIP; 
//Antroje eilutëje – atspausdinti visi neigiami elementai; 
//Treèioje eilutëje – neigiamø elementø kiekis 
//Jei nëra neigiamø elementø programos rezultatas þodis NE. 

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
