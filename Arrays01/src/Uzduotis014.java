//Exercise 14
//Duotas sveik�j� skai�i� masyvas arrF[n] (n=25). 
//Para�ykite program�, kuri sukeist� �io masyvo k-t�j� element� su m-tuoju vietomis ir atspausdint� tok� pakeist� masyv�. 

import java.util.Arrays;
import java.util.Scanner;

public class Uzduotis014 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		System.out.print("Iveskite k elementa: ");
		int elementasK = reader.nextInt();
		System.out.print("Iveskite m elementa: ");
		int elementasM = reader.nextInt();
		System.out.println("");
		reader.close();

		int[] masyvas = Metodai.randomArray(25, -20, 20);

		System.out.println(Arrays.toString(masyvas));
		System.out.println("K elementas: ");
		System.out.println(masyvas[elementasK - 1]);
		System.out.println("M elementas: ");
		System.out.println(masyvas[elementasM - 1]);

		int temp1 = (masyvas[elementasK - 1]);
		int temp2 = (masyvas[elementasM - 1]);

		masyvas[elementasK - 1] = temp2;
		masyvas[elementasM - 1] = temp1;
		System.out.println(Arrays.toString(masyvas));

	}

}
