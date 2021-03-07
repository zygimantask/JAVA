import java.util.Arrays;

//Exercise 23
//Duotas sveikøjø skaièiø masyvas arrL[n] (n=20). 
//Paraðykite programà, kuri prieð paskutiná masyvo  elementà áterptø pirmàjá masyvo elementà.
//Pirmasis elementas turi iðlikti. Atspausdinkite toká  pakeistà masyvà (galima naudoti pagalbiná masyvà). 

public class Uzduotis023 {
	public static void main(String[] args) {
		int[] arrL = Metodai.randomArray(20, -20, 20);
		int[] arrJ = new int[arrL.length + 1];
		int temp = 0;
		System.out.println(Arrays.toString(arrL));

		for (int i = 0; i < arrL.length; i++) {
			arrJ[i] = arrL[i];
			temp = arrL[0];
		}

		System.out.println(temp);

		int priesPaskutinis = arrL[arrL.length - 1];

		for (int i = 0; i < arrJ.length; i++) {
			if (arrJ[i] == priesPaskutinis) {
				arrJ[i + 1] = temp;
			}
		}

		int temp2 = arrJ[20]; // 21
		arrJ[20] = arrJ[19]; // is 21 keliam i 20
		arrJ[19] = temp2; // 20
		System.out.println(Arrays.toString(arrJ));

	}

}
