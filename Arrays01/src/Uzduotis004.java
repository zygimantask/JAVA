//Exercise 4
//Sukurkite sveik�j� skai�i� masyv� pavadinimu array, kuris gali i�saugoti 10 reik�mi�, t.y. n  = 10. Reik�mes masyvui suteikite i� karto � inicijuokite: array = [2, 5, 6�]. Masyvo  elementus atspausdinkite naudodami cikl� for. 

public class Uzduotis004 {

	public static void main(String[] args) {

		int[] array = { 2, 5, 6, 8, 9, 20, 33, 23, 92, 200 };

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
