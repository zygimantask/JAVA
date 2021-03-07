//Mažiausias skaičius
//
//Write a Java method to find the smallest number among three numbers.  
//
//Input 1: 25 
//Input 2: 37 
//Input 3: 29  
//The smallest value is 25


import java.util.Scanner;

public class Metodai05_01 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Iveskite pirmaji skaiciu: ");
		int a = reader.nextInt();
		System.out.println("Iveskite antraji skaiciu: ");
		int b = reader.nextInt();
		System.out.println("Iveskite treciaji skaiciu: ");
		int c = reader.nextInt();
		System.out.println("Maziausias: " + maziausias(a, b, c));
		reader.close();
		
	}
	
	private static int maziausias(int e, int f, int g) {
		return Math.min(Math.min(e, f), g);
	}
	}