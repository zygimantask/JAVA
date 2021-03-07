//Trikampis
//
//Write Java methods to calculate the area of a triangle.  
//http://www.mat.lt/matematikos-formules/figuru-plotai/trikampio-plotas-pagal-krastines.html
//
//
//Input Side-1: 10  
//Input Side-2: 15  
//Input Side-3: 20  
//The area of the triangle is 72.6184377413890
//
//Pastaba: rezultatà pateikite dviejø skaièiø po kablelio tikslumu.


import java.util.Scanner;

public class Metodai05_05 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Iveskite pirmaja krastine: ");
		int a = reader.nextInt();
		System.out.println("Iveskite antraja krastine: ");
		int b = reader.nextInt();
		System.out.println("Iveskite treciaja krastine: ");
		int c = reader.nextInt();
		System.out.printf("Result: %.2f", + getPlotas(a, b, c));
		reader.close();

	}
	
	private static double getPlotas(double e, double f, double  g) {
		double p = ((e + f + g)/2);
		double s = Math.sqrt(p*((p-e)*(p-f)*(p-g)));
		return s;
	}
}
