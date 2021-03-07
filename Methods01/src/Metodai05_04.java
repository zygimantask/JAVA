//Keliamieji metai
//Write a Java method to check whether a year (integer) entered by the user is a leap year  or not. 
//
//Input a year: 2017  
//Result: false 


import java.util.Scanner;

public class Metodai05_04 {

	public static void main(String [] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Iveskite metus: ");
		int Metai = reader.nextInt();
		System.out.println("Result: " + getLeap(Metai));
		reader.close();
	}
	
	private static boolean getLeap(int y) {
		boolean a = (y % 4 == 0) ? true:false;
		return a;
	}
}