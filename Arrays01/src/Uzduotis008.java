//Exercise 8
//Sukurkite tris sveikøjø skaièiø masyvus, kuriø pavadinimai arr1, arr2, arr3 ir jie gali  iðsaugoti po 5 reikðmes, t.y. n = 5. Masyvø arr1 ir arr2 elementø reikðmes priskirkite cikle  (ávedama vartotojo). Masyvo arr3 elementø reikðmës bus kitø dviejø masyvø atitinkamø  elementø reikðmiø sandaugos, t.y. arr3[0] = arr1[0] * arr2[0]. Veiksmus atlikite cikle ir  atspausdinkite masyvo arr3 elementø reikðmes. 
//Jeigu pirmojo masyvo elementø reikðmës: 1, 1, 1, 1, 1, o antrojo: 5, 4, 3, 2, 1, tai treèiojo  masyvo elementø reikðmës: 5, 4, 3, 2, 1


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
