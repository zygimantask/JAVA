//Exercise 16
//Paraðykite programà, kuri paðalintø masyvo arrG[n] (n=20) k-tàjá elementà, 
//suraðant reikiamus  elementus á naujà masyvà arrH[n-1]. Atspausdinkite masyvà arrH[n-1]. 




import java.util.Arrays;
import java.util.Scanner;

public class Uzduotis016 {

	public static void main(String[] args) {

		int[] masyvas = Metodai.randomArray(20, -10, 20);

		System.out.println("Random masyvas: " + Arrays.toString(masyvas));

		Scanner reader = new Scanner(System.in);

		System.out.println("Iveskite elemento numeri, kuri norite panaikinti: ");

		int k = reader.nextInt();

		int[] masyvas2 = new int[masyvas.length - 1];

		for (int i = 0; i < masyvas.length; i++) {
			if (i < k - 1) {
				masyvas2[i] = masyvas[i];
			} else if (i < masyvas.length - 1) {
				masyvas2[i] = masyvas[i + 1];
			}
		}
		System.out.println("Masyvas be k elemento: " + Arrays.toString(masyvas2));
		reader.close();
	}
}
