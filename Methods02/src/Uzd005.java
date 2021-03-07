//Pradiniai duomenys – natûraliøjø skaièiø seka. 
//Sekos pabaigos poşymis – nulis.  Parağykite programà, kuri suskaièiuotø kiek sekoje yra skaièiø,
//kuriø kiekvieno uşrağe duotasis skaitmuo m pasikartoja lygiai po du kartus.  
//Metodas – skaièiuojantis, kelis kartus viename skaièiuje pasikartoja duotasis skaitmuo  m.  
//Pasitikrinimui: jei m=9 ir seka 2; 36; (9)0(9); 12; 45; 10(9)(9); 3(9)(9); 0, tuomet ieğkomas kiekis  lygus 3. 

import java.util.Scanner;

public class Uzd005 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
		int m = 9;

		int num;
		
		int counter = 0;

		while (true) {
			System.out.println("Iveskite skaiciø: ");
			num = reader.nextInt();
			if (num == 0) {
				break;
			}

			if (kiekSk(num, m)==2) {
				counter++;
			}
		}
		
		System.out.println(kiekSk(num,m) + " kartà/us");

		reader.close();
	}

	private static int kiekSk(int a, int m) {

		int count = 0;
		
		while (a > 0) {
			
			if (a % 10 == 9) {
				count++;
			}
			a = a / 10;
		}
		return count;
	}

}
