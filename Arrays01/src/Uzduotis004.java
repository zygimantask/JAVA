//Exercise 4
//Sukurkite sveikøjø skaièiø masyvà pavadinimu array, kuris gali iðsaugoti 10 reikðmiø, t.y. n  = 10. Reikðmes masyvui suteikite ið karto – inicijuokite: array = [2, 5, 6…]. Masyvo  elementus atspausdinkite naudodami ciklà for. 

public class Uzduotis004 {

	public static void main(String[] args) {

		int[] array = { 2, 5, 6, 8, 9, 20, 33, 23, 92, 200 };

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
