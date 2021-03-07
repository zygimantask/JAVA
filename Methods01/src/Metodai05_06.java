//Penkiakampis
//
//Write a Java method to create the area of a pentagon. Go to the editor
//
//Input the number of sides: 5                             
//Input the side: 6                                        
//The area of the pentagon is 61.93718642120281
//
//Pastaba: rezultatà pateikite trijø skaièiø po kablelio tikslumu.

import java.util.Scanner;
public class Metodai05_06 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Krastiniu skaicius: 5");
		System.out.println("Iveskite krastine: ");
		double a = reader.nextInt();
		System.out.printf("Result: %.3f", + getPlotas(a));
		reader.close();

	}
	
	private static double getPlotas(double e) {
		double s = Math.pow(e, 2)*((Math.sqrt(25 + 10 * Math.sqrt(5)))/4); 
		return s;
	}

}
