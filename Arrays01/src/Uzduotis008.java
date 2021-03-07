//Exercise 8
//Sukurkite tris sveik�j� skai�i� masyvus, kuri� pavadinimai arr1, arr2, arr3 ir jie gali  i�saugoti po 5 reik�mes, t.y. n = 5. Masyv� arr1 ir arr2 element� reik�mes priskirkite cikle  (�vedama vartotojo). Masyvo arr3 element� reik�m�s bus kit� dviej� masyv� atitinkam�  element� reik�mi� sandaugos, t.y. arr3[0] = arr1[0] * arr2[0]. Veiksmus atlikite cikle ir  atspausdinkite masyvo arr3 element� reik�mes. 
//Jeigu pirmojo masyvo element� reik�m�s: 1, 1, 1, 1, 1, o antrojo: 5, 4, 3, 2, 1, tai tre�iojo  masyvo element� reik�m�s: 5, 4, 3, 2, 1


import java.util.Arrays;
import java.util.Scanner;

public class Uzduotis008 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		int[] arr1 = new int[5];
		int[] arr2 = new int[5];
		int[] arr3 = new int[5];

		System.out.println("Iveskite pirmojo masyvo penkis elementus");

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = reader.nextInt();
		}

		System.out.println("Iveskite antrojo masyvo penkis elementus");

		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = reader.nextInt();
		}

		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = arr1[i] * arr2[i];
		}

		reader.close();

		System.out.println(Arrays.toString(arr3));

	}

}
