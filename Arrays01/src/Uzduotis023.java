import java.util.Arrays;

//Exercise 23
//Duotas sveik�j� skai�i� masyvas arrL[n] (n=20). 
//Para�ykite program�, kuri prie� paskutin� masyvo  element� �terpt� pirm�j� masyvo element�.
//Pirmasis elementas turi i�likti. Atspausdinkite tok�  pakeist� masyv� (galima naudoti pagalbin� masyv�). 

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
