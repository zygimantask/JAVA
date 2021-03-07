//Vidurkis
//
//Write a Java method to compute the average of three numbers.  
//
//Input the first number: 25  
//Input the second number: 45 
//Input the third number: 65 
//The average value is 45.0 


import java.util.Scanner;

public class Metodai05_02 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Iveskite pirmaji skaiciu: ");
		double a = reader.nextDouble();
		System.out.println("Iveskite antraji skaiciu: ");
		double b = reader.nextDouble();
		System.out.println("Iveskite treciaji skaiciu: ");
		double c = reader.nextDouble();
		System.out.printf("Vidrukis yra: %.2f", + avgTrys(a,b,c));
		reader.close();
	}
	
		private static double avgTrys(double d, double e, double f) {
		return ((d + e + f)/3);
	}

}
