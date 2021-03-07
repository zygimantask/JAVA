//Exercise 14
//Duotas sveikøjø skaièiø masyvas arrF[n] (n=25). 
//Paraðykite programà, kuri sukeistø ðio masyvo k-tàjá elementà su m-tuoju vietomis ir atspausdintø toká pakeistà masyvà. 

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
