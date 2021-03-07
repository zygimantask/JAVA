//Exercise 7
//Sukurkite du sveikøjø skaièiø masyvus, kuriø pavadinimai arr1 ir arr2 ir jie gali iðsaugoti po  5 reikðmes, t.y. n = 5. Masyvo elementø reikðmes priskirkite cikle (ávedama vartotojo). Sudëkite tose paèiose masyvø vietose esanèias elementø reikðmes ir jas atspausdinkite. 
//Jeigu pirmojo masyvo elementø reikðmës: 1, 2, 3, 4, 5, o antrojo: 5, 4, 3, 2, 1, tai programa  spausdina: 6, 6, 6, 6, 6. 


import java.util.Arrays;
import java.util.Scanner;

public class Uzduotis007 {

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
			arr3[i] = arr1[i] + arr2[i];
		}

		reader.close();

		System.out.println(Arrays.toString(arr3));

	}

}
