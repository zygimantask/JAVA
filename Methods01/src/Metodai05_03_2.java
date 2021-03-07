//Pastaba: galite patobulinti uşdaviná, kad rastø ne tik dvişenklio, bet ir n-şenklio skaièiaus skaitmenø sumà.

import java.util.Scanner;

public class Metodai05_03_2 {
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Iveskite sveikaji skaiciu: ");
		int a = reader.nextInt();
		System.out.println("Skaitmenu suma: " + getSum(a));
		reader.close();
	}
	
	private static int getSum(int e) {
				int suma = 0;
				while (e>0) {
					suma += e % 10;
					e = e / 10;
					
				}
				return suma;
	}
}

