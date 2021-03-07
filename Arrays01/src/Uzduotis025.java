import java.util.Arrays;

//Exercise 25 (Kitam kartui)
//Duotas sveikøjø skaièiø masyvas arrP(n) (n=20). 
//Surikiuokite masyvo elementus didëjimo tvarka. Iðbandykite kelis rûðiavimo algoritmus.
//Bubble Sort
//Selection Sort

public class Uzduotis025 {
	public static void main(String[] args) {
		int[] arrS = Metodai.randomArray(20, -200, 200);

		System.out.println("Originali: " + Arrays.toString(arrS));
		bubbleSort(arrS);
		selectionSort(arrS);
	}

	private static void bubbleSort(int[] arrS) {
		boolean sorted = false;
		int temp;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < arrS.length - 1; i++) {
				if (arrS[i] > arrS[i + 1]) {
					temp = arrS[i];
					arrS[i] = arrS[i + 1];
					arrS[i + 1] = temp;
					sorted = false;
				}
			}
		}
		System.out.println("Bubble:    " + Arrays.toString(arrS));
	}

	private static void selectionSort(int[] arrS) {
		for (int i = 0; i < arrS.length; i++) {
			int min = i;
			for (int j = i + 1; j < arrS.length; j++) {
				if (arrS[j] < arrS[min]) {
					min = j;
				}
			}
			int swap = arrS[i];
			arrS[i] = arrS[min];
			arrS[min] = swap;
		}
		System.out.println("Selection: " + Arrays.toString(arrS));
	}
}