import java.util.Arrays;

//Exercise 18
//Duotas sveik�j� skai�i� masyvas arrT[n] (n=40). �io masyvo elementus patalpinkite � nauj� masyv� 
//prad�ioje sura�ydami neigiamus elementus, toliau � nulinius ir teigiamus. Sur��iuoti nereikia.
//
//prie� 2 5 - 9 0 6 - 8 4 -11 -20
//po -9 -8 -11 -20 0 2 5 6 4

public class Uzduotis018 {
	public static void main(String[] args) {

		int[] arrT = Metodai.randomArray(40, -20, 20);
		System.out.println(Arrays.toString(arrT));

		int k = 0;
		int[] arrJ = new int[arrT.length];

		for (int i = 0; i < arrT.length; i++) {
			if (arrT[i] < 0) {
				arrJ[k] = arrT[i];
				k++;
			}
		}

		for (int i = 0; i < arrT.length; i++) {
			if (arrT[i] == 0) {
				arrJ[k] = arrT[i];
				k++;
			}
		}

		for (int i = 0; i < arrT.length; i++) {
			if (arrT[i] > 0) {
				arrJ[k] = arrT[i];
				k++;
			}
		}
		System.out.println(Arrays.toString(arrJ));
	}

}
