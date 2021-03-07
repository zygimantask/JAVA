//Skaitmenų suma
//Write a Java method to compute the sum of the digits in an integer.  
//
//Input an integer: 25 
//The sum is 7.
//
//Pastaba: galite patobulinti uždavinį, kad rastų ne tik dviženklio, bet ir n-ženklio skaičiaus skaitmenų sumą.

import java.util.Scanner;

public class Metodai05_03_0 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Iveskite sveikaji skaiciu: ");
		int a = reader.nextInt();
		System.out.println("Skaitmenu suma: " + getSum(a));
		reader.close();
	}
	
	private static int getSum(int e) {
		return ((e / 10)+(e % 10));
	}
}